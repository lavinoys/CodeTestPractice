package com.lavinoys.code;

import com.lavinoys.code.hash.HashExampleFirst;
import com.lavinoys.code.hash.HashExampleFourth;
import com.lavinoys.code.hash.HashExampleSecond;
import com.lavinoys.code.hash.HashExampleThird;
import com.lavinoys.code.stack.StackExampleFirst;
import com.lavinoys.code.stack.StackExampleFourth;
import com.lavinoys.code.stack.StackExampleSecond;
import com.lavinoys.code.stack.StackExampleThird;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class codeUnitTests {

    /**
     * [ 완주하지 못한 선수 ]
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     */
    @Test
    @DisplayName("Hash Test")
    void hashTest() {
        Logger logger = LoggerFactory.getLogger(HashExampleFirst.class);
        HashExampleFirst hash = new HashExampleFirst();

        try {
            logger.info(hash.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
//            logger.info(hash.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 전화번호 목록 ]
     *
     * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
     *
     * phone_book의 길이는 1 이상 1,000,000 이하입니다.
     * 각 전화번호의 길이는 1 이상 20 이하입니다.
     */
    @Test
    @DisplayName("Hash Test 2")
    void hashTest2() {
        Logger logger = LoggerFactory.getLogger(HashExampleSecond.class);
        HashExampleSecond hash = new HashExampleSecond();

        try {
            logger.info("return boolean : {}", hash.solution(new String[]{"119", "97674223", "1195524421"}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 위장 ]
     *
     * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
     * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
     * 같은 이름을 가진 의상은 존재하지 않습니다.
     * clothes의 모든 원소는 문자열로 이루어져 있습니다.
     * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
     * 스파이는 하루에 최소 한 개의 의상은 입습니다.
     */
    @Test
    @DisplayName("Hash Test 3")
    void hashTest3() {
        Logger logger = LoggerFactory.getLogger(HashExampleThird.class);
        HashExampleThird hash = new HashExampleThird();

        try {
            logger.info("count : {}", hash.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
//            logger.info("count : {}", hash.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

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
     */
    @Test
    @DisplayName("Hash Test 4")
    void hashTest4() {
        Logger logger = LoggerFactory.getLogger(HashExampleFourth.class);
        HashExampleFourth hash = new HashExampleFourth();

        try {
//            logger.info("values : {}", hash.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
//            logger.info("values : {}", hash.solution(new String[]{"classic", "classic", "classic", "classic", "pop"}, new int[]{500, 150, 800, 800, 2500}));
            logger.info("values : {}", hash.solution(new String[]{"classic","pop","classic","pop","classic","classic"}, new int[]{400,600,150,2500,500,500}));
        } catch(Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

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
     */
    @Test
    @DisplayName("Stack Test 1")
    void stackTest1() {
        Logger logger = LoggerFactory.getLogger(StackExampleFirst.class);
        StackExampleFirst stack = new StackExampleFirst();

        try {
            logger.info("values : {}", stack.solution(new int[]{1, 2, 3, 2, 3}));
            logger.info("expected values : 4, 3, 1, 1, 0");
            assertArrayEquals(stack.solution(new int[]{1, 2, 3, 2, 3}), new int[]{4, 3, 1, 1, 0});
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

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
     * 입출력 예 #1
     * [93, 30, 55] [1, 30, 5]	[2, 1]
     * 첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
     * 두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
     * 세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
     *
     * 따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
     *
     * (100-55)/5 = 9
     *
     * 입출력 예 #2
     * 모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다. 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.
     *
     * 따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.
     */
    @Test
    @DisplayName("Stack Test 2")
    void stackTest2() {
        Logger logger = LoggerFactory.getLogger(StackExampleSecond.class);
        StackExampleSecond stack = new StackExampleSecond();

        try {
//            assertArrayEquals(stack.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}), new int[]{1, 3, 2});
            assertArrayEquals(stack.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}), new int[]{2, 1});
//            assertArrayEquals(stack.solution(new int[]{95, 95, 95, 95}, new int[]{4, 3, 2, 1}), new int[]{2, 1, 1});
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 다리를 지나는 트럭 ]
     *
     * 문제 설명
     * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
     * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
     *
     * 예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
     *
     * 경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
     * 0	    []              []              [7,4,5,6]
     * 1~2      []              [7]             [4,5,6]
     * 3        [7]             [4]             [5,6]
     * 4        [7]             [4,5]           [6]
     * 5        [7,4]           [5]             [6]
     * 6~7      [7,4,5]         [6]             []
     * 8        [7,4,5,6]       []              []
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
     */
    @Test
    @DisplayName("Stack Test 3")
    void stackTest3() {
        Logger logger = LoggerFactory.getLogger(StackExampleThird.class);
        StackExampleThird stack = new StackExampleThird();

        try {
            assertEquals(stack.solution(2, 10, new int[]{7, 4, 5, 6}), 8);
            assertEquals(stack.solution(100, 100, new int[]{10}), 101);
            assertEquals(stack.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}), 110);
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }

    /**
     * [ 프린터 ]
     *
     * 문제 설명
     * 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
     *
     * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
     * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
     * 3. 그렇지 않으면 J를 인쇄합니다.
     * 예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.
     *
     * 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.
     *
     * 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
     * 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
     * location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
     * 입출력 예
     * priorities           location	return
     * [2, 1, 3, 2]         2           1
     * [1, 1, 9, 1, 1, 1]	0           5
     * 입출력 예 설명
     * 예제 #1
     *
     * 문제에 나온 예와 같습니다.
     *
     * 예제 #2
     *
     * 6개의 문서(A, B, C, D, E, F)가 인쇄 대기목록에 있고 중요도가 1 1 9 1 1 1 이므로 C D E F A B 순으로 인쇄합니다.
     */
    @Test
    @DisplayName("Stack Test 4")
    void stackTest4() {
        Logger logger = LoggerFactory.getLogger(StackExampleFourth.class);
        StackExampleFourth stack = new StackExampleFourth();

        try {
            assertEquals(stack.solution(new int[]{2, 1, 3, 2}, 2), 1);
            assertEquals(stack.solution(new int[]{1, 1, 9, 1, 1, 1}, 0), 5);
        } catch (Exception e) {
            logger.info("Error : {}", e.getMessage());
            logger.info("finish");
        }
    }
}
