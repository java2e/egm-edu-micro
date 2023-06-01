package com.egm.accountservice.service;

import com.egm.accountservice.model.Account;
import com.egm.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class AccountService implements IBaseService<Account,Account> {


	private final AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	@Transactional(Transactional.TxType.REQUIRED)
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public List<Account> list() {
		return accountRepository.findAll();
	}

	@Override
	public boolean delete(Account account) {
		 accountRepository.delete(account); // exception
		 return true;
	}

	@Override
	public Account update(Account account) {
		return save(account);
	}
}
