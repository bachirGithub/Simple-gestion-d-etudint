package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
	List<Etudiant> findByNomContains(String n);
	List<Etudiant> findByNomContainsOrderByNomAsc(String n);
	Page<Etudiant> findByNomContains(String mc, Pageable p);
}
