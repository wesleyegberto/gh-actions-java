package com.github.wesleyegberto;

import java.util.logging.Logger;

public final class App {
	private static final Logger LOG = Logger.getLogger("app");

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int answer = calculator.calculate();
		LOG.info("Hello World: " + answer);
	}
}
