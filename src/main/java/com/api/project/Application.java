package com.api.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //ElasticApmAttacher.attach();
        SpringApplication.run(Application.class, args);
    }

}
