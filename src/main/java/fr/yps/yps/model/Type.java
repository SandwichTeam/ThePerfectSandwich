package fr.yps.yps.model;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type {
	@Id
	@GeneratedValue
	private int id;

	private String libelle;

	@OneToMany(mappedBy="type")
	private Set<Aliment> lesAliments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Aliment> getLesAliments() {
		return lesAliments;
	}

	public void setLesAliments(Set<Aliment> lesAliments) {
		this.lesAliments = lesAliments;
	}

	public void addAliments(Aliment aliment) {
		this.lesAliments.add(aliment);
	}
	

}
