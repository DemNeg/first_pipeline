package com.example.demopipeline;

import com.example.demopipeline.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemopipelineApplicationTests {

	@Test
	void contextLoads() {
	}
	private Calculator calculator = new Calculator();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}
