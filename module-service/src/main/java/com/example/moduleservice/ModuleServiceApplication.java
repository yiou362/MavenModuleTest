package com.example.moduleservice;

import com.example.moduleutil.constants.Constants1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleServiceApplication.class, args);
        System.out.println(Constants1.CONSTANTS);
    }

}
