package com.example.paperDoll;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.paperDoll.models.Hair;
import com.example.paperDoll.models.Head;
import com.example.paperDoll.models.Base;
import com.example.paperDoll.models.Top;
import com.example.paperDoll.repositories.HairRepository;
import com.example.paperDoll.repositories.HeadRepository;
import com.example.paperDoll.repositories.BaseRepository;
import com.example.paperDoll.repositories.TopRepository;

@Service
public class Populator implements CommandLineRunner {

	@Resource
	BaseRepository heroRepo;

	@Resource
	HairRepository hairRepo;

	@Resource
	HeadRepository headRepo;

	@Resource
	TopRepository topRepo;

	private Base createHero(String heroName, String heroImage) {
		Base base = new Base(heroName, heroImage);
		return heroRepo.save(base);
	}

	private Hair createHair(String hairStyle, int hairNumber) {
		Hair dollHair = new Hair(hairStyle, hairNumber);
		return hairRepo.save(dollHair);
	}

	private Head createHead(String head, int headNumber) {
		Head dollHead = new Head(head, headNumber);
		return headRepo.save(dollHead);
	}

	private Top createTop(String top, int topNumber) {
		Top dollTop = new Top(top, topNumber);
		return topRepo.save(dollTop);
	}

	@Override
	public void run(String... args) throws Exception {

		Base baseHero = createHero("", "/base.jpg");

		Hair hair1 = createHair("/hair1.png", 1);
		Hair hair2 = createHair("/hair2.png", 2);
		Hair hair3 = createHair("/hair3.png", 3);
		Hair hair4 = createHair("/hair4.png", 1);
		Hair hair5 = createHair("/hair5.png", 2);
		Hair hair6 = createHair("/hair6.png", 3);
		Hair hair7 = createHair("/hair7.png", 2);
		Hair hair8 = createHair("/hair8.png", 3);

		Head head1 = createHead("/face1.png", 1);
		Head head2 = createHead("/face2.png", 2);
		Head head3 = createHead("/face3.png", 3);
		Head head4 = createHead("/face4.png", 1);
		Head head5 = createHead("/face5.png", 2);
		Head head6 = createHead("/face6.png", 3);
		Head head7 = createHead("/face7.png", 2);
		Head head8 = createHead("/face8.png", 3);

		Top top1 = createTop("/outfit1.png", 1);
		Top top2 = createTop("/outfit2.png", 2);
		Top top3 = createTop("/outfit3.png", 3);
		Top top4 = createTop("/outfit4.png", 1);
		Top top5 = createTop("/outfit5.png", 2);
		Top top6 = createTop("/outfit6.png", 3);
		Top top7 = createTop("/outfit7.png", 2);
		Top top8 = createTop("/outfit8.png", 3);

	}

}
