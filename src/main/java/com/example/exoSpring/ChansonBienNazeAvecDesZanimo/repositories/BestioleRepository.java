package com.example.exoSpring.ChansonBienNazeAvecDesZanimo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exoSpring.ChansonBienNazeAvecDesZanimo.entities.Bestiole;


public interface BestioleRepository extends JpaRepository<Bestiole, Long> {

	public Bestiole findById(Bestiole nameSinger);
	public Bestiole deleteById(Bestiole nameSinger);



}
