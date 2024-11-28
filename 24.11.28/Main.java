/*
 * 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

public class Main {
    
    private static String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        
        for (int i=0; i<(arr.length - 4); i++) {
            arr[i] = '*';
        }

        String answer = new String(arr);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("027778888"));
    }
}