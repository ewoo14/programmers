/*
 * 서울에서 김서방 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */

public class Main {
    
    private static String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        for (String num : seoul) {
            if (num.equals("Kim")){
                break;
            }
            count++;
        }
        answer = "김서방은 " + count + "에 있다";
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println("출력값 : " + solution(seoul));
    }
}