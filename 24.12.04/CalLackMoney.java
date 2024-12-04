/*
 * 부족한 금액 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */

public class CalLackMoney {
    
    private static long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for (int num=1; num<=count; num++) {
            total += price * num;
        }
        answer = total - money;
        return answer > 0 ? answer : 0;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(3, 20, 4));
    }
}