package com.example.jsonmixin;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class JsonMixinExampleTest {

	MockMvc mvc;

	@BeforeEach
	void init(WebApplicationContext context) {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void getAccount() throws Exception {
		mvc.perform(get("/json-mixin-example"))
				.andExpectAll(
						status().isOk(),
						content().contentType(MediaType.APPLICATION_JSON),
						jsonPath("$.id").value(123),
						jsonPath("$.username").value("demouser"),
						jsonPath("$.password").doesNotExist());
	}
}
