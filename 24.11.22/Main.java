/*
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */

public class Main {
    
    private static boolean solution(int x) {
        boolean answer = true;
        int first = x;
        int num = 0;
        int sum = 0;
        while (x > 0) {
            num = x % 10;
            sum += num;
            x /= 10;
        }
        if (first % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(13));
    }
}