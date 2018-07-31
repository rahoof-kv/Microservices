package com.rahoof.services.room.roomservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class RoomServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomServicesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Room").select()
                .apis(RequestHandlerSelectors.basePackage("com.rahoof.services.room.roomservices"))
                .paths(PathSelectors.any()).build().apiInfo(new ApiInfo("Room Services",
                        "A set of services to provide data access to rooms", "1.0.0", null,
                        new Contact("Rahoof KV", "", null), null, null));
    }

}


