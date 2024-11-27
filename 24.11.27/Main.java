/*
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */

public class Main {
    
    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
}