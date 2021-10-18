package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Publication;
import com.example.demo.services.IPublicationService;

@RestController
public class PublicationRestController {
	@Autowired
	IPublicationService publicationService;

	@RequestMapping(value = "/publications", method = RequestMethod.GET)
	public List<Publication> findPublications() {
		return publicationService.findAll();
	}
	@GetMapping(value = "/publication/{id}")
	public Publication findOneMemberById(@PathVariable Long id) {
		return publicationService.findPublication(id);
	}
	@GetMapping(value = "/publication/search/titre")
	public Publication findOneMemberByTitre(@RequestParam String titre) {
		return publicationService.findByTitre(titre);
	}
	@GetMapping(value = "/publication/search/lien")
	public Publication findOneMemberByLien(@RequestParam String lien) {
		return publicationService.findByLien(lien);
	}
	@PostMapping(value = "/publication")
	public Publication addPublication(@RequestBody Publication pub) {
		return publicationService.addPublication(pub);
	}
	@DeleteMapping(value = "/publications/{id}")
	public void deletePublication(@PathVariable Long id) {
		publicationService.deletePublication(id);
	}
	@PutMapping(value = "/publications/{id}")
	public Publication updatemembre(@PathVariable Long id, @RequestBody Publication p) {
		p.setId(id);
		return publicationService.updatePublication(p);
	}





}
