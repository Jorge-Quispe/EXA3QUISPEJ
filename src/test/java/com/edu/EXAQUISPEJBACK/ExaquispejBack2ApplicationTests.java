package com.edu.EXAQUISPEJBACK;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edu.EXAQUISPEJBACK.Dao.LibroDao;

@SpringBootTest
class ExaquispejBack2ApplicationTests {
	@Autowired
	private LibroDao libroDao;
	@Test
	void contextLoads() {
		System.out.println(libroDao.readAll());
	}

}
