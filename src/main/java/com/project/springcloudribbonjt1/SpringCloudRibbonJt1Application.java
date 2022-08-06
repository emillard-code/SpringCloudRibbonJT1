package com.project.springcloudribbonjt1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/chatbook-application")
public class SpringCloudRibbonJt1Application {

    @Value("${server.port}")
    private String port;

    @GetMapping("/chat")
    public String chatNow() {

        return "application is up on port : " + port;
        
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudRibbonJt1Application.class, args);

    }

}
