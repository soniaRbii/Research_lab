package com.example.demo.services;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Publication;

public interface IPublicationService {
	
	// Crud sur les membres
	public Publication addPublication(Publication m);

	public void deletePublication(Long id);

	public Publication updatePublication(Publication p);

	public Publication findPublication(Long id);

	public List<Publication> findAll();
	
	// Filtrage par propriété
	
	public Publication findByTitre (String titre);
	
	public Publication findByLien (String lien);
	
	public List<Publication> findByType(String type);
	
	public List<Publication> findByDate(Date date);
}
