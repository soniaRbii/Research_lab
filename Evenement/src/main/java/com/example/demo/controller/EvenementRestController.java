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

import com.example.demo.entities.Evenement;
import com.example.demo.service.EvenementService;

@RestController
public class EvenementRestController {
	@Autowired
	EvenementService EvenementService;

	@RequestMapping(value = "/Evenements", method = RequestMethod.GET)
	public List<Evenement> findEvenements() {
		return EvenementService.findAll();
	}

	@GetMapping(value = "/Evenements/{id}")

	public Evenement findOneEvenementById(@PathVariable Long id) {

		return EvenementService.findEvenement(id);
	}

	@GetMapping(value = "/Evenements/search/titre")

	public Evenement findOneEvenementByTitre(@RequestParam String titre)

	{
		return EvenementService.findByTitre(titre);
	}

	@PostMapping(value = "/Evenement")

	public Evenement addEvenement(@RequestBody Evenement e)

	{
		return EvenementService.addEvenement(e);
	}

	@DeleteMapping(value = "/Evenements/{id}")

	public void deleteEvenement(@PathVariable Long id)

	{

		EvenementService.deleteEvenement(id);

	}

	@PutMapping(value = "/Evenements/{id}")

	public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement p)

	{

		p.setId(id);
		return EvenementService.updateEvenement(p);

	}

}