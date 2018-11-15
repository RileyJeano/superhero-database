package com.example.superhero;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

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

@Service
public class Populator implements CommandLineRunner {

	@Resource
	HeroRepository heroRepo;

	@Resource
	HairRepository hairRepo;

	@Resource
	HeadRepository headRepo;

	@Resource
	TopRepository topRepo;

	@Resource
	BottomRepository bottomRepo;

	private Hero createHero(String heroName, String heroImage, Hair heroHair, Head heroHead, Top heroTop,
			Bottom heroBottom) {
		Hero a = new Hero();
		return heroRepo.save(a);
	}

	private Hair createHair(String hairStyle, int hairNumber) {
		Hair b = new Hair(hairStyle, 0);
		return hairRepo.save(b);
	}

	private Head createHead(String head, int headNumber) {
		Head c = new Head(head, 0);
		return headRepo.save(c);
	}

	private Top createTop(String top, int topNumber) {
		Top d = new Top(top, 0);
		return topRepo.save(d);
	}

	private Bottom createBottom(String bottom, int topNumber) {
		Bottom e = new Bottom(bottom, 0);
		return bottomRepo.save(e);
	}

	@Override
	public void run(String... args) throws Exception {

		Hero baseHero = createHero("", "/blankBody.jpg", null, null, null, null);

		Hair hair1 = createHair("/hair1.png", 1);
		Hair hair2 = createHair("/hair2.png", 2);
		Hair hair3 = createHair("/hair3.png", 3);

		Head head1 = createHead("/head1.png", 1);
		Head head2 = createHead("/head2.png", 2);
		Head head3 = createHead("/head3.png", 3);

		Top top1 = createTop("/top1.png", 1);
		Top top2 = createTop("/top2.png", 2);
		Top top3 = createTop("/top3.png", 3);

		Bottom bottom1 = createBottom("/bottom1.png", 1);
		Bottom bottom2 = createBottom("/bottom2.png", 2);
		Bottom bottom3 = createBottom("/bottom3.png", 3);

	}

}
