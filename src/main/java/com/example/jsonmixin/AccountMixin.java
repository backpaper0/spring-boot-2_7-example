package com.example.jsonmixin;

import org.springframework.boot.jackson.JsonMixin;

import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonMixin(Account.class)
class AccountMixin {

	@JsonIgnore
	String password;
}
