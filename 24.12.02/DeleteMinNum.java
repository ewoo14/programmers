/*
 * 가운데 글자 가져오기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
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