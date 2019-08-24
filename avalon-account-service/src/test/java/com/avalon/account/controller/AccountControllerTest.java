package com.avalon.account.controller;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private AccountController accountController;
	
	@Before
	public void setup() {
		initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(accountController).build();
	}
	
	@Test
	public void should_test() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				;
	}

}
