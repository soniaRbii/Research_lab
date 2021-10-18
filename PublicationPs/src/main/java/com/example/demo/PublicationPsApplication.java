package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entities.Publication;
import com.example.demo.services.IPublicationService;


@SpringBootApplication
public class PublicationPsApplication implements CommandLineRunner {
	@Autowired
	PublicationRepository publicationRepository;
	@Autowired
	IPublicationService publicationService;

	public static void main(String[] args) {
		SpringApplication.run(PublicationPsApplication.class, args);
	}

	public void run(String... args) throws Exception {

		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormater.parse("2020-06-01");
		Date date2 = dateFormater.parse("2021-08-07");
		Date date3 = dateFormater.parse("2022-08-03");
		Date date4 = dateFormater.parse("2023-09-07");
		Publication pub1 = new Publication();
		pub1.setDate(date1);
		pub1.setLien("lien1");
		pub1.setTitre("Résultat");
		pub1.setType("type1");
		pub1.setSourcePdf("src1");
		publicationRepository.save(pub1);
		Publication pub2 = new Publication();
		pub2.setDate(date2);
		pub2.setLien("lien2");
		pub2.setTitre("Cours");
		pub2.setType("type2");
		pub2.setSourcePdf("src2");
		publicationRepository.save(pub2);
		/*Membre m = memberService.findMember(1L);
		m.setCv("cv1.pdf");
		memberService.updateMember(m);*/
		Publication pub3 =new Publication();
		pub3.setDate(date3);
		pub3.setLien("lien3");
		pub3.setTitre("Examens");
		pub3.setType("type3");
		pub3.setSourcePdf("src3");
		publicationRepository.save(pub3);
		Publication pub4 =new Publication();
		pub4.setDate(date4);
		pub4.setLien("lien4");
		pub4.setTitre("Séries");
		pub4.setType("type4");
		pub4.setSourcePdf("src4");
		publicationRepository.save(pub4);
		Publication p = publicationService.findPublication(1L);
		p.setLien("lien num 1");
		publicationService.updatePublication(p);
		
		
	}

}
