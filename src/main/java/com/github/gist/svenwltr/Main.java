package com.github.gist.svenwltr;


import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.gist.svenwltr.spi.Test;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException,
			InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		Test test = ctx.getBean(Test.class);

		test.run();

	}

}
