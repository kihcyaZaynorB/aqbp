package io.sutsaehpeh.aqbp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "io.sutsaehpeh.aqbp")
public class PortalBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalBootApplication.class, args);
    }
}
