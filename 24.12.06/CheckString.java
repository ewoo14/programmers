/*
 * 문자열 다루기 기본
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */

public class CheckString {
    
    private static boolean solution(String s) {
        boolean answer = true;
        char[] arr;
        arr = s.toCharArray();

        for (char ch : arr) {
            if (!Character.isDigit(ch)) {
                answer = false;
            }
        }

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("1234"));
    }
}