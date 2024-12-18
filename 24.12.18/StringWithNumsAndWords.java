
/*
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithNumsAndWords {
    
    public static int solution(String s) {
        HashMap<String, Integer> wordToNum = new HashMap<>();
        wordToNum.put("zero", 0);
        wordToNum.put("one", 1);
        wordToNum.put("two", 2);
        wordToNum.put("three", 3);
        wordToNum.put("four", 4);
        wordToNum.put("five", 5);
        wordToNum.put("six", 6);
        wordToNum.put("seven", 7);
        wordToNum.put("eight", 8);
        wordToNum.put("nine", 9);
        
        StringBuilder patternBuilder = new StringBuilder();
        wordToNum.keySet().forEach(key -> {
            if (patternBuilder.length() > 0)
                patternBuilder.append("|");
            patternBuilder.append(key);
        });
        String pattern = "(" + patternBuilder.toString() + "|\\d)";

        StringBuilder numericString = new StringBuilder();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        while (m.find()) {
            String found = m.group();
            if (wordToNum.containsKey(found)) {
                numericString.append(wordToNum.get(found));
            } else {
                numericString.append(found);
            }
        }

        return Integer.parseInt(numericString.toString());
    }

    public static void main(String[] args) {
        System.out.println("출력값 : " + solution("1zerotwozero3"));
    }
}