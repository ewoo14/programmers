/*
 * 3진법 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */

public class ReverseTernary {
    
    private static int solution(int n) {
        int answer = 0;
        String ternary = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(ternary);
        String reverse = sb.reverse().toString();
        answer = Integer.parseInt(reverse, 3);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(125));
    }
}