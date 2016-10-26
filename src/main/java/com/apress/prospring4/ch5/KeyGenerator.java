package com.apress.prospring4.ch5;

import java.util.Random;

/**
 * Created by alex on 17.10.2016.
 */
public class KeyGenerator {
    protected static final long WEAK_KEY = 0xFFFFFFF0000000L;
    protected static final long STRONG_KEY = 0xACDF03F590AE56L;

    private Random random = new Random();

    public long getKey() {
        int x = random.nextInt(3);
        if (x == 1)
            return WEAK_KEY;
        else return STRONG_KEY;
    }
}
