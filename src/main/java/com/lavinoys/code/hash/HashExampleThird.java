package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
     * 2번째 배열에 해당하는 건 한번
     * 배일 길이 + 종류 수
     *
     * @param clothes 옷 목록
     * @return 입을 수 있는 아이템 수
     */
    public int solution(String[][] clothes) {
        LOGGER.info("start");
        int answer;

        List<String> categoryList = new ArrayList<>();
        for (String[] array : clothes) {
            categoryList.add(array[1]);
        }

        final Map<String, Long> sortMap = categoryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int sumCnt = 1;

        for (Map.Entry<String, Long> entry : sortMap.entrySet()) {
            sumCnt *= (entry.getValue().intValue()+1);
        }
        answer = sumCnt - 1;

        LOGGER.info("finish");
        return answer;
    }
}
