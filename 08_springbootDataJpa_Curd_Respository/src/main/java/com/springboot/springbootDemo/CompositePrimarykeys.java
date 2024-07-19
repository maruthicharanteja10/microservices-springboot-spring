package com.springboot.springbootDemo;


import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Account;
import com.springboot.springbootDemo.entity.AccountPK;
import com.springboot.springbootDemo.repo.AccountRepo;

@SpringBootApplication
public class CompositePrimarykeys {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CompositePrimarykeys.class, args);
		AccountRepo repos = ctx.getBean(AccountRepo.class);
		AccountPK pk = new AccountPK();
		pk.setAccNum(920830989922L);
		pk.setAccType("savings");

//		Account acc = new Account();
//		acc.setHolderName("Maruthi");
//		acc.setBranch("Proddatur");
//		acc.setAccountPK(pk);
//		repos.save(acc);
//		System.out.println("Record is saved..!");
		Optional<Account> findById=repos.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
	}
}
