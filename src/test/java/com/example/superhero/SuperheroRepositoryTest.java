package com.example.superhero;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

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

@RunWith(SpringRunner.class)
@DataJpaTest
public class SuperheroRepositoryTest {
	@Resource
	BottomRepository bottomRepo;

	@Resource
	HairRepository hairRepo;

	@Resource
	HeadRepository headRepo;

	@Resource
	TopRepository topRepo;

	@Resource
	HeroRepository heroRepo;

	@Test
	public void shouldContainBottom() {
		Bottom bottomOne = bottomRepo.save(new Bottom("", 0));
		Iterable<Bottom> result = bottomRepo.findAll();
		assertThat(result, hasItems(bottomOne));
	}

	@Test
	public void shouldContainHair() {
		Hair hairOne = hairRepo.save(new Hair("", 0));
		Iterable<Hair> result = hairRepo.findAll();
		assertThat(result, hasItems(hairOne));
	}

	@Test
	public void shouldContainHead() {
		Head headOne = headRepo.save(new Head("", 0));
		Iterable<Head> result = headRepo.findAll();
		assertThat(result, hasItems(headOne));
	}

	@Test
	public void shouldContainTop() {
		Top topOne = topRepo.save(new Top("", 0));
		Iterable<Top> result = topRepo.findAll();
		assertThat(result, hasItems(topOne));
	}

	public void shouldContainHero() {
		Head headOne = headRepo.save(new Head());
		Hair hairOne = hairRepo.save(new Hair());
		Top topOne = topRepo.save(new Top());
		Bottom bottomOne = bottomRepo.save(new Bottom());
		Hero heroOne = (Hero) heroRepo.save(new Hero());
		Iterable<Hero> result = heroRepo.findAll();
		assertThat(result, hasItems(heroOne));
	}

}
