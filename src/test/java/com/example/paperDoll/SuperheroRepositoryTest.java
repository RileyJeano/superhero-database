package com.example.paperDoll;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.paperDoll.models.Hair;
import com.example.paperDoll.models.Head;
import com.example.paperDoll.models.Base;
import com.example.paperDoll.models.Top;
import com.example.paperDoll.repositories.HairRepository;
import com.example.paperDoll.repositories.HeadRepository;
import com.example.paperDoll.repositories.BaseRepository;
import com.example.paperDoll.repositories.TopRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SuperheroRepositoryTest {
	@Resource
	HairRepository hairRepo;

	@Resource
	HeadRepository headRepo;

	@Resource
	TopRepository topRepo;

	@Resource
	BaseRepository heroRepo;

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
		Base heroOne = (Base) heroRepo.save(new Base());
		Iterable<Base> result = heroRepo.findAll();
		assertThat(result, hasItems(heroOne));
	}

}
