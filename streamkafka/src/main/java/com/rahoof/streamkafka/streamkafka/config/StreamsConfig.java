package com.rahoof.streamkafka.streamkafka.config;

import com.rahoof.streamkafka.streamkafka.stream.SampleStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SampleStreams.class)
public class StreamsConfig {
}
