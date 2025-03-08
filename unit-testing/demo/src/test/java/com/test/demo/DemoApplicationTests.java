package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.test.demo.Calculadora;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void calculadoraTest() {
		var calculadora = new Calculadora();

		assert calculadora.sumar(1, 1) == 2;
	}

}
