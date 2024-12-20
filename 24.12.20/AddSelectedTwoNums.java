/*
 * 두 개 뽑아서 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddSelectedTwoNums {
    
    public static int[] solution(int[] numbers) {
        Set<Integer> arr = new HashSet<>();
        for (int i=0; i < (numbers.length - 1); i++) {
            for (int j=i+1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                arr.add(temp);
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{5,0,2,7});
        System.out.println("출력값 : " + Arrays.toString(result));
    }
}