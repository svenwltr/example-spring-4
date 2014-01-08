package com.github.gist.svenwltr.modules;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.gist.svenwltr.spi.Foo;
import com.github.gist.svenwltr.spi.Test;


//@Server ensures, this class will be found by component scan.
@Service
public class TestImpl implements Test {

	private Foo foo;

	// @Autowired tell Spring to solve all dependencies automaticly.
	@Autowired
	public TestImpl(Foo foo) {
		this.foo = foo;

	}

	@Override
	public void run() {
		System.out.println("Now, some magic:");
		System.out.println(foo.doMagic());

	}

}
