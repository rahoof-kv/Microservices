package com.rahoof.streamkafka.streamkafka.service;

import com.rahoof.streamkafka.streamkafka.domain.Greetings;
import com.rahoof.streamkafka.streamkafka.stream.SampleStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class GreetingService {

    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    private final SampleStreams sampleStreams;

    public GreetingService(SampleStreams sampleStreams) {
        this.sampleStreams = sampleStreams;
    }

    public void sendGreeting(final Greetings greetings) {
        logger.info("sending greetings :" + greetings);

        MessageChannel messageChannel = sampleStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}