/*
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
import java.util.*;

public class DeleteMinNum {
    
    private static int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        answer = Arrays.stream(arr).filter(value -> value != min).toArray();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + Arrays.toString(solution(new int[] {10})));
    }
}