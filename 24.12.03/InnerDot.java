/*
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */

public class InnerDot {
    
    private static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(new int[] {-1,0,1}, new int[] {1,0,-1}));
    }
}