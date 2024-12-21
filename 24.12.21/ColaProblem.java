/*
 * 콜라 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */

public class ColaProblem {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;

        while (empty >= a) {
            int newCola = empty / a;
            answer += newCola;
            empty = empty % a + newCola * b;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(3, 1, 20));
    }
}