/*
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */

public class FoodFighterContest {

    public static String solution(int[] food) {
        String answer = "";
        String half = "";
        for (int i=1; i<food.length; i++) {
            int count = food[i] / 2;
            
            for (int j=0; j<count; j++) {
                half += Integer.toString(i);
            }
        }
        String reverse = new StringBuilder(half).reverse().toString();
        answer = half + "0" + reverse;
        return answer;
    }

    public static void main(String[] args) {
        int[] result = new int[] {1, 7, 1, 2};
        System.out.println("출력값 : " + solution(result));
    }
}