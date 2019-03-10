package com.levischuck;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.scheduling.annotation.Async;

@Context
public class EventListener implements ApplicationEventListener<HelloEvent> {
    public EventListener() {
        System.out.println("EventListener constructed");
    }

    @Async
    @Override
    public void onApplicationEvent(HelloEvent event) {
        System.out.println("New event! " + event);
    }
}
