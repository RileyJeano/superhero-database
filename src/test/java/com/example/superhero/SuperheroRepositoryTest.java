package com.example.superhero;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.superhero.repositories.BottomRepository;
import com.example.superhero.repositories.HairRepository;
import com.example.superhero.repositories.HeadRepository;
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
	
	@Test
	public void shouldAddHairStyleToRepo() {
				
	}
}









