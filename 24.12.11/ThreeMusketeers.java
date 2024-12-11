/*
 * 삼총사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

public class ThreeMusketeers {
    
    public static int solution(int[] number) {
        int[] answer = {0};
        combine(number, new int[3], 0, 0, answer);
        return answer[0];
    }

    private static void combine(int[] number, int[] result, int start, int depth, int[] answer) {
        if (depth == 3) {
            if (result[0] + result[1] + result[2] == 0) {
                answer[0]++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            result[depth] = number[i];
            combine(number, result, i + 1, depth + 1, answer);
        }
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(new int[] {-1, 1, -1, 1}));
    }
}