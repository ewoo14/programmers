

/*
 * 최대공약수와 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */

public class GCD_LCM {
    
    private static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int GCD = 0;
        int LCM = 0;
        for (int i=1; i<=min; i++) {
            if (n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }

        LCM = n * m / GCD;
        answer[0] = GCD;
        answer[1] = LCM;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(3, 12));
    }
}