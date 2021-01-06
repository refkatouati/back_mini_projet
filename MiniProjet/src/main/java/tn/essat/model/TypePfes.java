package tn.essat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypePfes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	/*@OneToMany(cascade = CascadeType.ALL ,mappedBy = "type")
	private List<Pfe> liste;*/
	
	public TypePfes() {
		super();
		//this.liste = new ArrayList<Pfe>();
	}
	public TypePfes(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;

	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	/*public List<Pfe> getListe() {
		return liste;
	}
	public void setListe(List<Pfe> liste) {
		this.liste = liste;
	}*/
	
}
