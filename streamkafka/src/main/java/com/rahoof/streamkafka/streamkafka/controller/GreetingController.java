package com.rahoof.streamkafka.streamkafka.controller;


import com.rahoof.streamkafka.streamkafka.domain.Greetings;
import com.rahoof.streamkafka.streamkafka.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class GreetingController {

    private final GreetingService greetingsService;

    public GreetingController(GreetingService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {

        Greetings greetings = new Greetings.Builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();
        greetingsService.sendGreeting(greetings);
    }

}
