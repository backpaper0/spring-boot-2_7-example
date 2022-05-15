package com.example.jsonmixin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json-mixin-example")
public class JsonMixinExampleController {

	@GetMapping
	public Account getAccount() {
		return new Account(123L, "demouser", "secret");
	}
}
