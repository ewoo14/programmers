/*
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
import java.util.*;

public class AddNoExistNum {
    
    private static int solution(int[] numbers) {
        int answer = -1;
        int[] allNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        answer = Arrays.stream(allNumbers).filter(num -> Arrays.stream(numbers).noneMatch(x -> x == num)).sum();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + (solution(new int[] {5,8,4,0,6,7,9})));
    }
}