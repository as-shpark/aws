package com.hapo.aws.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void hello() throws Exception {
		mvc.perform(get("/api/hello"))
			.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Hello world~!"))
			.andDo(MockMvcResultHandlers.print());
	}
}
