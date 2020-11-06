package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class HashExampleFourth {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExampleFourth.class);

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
     *
     *
     * @param genres 노래 장르
     * @param plays 재생 횟수
     * @return 정렬된 음악 순서
     */
    public int[] solution(String[] genres, int[] plays) {
        LOGGER.info("start");
        int[] answer = {};

        /*HashMap<String, Integer> collect = Arrays.stream(genres)
                .collect(HashMap::new,
                        (map, streamValue) -> map.put(streamValue, plays[map.size()]),
                        (map, map2) -> {});
        collect.forEach((k, v) -> LOGGER.info("{} : {}", k, v));*/


        Map<String, VO> mergeMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (mergeMap.containsKey(genres[i])) {
                VO vo = mergeMap.get(genres[i]);
                vo.setPlaysSum(plays[i]);
                vo.putPlays(i, plays[i]);
                mergeMap.put(genres[i], vo);
            } else {
                VO vo = new VO(plays[i]);
                mergeMap.put(genres[i], vo);
                vo.putPlays(i, plays[i]);
            }
        }

        mergeMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(map -> map.getValue().getPlaysSum()))
                .forEach(map -> {
                    map.getValue()
                            .getPlaysMap()
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                            .limit(2)
                            .forEach(inner -> {
                                LOGGER.info("key : {}", inner.getKey());
                            });
                });


        /*mergeMap.forEach((k, v) -> {
            LOGGER.info("{} : {}", k, v.getPlaysSum());
            v.getPlaysMap().entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(System.out::println);
        });*/


        LOGGER.info("finish");
        return answer;
    }
}

class VO {
    int playsSum;
    Map<Integer, Integer> playsMap;

    public VO(int sum) {
        this.playsSum = sum;
        playsMap = new HashMap<>();
    }

    public Map<Integer, Integer> getPlaysMap() {
        return playsMap;
    }

    public void setPlaysSum(int plays) {
        this.playsSum += plays;
    }

    public int getPlaysSum() {
        return playsSum;
    }

    public void putPlays(int i, int play) {
        playsMap.put(i, play);
    }
}