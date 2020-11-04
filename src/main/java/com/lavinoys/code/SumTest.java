package com.lavinoys.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumTest {
    private int number;
    static final Logger LOGGER = LoggerFactory.getLogger(SumTest.class);

    public SumTest(int number) {
        LOGGER.info("start");
        this.number = number;
    }

    public int getNumber() {
        LOGGER.info("finish");
        return number + number;
    }
}
