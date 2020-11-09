package com.lavinoys.code.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class HashExampleFourth {
    static final Logger LOGGER = LoggerFactory.getLogger(HashExampleFourth.class);

    /**
     * [ 베스트 앨범 ]
     *
     * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
     * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
     * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
     * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
     * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
     *
     * genres[i]는 고유번호가 i인 노래의 장르입니다.
     * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
     * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
     * 장르 종류는 100개 미만입니다.
     * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
     * 모든 장르는 재생된 횟수가 다릅니다.
     *
     * @param genres 노래 장르
     * @param plays 재생 횟수
     * @return 정렬된 음악 순서
     */
    public int[] solution(String[] genres, int[] plays) {
        LOGGER.info("start");
        int[] answer = IntStream.range(0, genres.length)
                .mapToObj(i -> new Music(genres[i], plays[i], i))
                .collect(groupingBy(Music::getGenre))
                .entrySet().stream()
                .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
                .flatMap(x->x.getValue().stream().sorted().limit(2))
                .mapToInt(Music::getId).toArray();
        LOGGER.info("finish");
        return answer;
    }

    int sum(List<Music> value) {
        int answer = 0;
        for (Music music : value) {
            answer+=music.getPlayed();
        }
        return answer;
    }
}

class Music implements Comparable<Music>{

    private final int played;
    private final int id;
    private final String genre;

    public Music(String genre, int played, int id) {
        this.genre = genre;
        this.played = played;
        this.id = id;
    }

    @Override
    public int compareTo(Music other) {
        if(this.played == other.played) return this.id - other.id;
        return other.played - this.played;
    }

    public String getGenre() {return genre;}

    public int getPlayed() {
        return played;
    }

    public int getId() {
        return id;
    }
}