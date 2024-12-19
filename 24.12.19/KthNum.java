/*
 * K번째수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthNum {
    
    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] command: commands) {
            int[] newArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(newArray);
            answerList.add(newArray[command[2] - 1]);
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println("출력값 : " + Arrays.toString(result));
    }
}