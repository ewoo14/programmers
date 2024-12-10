/*
 * 이상한 문자 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeWeirdString {
    
    private static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1);
        for (int j = 0; j < arr.length; j++) {
            String word = arr[j];
            String processedWord = IntStream.range(0, word.length())
                .mapToObj(i -> {
                    char c = word.charAt(i);
                    if ((i + 1) % 2 != 0) {
                        return Character.toString(Character.toUpperCase(c));
                    } else {
                        return Character.toString(Character.toLowerCase(c));
                    }
                }).collect(Collectors.joining());
            
            answer.append(processedWord);
            if (j < arr.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("try hello world"));
    }
}