package com.example.superhero;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.superhero.repositories.BottomRepository;
import com.example.superhero.repositories.HairRepository;
import com.example.superhero.repositories.HeadRepository;
import com.example.superhero.repositories.TopRepository;

@Service
public class Populator implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

	}

	@Resource
	HairRepository hairRepo;

	@Resource
	HeadRepository headRepo;

	@Resource
	TopRepository topRepo;

	@Resource
	BottomRepository bottomRepo;

}
