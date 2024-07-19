package com.spring.Annotations.Lambok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
	private int id;
	private String name;
	private int age;
}
