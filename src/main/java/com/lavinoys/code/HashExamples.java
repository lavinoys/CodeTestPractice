package com.lavinoys.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

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
    public String solution(String[] participant, String[] completion) {
        LOGGER.info("start");
        String answer = "";
        List<Vo> pList = new ArrayList<>();
        boolean noneMatch;
        for (String p : participant) {
            noneMatch = true;
            for (String c : completion) {
                if (p.equals(c)) {
                    noneMatch = false;
                    break;
                }
            }
            if (noneMatch) {
                answer = p;
            }
            Vo vo = new Vo(p, getCnt(p, participant));
            pList.add(vo);
        }
        if ("".equals(answer)) {
            for (Vo vo : pList) {
                if (vo.cnt != getCnt(vo.getName(), completion)) {
                    answer = vo.getName();
                    break;
                }
            }
        }

        LOGGER.info("finish");
        return answer;
    }

    public int getCnt (String name, String[] array) {
        int cnt = 0;
        for (String target : array) {
            if (name.equals(target)) {
                cnt++;
            }
        }
        return cnt;
    }
}

class Vo {
    String name;
    int cnt;
    public Vo(String name, int cnt) {
        this.name = name;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }
}