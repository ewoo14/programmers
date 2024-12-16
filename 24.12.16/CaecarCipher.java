/*
 * 시저 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */

public class CaecarCipher {
    
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }

            char offset = (Character.isUpperCase(ch) ? 'A' : 'a');
            char newChar = (char) ((ch - offset + n) % 26 + offset);
            answer.append(newChar);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("a B z", 4));
    }
}