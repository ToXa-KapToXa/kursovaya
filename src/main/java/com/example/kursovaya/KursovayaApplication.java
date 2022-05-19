package com.example.kursovaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class KursovayaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KursovayaApplication.class, args);
    }

}
