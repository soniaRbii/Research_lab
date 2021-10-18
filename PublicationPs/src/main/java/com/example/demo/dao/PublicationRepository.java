package com.example.demo.dao;
//type=>list titre=>obj date=>list

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
	
	Publication findByTitre (String titre);
	Publication findByLien (String lien);
	List<Publication> findByType(String type);
	List<Publication> findByDate(Date date);
}
