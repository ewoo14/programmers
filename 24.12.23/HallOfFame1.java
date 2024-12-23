/*
 * 명예의 전당 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame1 {

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.offer(score[i]);
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        HallOfFame1 hallOfFame1 = new HallOfFame1();
        int[] result = hallOfFame1.solution(k, score);
        System.out.println("출력값 : " + Arrays.toString(result));
    }
}