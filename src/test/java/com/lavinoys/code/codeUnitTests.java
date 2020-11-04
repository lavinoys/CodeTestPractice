package com.lavinoys.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class codeUnitTests {

    @Test
    @DisplayName("Sum Test")
    void sumTest() {
        Logger sumTestLogger = LoggerFactory.getLogger(SumTest.class);
        SumTest sumTest = new SumTest(-5);
        sumTestLogger.info("result : {}", sumTest.getNumber());
    }

}
