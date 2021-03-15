package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EtudiantRepository;
import com.example.demo.entities.Etudiant;

@SpringBootApplication
public class MvcServerSideApplication implements CommandLineRunner {
    @Autowired
	private EtudiantRepository etudiantRepository;
	public static void main(String[] args) {
		SpringApplication.run(MvcServerSideApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Mohamed",
				                             df.parse("1995-12-25"),
				                             "med@supiisi.net"));
		etudiantRepository.save(new Etudiant("Yacine",
                                             df.parse("1993-11-20"),
                                             "yac@supiisi.net"));
		etudiantRepository.save(new Etudiant("Anas",
                                              df.parse("2000-05-15"),
                                              "med@supiisi.net"));
                                              */
	}

}
