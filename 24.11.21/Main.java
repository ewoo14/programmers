/*
 * 정수 내림차순으로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    private static long solution(long n) {
        long answer = 0;
        long rest = 0;
        ArrayList<Long> array = new ArrayList<>();
        while (n > 0) {
            rest = n % 10;
            array.add(rest);
            n /= 10;
        }
        Collections.sort(array, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Long num : array) {
            sb.append(num);
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(118372));
    }
}