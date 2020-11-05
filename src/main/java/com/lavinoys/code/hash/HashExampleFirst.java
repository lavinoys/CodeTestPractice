package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashExampleFirst {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExampleFirst.class);

    /**
     * [ 완주하지 못한 선수 ]
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     *
     * 총 합이 홀수인 대상을 찾는다.
     *
     * @param participant 도전자
     * @param completion 우승자
     * @return 탈락자
     */
    public String solution(String[] participant, String[] completion) {
        LOGGER.info("start");
        String answer = null;
        final Map<String, Long> concatMap = Stream.concat(Arrays.stream(participant), Arrays.stream(completion)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final Optional<Map.Entry<String, Long>> oneEntry = concatMap.entrySet().stream().parallel().filter(map -> map.getValue() % 2 == 1).findFirst();
        if (oneEntry.isPresent()) {
            answer = oneEntry.get().getKey();
        }
        LOGGER.info("finish");
        return answer;
    }
}
