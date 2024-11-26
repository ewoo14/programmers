/*
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
import java.util.*;

public class Main {
    
    private static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
                count++;
            }
        }

        if (count == 0) {
            list.add(-1);
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + Arrays.toString(solution(new int[]{2, 36, 1 , 3}, 1)));
    }
}