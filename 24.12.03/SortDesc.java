/*
 * 문자열 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */

import java.util.Arrays;

public class SortDesc {
    
    private static String solution(String s) {
        String answer = "";
        char[] list = s.toCharArray();
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder(new String(list));
        answer = sb.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("Zbcdefg"));
    }
}