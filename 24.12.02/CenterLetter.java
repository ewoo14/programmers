/*
 * 가운데 글자 가져오기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */

public class CenterLetter {
    
    private static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();
        char[] arr = s.toCharArray();

        if (len % 2 == 0) {
            int middle_1 = len / 2 - 1;
            int middle_2 = len / 2;
            answer.append(arr[middle_1]);
            answer.append(arr[middle_2]);
        } else {
            int middle = len / 2;
            answer.append(arr[middle]);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("qwer"));
    }
}