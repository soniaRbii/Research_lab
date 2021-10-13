package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre implements Serializable {
	public EnseignantChercheur() {}
	
	private String grade;
	private String etablissement;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		grade = grade;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		etablissement = etablissement;
	}
	public EnseignantChercheur(String cin, String nom, String prenom, Date dateNaissancd, String cv, byte[] photo,
			String email, String password, String grade, String etablissement) {
		super(cin, nom, prenom, dateNaissancd, cv, photo, email, password);
		grade = grade;
		etablissement = etablissement;
	}
	

}
