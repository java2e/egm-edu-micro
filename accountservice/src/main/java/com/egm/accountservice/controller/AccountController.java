package com.egm.accountservice.controller;

import com.egm.accountservice.model.Account;
import com.egm.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {



	@Autowired
	private AccountService accountService;

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody Account account) {
		account = accountService.save(account);
		return ResponseEntity.ok(account);
	}


}
