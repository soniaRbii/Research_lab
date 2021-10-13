package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Evenement;

public interface EvenementService {

	public Evenement addEvenement(Evenement m);

	public void deleteEvenement(Long id);

	public Evenement updateEvenement(Evenement p);

	public Evenement findEvenement(Long id);

	public List<Evenement> findAll();

	public Evenement findByTitre(String cin);
	public Evenement findByLieu(String lieu);

}