package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

@Service
public class MemberImpl implements IMemberService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;

	@Override
	public Membre addMember(Membre m) {
		memberRepository.save(m);
		return m;

	}

	@Override
	public void deleteMember(Long id) {
     memberRepository.deleteById(id);

	}

	@Override
	public Membre updateMember(Membre p) {
		memberRepository.saveAndFlush(p);
		return p;
	}

	@Override
	public Membre findMember(Long id) {
		Membre m = memberRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Membre> findAll() {
		List<Membre> m = memberRepository.findAll();

		return m;
	}

	@Override
	public Membre findByCin(String cin) {
		Membre m = memberRepository.findByCin(cin);
		return m;
	}

	@Override
	public Membre findByEmail(String email) {
		Membre m = memberRepository.findByEmail(email);
		return m;
	}

	@Override
	public List<Membre> findByNom(String nom) {
		List<Membre> m = memberRepository.findByNomStartingWith(nom);
		return m;
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		return  etudiantRepository.findByDiplome(diplome);
		
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
	return  enseignantChercheurRepository.findByGrade(grade);
		
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String
			etablissement) {
			return enseignantChercheurRepository.findByEtablissement(etablissement);
			}

	@Override
	public Membre AffectEtudiantToEnseignant(Long idEtd, Long idEns) {
		Etudiant e=etudiantRepository.findById(idEtd).get();
		EnseignantChercheur ens=enseignantChercheurRepository.findById(idEns).get();
		e.setEncadrant(ens);
		return etudiantRepository.save(e);
		
	
	}

	@Override
	public List<Etudiant> findByEncadrant(Long idEns) {
	    EnseignantChercheur ens =enseignantChercheurRepository.findById(idEns).get();
	    
		return etudiantRepository.findByEncadrant(ens);
	}}

