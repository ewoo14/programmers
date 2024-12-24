/*
 * 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */

public class YEAR2016 {

    public static String solution(int a, int b) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b;

        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int dayIndex = (totalDays - 1) % 7;
        String answer = daysOfWeek[dayIndex];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution(5,24));
    }
}