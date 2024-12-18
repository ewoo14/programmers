/*
 * 문자열 내 마음대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */

import java.util.Arrays;
import java.util.Comparator;

public class SortStringForMe {
    
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) != s2.charAt(n)) {
                    return s1.charAt(n) - s2.charAt(n);
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"abce", "abcd", "cdx"};
        int n = 2;
        String[] result = solution(input, n);
        System.out.println("출력값 : " + Arrays.toString(result));
    }
}