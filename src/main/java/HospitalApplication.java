public class HospitalApplication {
}
package com.example.java3ss12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {

    private static final Logger log = LoggerFactory.getLogger(HospitalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            log.info("Hospital Web Service is ready on Embedded Tomcat!");
        };
    }
}