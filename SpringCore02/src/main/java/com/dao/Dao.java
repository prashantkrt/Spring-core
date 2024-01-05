package com.dao;

import org.springframework.stereotype.Repository;

// @component + data related
@Repository(value = "repo")
public class Dao {//dao

	public Dao() {
		System.out.println("Dao object is created");
	}
}
