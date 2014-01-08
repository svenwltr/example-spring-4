package com.github.gist.svenwltr;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

        public static void main(String[] args) throws IOException,
                        InterruptedException {
                new AnnotationConfigApplicationContext(
                                AppConfig.class);

                Object o = new Object();
                synchronized (o) {
                        o.wait();
                }

        }

}