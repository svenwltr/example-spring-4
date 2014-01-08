package com.github.gist.svenwltr.modules;


import org.springframework.stereotype.Service;

import com.github.gist.svenwltr.spi.Foo;


//@Server ensures, this class will be found by component scan.
@Service
public class FooImpl implements Foo {

	@Override
	public String doMagic() {
		return "*some magic*";

	}

}
