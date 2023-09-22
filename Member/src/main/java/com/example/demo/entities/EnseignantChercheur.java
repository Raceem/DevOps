package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@DiscriminatorValue("ens")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnseignantChercheur extends Membre {
	public String Grade;
	public String Etablissement;
	@Builder
	public EnseignantChercheur(@NonNull String cin, @NonNull String nom, @NonNull String prenom,
			@NonNull Date dateNaissance, @NonNull byte[] photo, @NonNull String CV, @NonNull String Email,
			@NonNull String password, String grade, String etablissement) {
		super(cin, nom, prenom, dateNaissance, photo, CV, Email, password);
		Grade = grade;
		Etablissement = etablissement;
	}
	
	}


