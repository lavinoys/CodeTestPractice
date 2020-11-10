package com.lavinoys.code;

import com.lavinoys.code.hash.HashExampleFirst;
import com.lavinoys.code.hash.HashExampleFourth;
import com.lavinoys.code.hash.HashExampleSecond;
import com.lavinoys.code.hash.HashExampleThird;
import com.lavinoys.code.stack.StackExampleFirst;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

    /**
     * [ 위장 ]
     *
     * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
     * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
     * 같은 이름을 가진 의상은 존재하지 않습니다.
     * clothes의 모든 원소는 문자열로 이루어져 있습니다.
     * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
     * 스파이는 하루에 최소 한 개의 의상은 입습니다.
     */
    @Test
    @DisplayName("Hash Test 3")
    void hashTest3() {
        Logger logger = LoggerFactory.getLogger(HashExampleThird.class);
        HashExampleThird hash = new HashExampleThird();

        try {
            logger.info("count : {}", hash.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
//            logger.info("count : {}", hash.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
     *
     * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
     * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
     * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
     * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
     *
     *
     * [ 베스트 앨범 ]
     * genres[i]는 고유번호가 i인 노래의 장르입니다.
     * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
     * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
     * 장르 종류는 100개 미만입니다.
     * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
     * 모든 장르는 재생된 횟수가 다릅니다.
     */
    @Test
    @DisplayName("Hash Test 4")
    void hashTest4() {
        Logger logger = LoggerFactory.getLogger(HashExampleFourth.class);
        HashExampleFourth hash = new HashExampleFourth();

        try {
//            logger.info("values : {}", hash.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
//            logger.info("values : {}", hash.solution(new String[]{"classic", "classic", "classic", "classic", "pop"}, new int[]{500, 150, 800, 800, 2500}));
            logger.info("values : {}", hash.solution(new String[]{"classic","pop","classic","pop","classic","classic"}, new int[]{400,600,150,2500,500,500}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 주식 가격 ]
     * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
     *
     * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
     * prices의 길이는 2 이상 100,000 이하입니다.
     *
     * 1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
     * 2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
     * 3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
     * 4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
     * 5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
     *
     * 몇초만에 내 주가가 음수이냐(떨어졌냐)를 판단하는 문제네요.
     * prices[2] 가 3인데 다음 숫자가 2니까
     * 1초만에 떨어진것.
     *
     * 즉 prices = [3, 4, 2, 6, 5] 라면
     * 3은 4(1초) 2(2초)로 3보다 작은 2로 떨어진거니까 답은 2초가 됩니다.
     */
    @Test
    @DisplayName("Stack Test 1")
    void stackTest1() {
        Logger logger = LoggerFactory.getLogger(StackExampleFirst.class);
        StackExampleFirst stack = new StackExampleFirst();

        try {
            logger.info("values : {}", stack.solution(new int[]{1, 2, 3, 2, 3}));
            logger.info("expected values : 4, 3, 1, 1, 0");
            assertArrayEquals(stack.solution(new int[]{1, 2, 3, 2, 3}), new int[]{4, 3, 1, 1, 0});
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }
}
