package com.github.dempey.pioneer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.github.dempey.pioneer"})
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

}
