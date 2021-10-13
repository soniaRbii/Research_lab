package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entities.Evenement;

@Service
public class EvenementImpl implements EvenementService {
	@Autowired
	EvenementRepository EvenementRepository;

	@Override
	public Evenement addEvenement(Evenement e) {
		EvenementRepository.save(e);
		return e;

	}

	@Override
	public void deleteEvenement(Long id) {
		EvenementRepository.deleteById(id);

	}

	@Override
	public Evenement updateEvenement(Evenement p) {
		EvenementRepository.saveAndFlush(p);
		return p;
	}

	@Override
	public Evenement findEvenement(Long id) {
		Evenement m = EvenementRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Evenement> findAll() {
		List<Evenement> e = EvenementRepository.findAll();

		return e;
	}

	@Override
	public Evenement findByTitre(String titre) {
		Evenement m = EvenementRepository.findByTitre(titre);
		return m;
	}

	@Override
	public Evenement findByLieu(String lieu) {
		Evenement m = EvenementRepository.findByLieu(lieu);
		return m;
	}

}
