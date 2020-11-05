package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import static java.util.stream.Collectors.*;

public class HashExampleThird {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExampleThird.class);

    /**
     * [ 위장 ]
     *
     * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
     * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
     * 같은 이름을 가진 의상은 존재하지 않습니다.
     * clothes의 모든 원소는 문자열로 이루어져 있습니다.
     * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
     * 스파이는 하루에 최소 한 개의 의상은 입습니다.
     *
     * @param clothes 옷 목록
     * @return 입을 수 있는 아이템 수
     */
    public int solution(String[][] clothes) {
        LOGGER.info("start");
        int answer = Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;
        LOGGER.info("finish");
        return answer;
    }
}
