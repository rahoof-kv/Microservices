package com.baeldung;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.baeldung.filters.SimpleFilter;


@SpringBootApplication
@EnableDiscoveryClient
public class ZoolServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZoolServerApplication.class, args);
    }    
    
    @Bean
    public SimpleFilter simpleFilter() {
      return new SimpleFilter();
    } 
    
}
