package com.javarush.task.jdk13.task42.task4205;

import java.util.concurrent.*;

public class Message implements Delayed {
    private Integer messageId;
    private String messageText;
    private long lifetime;
    private long endTime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
        this.endTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(lifetime, TimeUnit.MILLISECONDS);
    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = endTime - System.nanoTime();
        return unit.convert(diff, TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
//        long thisDelay = this.getDelay(TimeUnit.NANOSECONDS);
//        long otherDelay = o.getDelay(TimeUnit.NANOSECONDS);
//
//        if (thisDelay > otherDelay) {
//            return 1;
//        } else if (thisDelay < otherDelay) {
//            return -1;
//        } else {
//            return 0;
//        }
       return Long.compare(this.getDelay(TimeUnit.NANOSECONDS),o.getDelay(TimeUnit.NANOSECONDS));
    }
}
