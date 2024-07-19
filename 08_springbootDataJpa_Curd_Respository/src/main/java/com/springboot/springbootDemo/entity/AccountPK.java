package com.springboot.springbootDemo.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPK implements Serializable{
	private Long accNum;
	private String accType;

}
