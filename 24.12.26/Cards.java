/*
 * 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */

public class Cards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;

        for (String word : goal) {
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Cards card = new Cards();
        String result = card.solution(cards1, cards2, goal);

        System.out.println(result);
    }
}