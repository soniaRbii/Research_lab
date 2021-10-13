package com.example.demo;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entities.Evenement;
import com.example.demo.service.EvenementService;

@SpringBootApplication
public class EvenementApplication  implements CommandLineRunner {
	@Autowired
	EvenementRepository evenementRepository;
	@Autowired
	EvenementService  evenementService;

	public static void main(String[] args) {
		SpringApplication.run(EvenementApplication.class, args);
	}

	public void run(String... args) throws Exception {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-DD");

		Date date1 = dateFormatter.parse("2021-06-11");
		System.out.print("hello");

		Evenement et1 = new Evenement("events",null,"sfax");
		Evenement et2 = new Evenement();

		et1.setTitre("event1");
		et1.setLieu("sfax");
		et1.setDate(date1);
		et2.setTitre("event2");
		et2.setLieu("sfax");
		et2.setDate(date1);

		evenementRepository.save(et1);
		evenementRepository.save(et2);

		Evenement m = evenementService.findEvenement(1L);
        m.setLieu("Gafsa");
		evenementService.updateEvenement(m);

	}

}
