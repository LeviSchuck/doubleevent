package com.levischuck;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.scheduling.annotation.Scheduled;

@Context
public class EventMaker {
    private final ApplicationEventPublisher publisher;
    private int count = 0;
    public EventMaker(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
        count = 0;
        System.out.println("EventMaker constructed");
    }

    @Scheduled(fixedRate = "5s")
    public void sayHello() {
        System.out.println("Publishing " + count);
        publisher.publishEvent(new HelloEvent(count++));
    }
}
