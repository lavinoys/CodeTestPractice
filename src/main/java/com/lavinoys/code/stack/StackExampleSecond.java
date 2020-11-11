package com.lavinoys.code.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class StackExampleSecond {
    static final Logger LOGGER = LoggerFactory.getLogger(StackExampleSecond.class);

    /**
     * [ 기능개발 ]
     * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
     * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
     * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
     *
     * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
     * 작업 진도는 100 미만의 자연수입니다.
     * 작업 속도는 100 이하의 자연수입니다.
     * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
     *
     * @param progresses 개발량
     * @param speeds 개발속도
     * @return 결과
     */
    public int[] solution(int[] progresses, int[] speeds) {
        LOGGER.info("start");

        // 프로세스가 남은 배열 저장
        int[] calArray = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            calArray[i] = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
        }

        // 배열에 있는 숫자를 비교한다.
        // [0] : 10, [1] : 5, [2] : 2 경우  3이 된다.
        int bigNum = -1;
        int count = 0;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for (int number : calArray) {
            index++;
            if (-1 == bigNum) {
                bigNum = number;
                count++;
                continue;
            }

            if (bigNum < number) { // 기준 숫자가 다음 숫자보다 작으면
                list.add(count);
                bigNum = number;
                count = 1;
            } else { // 기준 숫자가 다음 숫자보다 크면
                count++;
            }
            if (index == calArray.length) {
                list.add(count);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        LOGGER.info("finish");
        return answer;
    }
}
