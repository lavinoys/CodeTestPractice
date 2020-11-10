package com.lavinoys.code.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExampleFirst {
    static final Logger LOGGER = LoggerFactory.getLogger(StackExampleFirst.class);

    /**
     * [ 주식 가격 ]
     * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
     *
     * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
     * prices의 길이는 2 이상 100,000 이하입니다.
     *
     * 1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
     * 2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
     * 3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
     * 4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
     * 5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
     *
     * 몇초만에 내 주가가 음수이냐(떨어졌냐)를 판단하는 문제네요.
     * prices[2] 가 3인데 다음 숫자가 2니까
     * 1초만에 떨어진것.
     *
     * 즉 prices = [3, 4, 2, 6, 5] 라면
     * 3은 4(1초) 2(2초)로 3보다 작은 2로 떨어진거니까 답은 2초가 됩니다.
     *
     * @param prices
     * @return
     */
    public int[] solution(int[] prices) {
        LOGGER.info("start");
//        answer = Arrays.stream(prices).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int[] answer = new int[prices.length];
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > prices[i + 1]) {
                answer[i] = 1;
                stack.push(new int[] { prices[i + 1], i + 1 });
            } else {
                while (stack.size() > 0 && stack.peek()[0] >= prices[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    answer[i] = prices.length - i - 1;
                } else {
                    answer[i] = stack.peek()[1] - i;
                }
            }
        }

        LOGGER.info("finish");
        return answer;
    }
}
