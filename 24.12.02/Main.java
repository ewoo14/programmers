/*
 * 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

public class Main {
    
    private static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        char first = '수';
        char second = '박';

        for (int i=0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append(first);
            } else {
                answer.append(second);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(4));
    }
}