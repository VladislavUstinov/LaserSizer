package com.securitytest.lasersizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.lasersizer.repository")
@ComponentScan("com.securitytest.config")
@SpringBootApplication
public class LasersizerApplication {

    public static void main(String[] args) {
        System.out.println("I'M HERE:void main(String[] args)");
        SpringApplication.run(LasersizerApplication.class, args);
    }

}
