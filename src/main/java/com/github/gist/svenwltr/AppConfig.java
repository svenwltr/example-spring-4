package com.github.gist.svenwltr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.github.gist.svenwltr.spi",
		"com.github.gist.svenwltr.modules" })
public class AppConfig {

}