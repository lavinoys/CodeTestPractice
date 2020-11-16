package com.lavinoys.code.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StackExampleThird {
    static final Logger LOGGER = LoggerFactory.getLogger(StackExampleThird.class);

    /**
     * [ 다리를 지나는 트럭 ]
     *
     * 문제 설명
     * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
     * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
     *
     * 예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
     *
     * 따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
     *
     * solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
     *
     * 제한 조건
     * bridge_length는 1 이상 10,000 이하입니다.
     * weight는 1 이상 10,000 이하입니다.
     * truck_weights의 길이는 1 이상 10,000 이하입니다.
     * 모든 트럭의 무게는 1 이상 weight 이하입니다.
     *
     * @param bridge_length 다리 길이
     * @param weight 수용 가능 무게
     * @param truck_weights 트럭들 무게
     * @return 최종 시간
     */
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LOGGER.info("start");
        int answer = 0;

        Queue<Integer> queue = new ConcurrentLinkedDeque<>();
        int sum = 0; // 다리에 적재된 무게

        for (int truckWeight : truck_weights) { // 트럭 배열 루프
            while (true) {
                if (queue.isEmpty()) { // Queue가 비었을때
                    queue.add(truckWeight);
                    sum += truckWeight;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) { // 큐의 크기가 다리의 길이와 같은 때
                    sum -= queue.poll();
                } else {
                    if (sum + truckWeight > weight) { // 큐에 적재된 무게 + 트럭 무게가 수용 가능한 무게를 넘었을 때
                        answer++;
                        queue.offer(0);
                    } else { // 현재 무게를 충분히 수용 가능할 때
                        queue.add(truckWeight);
                        sum+=truckWeight;
                        answer++;
                        break;
                    }
                }
            }
        }

        LOGGER.info("finish");
        return answer + bridge_length;
    }
}
