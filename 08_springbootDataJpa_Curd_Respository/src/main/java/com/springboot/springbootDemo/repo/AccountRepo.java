package com.springboot.springbootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootDemo.entity.Account;
import com.springboot.springbootDemo.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
