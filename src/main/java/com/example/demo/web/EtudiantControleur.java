package com.example.demo.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.EtudiantRepository;
import com.example.demo.entities.Etudiant;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RequestMapping(value="/etudiant")
@Controller
public class EtudiantControleur {
	@Autowired
	private EtudiantRepository etudiantRepository;
    @RequestMapping(value="/liste")
	public String Index(Model modele) {
    	List<Etudiant> etudiants=etudiantRepository.findAll();
        modele.addAttribute("etudiants",etudiants);
		return "Afficher";
	}
    
    @RequestMapping(value="/Form")
    public String formEtudiant(Model modele) {
    	modele.addAttribute("etudiant",new Etudiant());
    	return "FormEtudiant";
    }
    @RequestMapping(value="/Sauvegarder")
    public String Sauvegarder(@Valid Etudiant et,Errors errors) {
    	if(errors.hasErrors()) {
    		return "FormEtudiant";
    	}
    	etudiantRepository.save(et);
    	return "redirect:/etudiant/liste";
    }
    @RequestMapping(value="/Supprimer")
    public String Spprimer(Long id) {
     etudiantRepository.deleteById(id);
     return "redirect:/etudiant/liste";	
    }
    @RequestMapping(value="/FormEdit")
    public String FormEdit(Long id,Model modele) {
    	Etudiant et=etudiantRepository.findById(id).get();
    	modele.addAttribute("etudiant",et);
    	return "EditEtudiant";
    }
    @RequestMapping(value="/Modifier")
    public String Modifier(@Valid Etudiant et,Errors errors) {
    	if(errors.hasErrors()) {
    		return "EditEtudiant";
    	}
    	etudiantRepository.save(et);
    	return "redirect:/etudiant/liste";
    }
}
