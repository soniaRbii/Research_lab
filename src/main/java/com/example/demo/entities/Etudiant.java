package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("etd")

public class Etudiant extends Membre implements Serializable {
	public Etudiant() {}



	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String diplome;
	private String sujet;
	

	public Etudiant(String cin, String nom, String prenom, Date dateNaissancd, String cv, byte[] photo, String email,
			String password) {
		super(cin, nom, prenom, dateNaissancd, cv, photo, email, password);
		// TODO Auto-generated constructor stub
	}


	public Etudiant(Date dateInscription, String diplome, String sujet, EnseignantChercheur encadrant) {
		super();
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.sujet = sujet;
		this.encadrant = encadrant;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	@ManyToOne
	private EnseignantChercheur encadrant;

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDiplome() {
		return diplome;
	}

	public Etudiant(String cin, String nom, String prenom, Date dateNaissancd, String cv, byte[] photo, String email,
			String password, Date dateInscription, String diplome, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, dateNaissancd, cv, photo, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(EnseignantChercheur encadrant) {
		this.encadrant = encadrant;
	}

}
