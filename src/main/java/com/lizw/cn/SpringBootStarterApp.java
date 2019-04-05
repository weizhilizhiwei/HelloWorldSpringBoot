package com.lizw.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Troy Li
 */
@SpringBootApplication
@ServletComponentScan
public class SpringBootStarterApp {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootStarterApp.class, args);
    }

}
