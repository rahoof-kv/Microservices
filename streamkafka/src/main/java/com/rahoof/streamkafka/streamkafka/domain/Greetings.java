package com.rahoof.streamkafka.streamkafka.domain;

public class Greetings {

    private long timestamp;
    private String message;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class Builder{

        private long timestamp;
        private String message;

        public Builder(){

        }

        public Builder message(String message){
            this.message = message;
            return this;
        }

        public Builder timestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public Greetings build(){

            Greetings greetings = new Greetings();
            greetings.setMessage(this.message);
            greetings.setTimestamp(this.timestamp);
            return greetings;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Greetings{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
