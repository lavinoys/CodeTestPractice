package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class HashExampleSecond {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExampleSecond.class);

    /**
     * [ 전화번호 목록 ]
     *
     * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
     *
     * phone_book의 길이는 1 이상 1,000,000 이하입니다.
     * 각 전화번호의 길이는 1 이상 20 이하입니다.
     *
     * @param phone_book 전화번호 목
     * @return 참 거짓
     */
    public boolean solution(String[] phone_book) {
        LOGGER.info("start");
        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            if ( 0 < i) {
                if (phone_book[i].startsWith(phone_book[i-1])) {
                    answer = false;
                    break;
                }
            }
        }

        LOGGER.info("finish");
        return answer;
    }
}
