package com.lavinoys.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashExamples {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExamples.class);

    /**
     * [ 완주하지 못한 선수 ]
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     *
     * @param participant 도전자
     * @param completion 우승자
     * @return 탈락자
     */
    public String solution001(String[] participant, String[] completion) {
        LOGGER.info("start");
        String answer = null;
        final Map<String, Long> partiMap = Arrays.stream(participant).parallel().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final Map<String, Long> complMap = Arrays.stream(completion).parallel().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final Optional<Map.Entry<String, Long>> noneMatchEntry = partiMap.entrySet().stream().filter(p -> complMap.entrySet().stream().noneMatch(c -> p.getKey().equals(c.getKey()) && p.getValue().equals(c.getValue()))).findFirst();
        if (noneMatchEntry.isPresent()) {
            answer = noneMatchEntry.get().getKey();
        }

        LOGGER.info("finish");
        return answer;
    }
}