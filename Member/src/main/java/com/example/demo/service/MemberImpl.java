package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberImpl implements IMemberService {
MemberRepository memberRepository;
EtudiantRepository etudiantRepository;
EnseignantChercheurRepository enseignantChercheurRepository;
public Membre addMember(Membre m) {
memberRepository.save(m);
return m;
}
public void deleteMember(Long id) {
memberRepository.deleteById(id);
}
public Membre updateMember(Membre m) {
return memberRepository.saveAndFlush(m);
}
public Membre findMember(Long id) {
Membre m= (Membre)memberRepository.findById(id).get();
return m;
}
public List<Membre> findAll() {
return memberRepository.findAll();}
public Membre findByCin(String cin) {
return memberRepository.findByCin(cin);}
public Membre findByEmail(String email) {
return memberRepository.findByEmail(email);}

public List<Etudiant> findByDiplome(String diplome) {
return etudiantRepository.findByDiplome(diplome);
}
public List<EnseignantChercheur> findByGrade(String grade) {
return enseignantChercheurRepository.findByGrade(grade);
}
public List<EnseignantChercheur> findByEtablissement(String
etablissement) {
return
enseignantChercheurRepository.findByEtablissement(etablissement);
}
@Override
public List<Membre> findByNom(String nom) {
	return memberRepository.findByNomStartingWith(nom);
}
}