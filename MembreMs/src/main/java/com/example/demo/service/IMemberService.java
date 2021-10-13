package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

public interface IMemberService {

public Membre addMember(Membre m);
public void deleteMember(Long id) ;
public Membre updateMember(Membre
p) ;
public Membre findMember(Long id) ;
public List<Membre> findAll();

public Membre findByCin(String cin);
public Membre findByEmail(String email);
public List<Membre> findByNom(String nom);

public List<Etudiant> findByDiplome(String diplome);

public List<EnseignantChercheur> findByGrade(String grade);
public List<EnseignantChercheur> findByEtablissement(String etablissement);
public Membre AffectEtudiantToEnseignant(Long idEtd,Long idEns);
public List<Etudiant> findByEncadrant(Long idEns);
}