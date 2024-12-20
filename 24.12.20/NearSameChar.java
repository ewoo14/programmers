/*
 * 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NearSameChar {

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastPos = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastPos.containsKey(currentChar)) {
                answer[i] = i - lastPos.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastPos.put(currentChar, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + Arrays.toString(solution("banana")));
    }
}