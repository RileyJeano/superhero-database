package com.example.superhero.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.superhero.models.Bottom;
import com.example.superhero.models.Hair;
import com.example.superhero.models.Head;
import com.example.superhero.models.Hero;
import com.example.superhero.models.Top;
import com.example.superhero.repositories.BottomRepository;
import com.example.superhero.repositories.HairRepository;
import com.example.superhero.repositories.HeadRepository;
import com.example.superhero.repositories.HeroRepository;
import com.example.superhero.repositories.TopRepository;

@RestController
public class ApiController {
	
	@Autowired
	HairRepository hairRepo;
	
	@Autowired
	HeadRepository headRepo;
	
	@Autowired
	TopRepository topRepo;
	
	@Autowired
	BottomRepository bottomRepo;
	
	@Autowired
	HeroRepository heroRepo;
	
	@GetMapping("/api/hero/{id}")
	public String getHero(@PathVariable Long id, Model model) throws Exception {
		Optional<Hero> hero = heroRepo.findById(id);
		if (hero.isPresent()) {
			model.addAttribute("hero",hero.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
	}
	

	@GetMapping("/api/hair")
	public Iterable<Hair> getHair() {
		return hairRepo.findAll();
	}
	@GetMapping("/api/hair/{id}")
	public String getHair(@PathVariable Long id, Model model) throws Exception {
		Optional<Hair> hair = hairRepo.findById(id);
		if (hair.isPresent()) {
			model.addAttribute("hair", hair.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
		
	}
	@GetMapping("/api/hair/{hairNumber}")
	public Hair GetHair(@PathVariable int hairNumber, Model model) throws Exception {
		Optional<Hair> hair = hairRepo.findByHairNumber(hairNumber);
		if (hair.isPresent() ) {
			return hair.get();
		} else { // must return something is hair is not present.
			
		}
	}
	
	@GetMapping("/api/head")
	public Iterable<Head> getHead() {
		return headRepo.findAll();
	}
	@GetMapping("/api/head/{id}")
	public String getHead(@PathVariable Long id, Model model) throws Exception {
		Optional<Head> head = headRepo.findById(id);
		if (head.isPresent()) {
			model.addAttribute("head", head.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
		
	}
	@GetMapping("/api/top")
	public Iterable<Top> getTop() {
		return topRepo.findAll();
	}
	@GetMapping("/api/top/{id}")
	public String getTop(@PathVariable Long id, Model model) throws Exception {
		Optional<Top> top = topRepo.findById(id);
		if (top.isPresent()) {
			model.addAttribute("top", top.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
		
	}
	
	@GetMapping("/api/bottom")
	public Iterable<Bottom> getBottom() {
		return bottomRepo.findAll();
	}
	@GetMapping("/api/bottom/{id}")
	public String getBottom(@PathVariable Long id, Model model) throws Exception {
		Optional<Bottom> bottom = bottomRepo.findById(id);
		if (bottom.isPresent()) {
			model.addAttribute("bottom", bottom.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
		
	}
	
}
