package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDocker01 {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsDocker01.class);
    }
    @GetMapping("/")
    public String getString(){
        return "JenkinsDocker06";
    }
}
