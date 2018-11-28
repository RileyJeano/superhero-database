package com.example.paperDoll.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.paperDoll.models.Hair;
import com.example.paperDoll.models.Head;
import com.example.paperDoll.models.Base;
import com.example.paperDoll.models.Top;
import com.example.paperDoll.repositories.HairRepository;
import com.example.paperDoll.repositories.HeadRepository;
import com.example.paperDoll.repositories.BaseRepository;
import com.example.paperDoll.repositories.TopRepository;

@RestController
public class ApiController {

	@Autowired
	HairRepository hairRepo;

	@Autowired
	HeadRepository headRepo;

	@Autowired
	TopRepository topRepo;

	@Autowired
	BaseRepository heroRepo;

	@GetMapping("/api/hero/{id}")
	public String getHero(@PathVariable Long id, Model model) throws Exception {
		Optional<Base> hero = heroRepo.findById(id);
		if (hero.isPresent()) {
			model.addAttribute("hero", hero.get());
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
		if (hair.isPresent()) {
			return hair.get();
		} else
			// this should not return null if not present.
			return null;
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

}
