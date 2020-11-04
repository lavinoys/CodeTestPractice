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

    /**
     * [ 완주하지 못한 선수 ]
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     */
    @Test
    @DisplayName("Hash Test")
    void hashTest() {
        Logger logger = LoggerFactory.getLogger(HashExamples.class);
        HashExamples hashExamples = new HashExamples();

        logger.info(hashExamples.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

}
