package com.example.superhero.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.superhero.models.Hair;
import com.example.superhero.repositories.HairRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(ApiController.class)
public class ControllerTest {
	
@Autowired
private MockMvc mockMvc;

@MockBean
private HairRepository hairRepo;

@Mock
private Hair hair1;

@Test
public void shouldBeOkWhenAccessingHair() throws Exception {
	mockMvc.perform(get("index")).andExpect(status().isOk());
}
	
}
