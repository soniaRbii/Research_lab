package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.service.IMemberService;

@SpringBootApplication
public class MembreMsApplication implements CommandLineRunner {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	IMemberService memberService;

	public static void main(String[] args) {
		SpringApplication.run(MembreMsApplication.class, args);
	}

	public void run(String... args) throws Exception {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-DD");

		Date date1 = dateFormatter.parse("2021-06-11");

		Membre et1 = new Etudiant();
		Membre et2 = new Etudiant();

		et1.setNom("ISMAIL");
		et1.setPrenom("Aya");
		et1.setCin("1234");
		et1.setEmail("aya.ismail@enis.tn");

		et2.setNom("rbii");
		et2.setPrenom("SONYA");
		et2.setCin("987");

		Membre enseignant1 = new EnseignantChercheur();
		enseignant1.setNom("ISMAIL");
		enseignant1.setPrenom("meriam");
		enseignant1.setCin("758");
		enseignant1.setEmail("aya.ismail@enis.tn");
		enseignant1.setDateNaissancd(date1);
		enseignant1.setPassword("passwod");
		enseignant1.setPhoto(null);
		

		memberRepository.save(et1);
		memberRepository.save(et2);
		memberRepository.save(enseignant1);
		
		Membre m = memberService.findMember(1L);

		m.setCv("cv1.pdf");
		memberService.updateMember(m);


		memberService.AffectEtudiantToEnseignant(1L, 3L);
		
		memberService.findByEncadrant(3L);
		

	}

}
