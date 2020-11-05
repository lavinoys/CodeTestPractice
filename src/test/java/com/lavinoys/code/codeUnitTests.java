package com.lavinoys.code;

import com.lavinoys.code.hash.HashExampleFirst;
import com.lavinoys.code.hash.HashExampleSecond;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class codeUnitTests {

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
        Logger logger = LoggerFactory.getLogger(HashExampleFirst.class);
        HashExampleFirst hash = new HashExampleFirst();

        try {
            logger.info(hash.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
//            logger.info(hash.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 전화번호 목록 ]
     *
     * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
     *
     * phone_book의 길이는 1 이상 1,000,000 이하입니다.
     * 각 전화번호의 길이는 1 이상 20 이하입니다.
     */
    @Test
    @DisplayName("Hash Test 2")
    void hashTest2() {
        Logger logger = LoggerFactory.getLogger(HashExampleSecond.class);
        HashExampleSecond hash = new HashExampleSecond();

        try {
            logger.info("return boolean : {}", hash.solution(new String[]{"119", "97674223", "1195524421"}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }
}
