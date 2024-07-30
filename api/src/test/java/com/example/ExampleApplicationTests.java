package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExampleApplicationTests {
	ApplicationModules modules = ApplicationModules.of(ExampleApplication.class);

 	@Test
	void modulesVerify(){
		modules.verify();
	}

	@Test
	void modulesPrinter(){
		modules.forEach(System.out::println);
	}
}
