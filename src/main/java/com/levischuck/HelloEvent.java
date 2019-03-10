package com.levischuck;

public class HelloEvent {
    private final int count;

    public HelloEvent(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "HelloEvent{" +
                "count=" + count +
                '}';
    }
}
