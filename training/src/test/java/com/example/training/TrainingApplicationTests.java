package com.example.training;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class TrainingApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
		System.out.println("连接的数据库是：mysql");
	}

}

