package com.github.wesleyegberto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator cut;

	@BeforeEach
	public void setup() {
		this.cut = new Calculator();
	}

	@Test
	@DisplayName("😱")
	public void shouldProvideCorrectAnswer() {
		Assertions.assertEquals(42, cut.calculate());
	}
}
