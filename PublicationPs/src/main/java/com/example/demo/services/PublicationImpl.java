package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;

@Service
public class PublicationImpl implements IPublicationService {
	@Autowired
	PublicationRepository publicationRepository;

	@Override
	public Publication addPublication(Publication p) {
		return publicationRepository.save(p);
	}

	@Override
	public void deletePublication(Long id) {
		publicationRepository.deleteById(id);
		
	}

	@Override
	public Publication updatePublication(Publication p) {
		return publicationRepository.saveAndFlush(p);
	}
	
	@Override
	public Publication findPublication(Long id) {
		Publication p = publicationRepository.findById(id).get();
		return p;
	}

	@Override
	public List<Publication> findAll() {
		return publicationRepository.findAll();
	}

	@Override
	public Publication findByTitre(String titre) {
		return publicationRepository.findByTitre(titre);
	}

	@Override
	public Publication findByLien(String lien) {
		return publicationRepository.findByLien(lien);
	}

	@Override
	public List<Publication> findByType(String type) {
		return publicationRepository.findByType(type);
	}

	@Override
	public List<Publication> findByDate(Date date) {
		return publicationRepository.findByDate(date);
	}

}
