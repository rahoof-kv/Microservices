package com.rahoof.streamkafka.streamkafka.listener;

import com.rahoof.streamkafka.streamkafka.domain.Greetings;
import com.rahoof.streamkafka.streamkafka.stream.SampleStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
@Component
public class GreetingListener {

    private static final Logger logger = LoggerFactory.getLogger(GreetingListener.class);

    @StreamListener(SampleStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        logger.info("Received greetings: {}", greetings);
    }
}