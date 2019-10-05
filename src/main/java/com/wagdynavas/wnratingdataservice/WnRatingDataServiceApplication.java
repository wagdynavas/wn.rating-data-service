package com.wagdynavas.wnratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WnRatingDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WnRatingDataServiceApplication.class, args);
    }

}
