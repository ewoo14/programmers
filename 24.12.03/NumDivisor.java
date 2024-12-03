/*
 * 약수의 개수와 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */

public class NumDivisor {
    
    private static int solution(int left, int right) {
        int answer = 0;
        int num = left;
        while (num <= right) {
            int count = 0;

            for (int i=1; i<=num; i++) {
                if (num % i == 0) {
                    count += 1;
                }
            }

            if (count % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }

            num += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(24, 27));
    }
}