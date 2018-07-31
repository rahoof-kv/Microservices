package com.rahoof.streamkafka.streamkafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SampleStreams {

    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();

    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
