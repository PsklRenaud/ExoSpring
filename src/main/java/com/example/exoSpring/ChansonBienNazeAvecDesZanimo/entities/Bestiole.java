package com.example.exoSpring.ChansonBienNazeAvecDesZanimo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bestioles")
public class Bestiole{
	public Bestiole() {
	
	}

	public Bestiole(String nameSinger, String worstHit, int nbPeopleDeafUntil) {
	    this.nameSinger = nameSinger;
	    this.worstHit = worstHit;
	    this.nbPeopleDeafUntil= nbPeopleDeafUntil;	    
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; 
		private String nameSinger;
		private String worstHit;
		private int nbPeopleDeafUntil;
		
@Override
public String toString() {
    return "User [id=" + id + ", Nom de la sale bete=" + nameSinger + 
            ", Son pire sevice=" + worstHit + ", Nombre de personnes sourdes depuis qu il chante=" + nbPeopleDeafUntil + "]";
}    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSinger() {
		return nameSinger;
	}

	public void setNameSinger(String nameSinger) {
		this.nameSinger = nameSinger;
	}

	public String getWorstHit() {
		return worstHit;
	}

	public void setWorstHit(String worstHit) {
		this.worstHit = worstHit;
	}

	public int getNbPeopleDeafUntil() {
		return nbPeopleDeafUntil;
	}

	public void setNbPeopleDeafUntil(int nbPeopleDeafUntil) {
		this.nbPeopleDeafUntil = nbPeopleDeafUntil;
	}
}
