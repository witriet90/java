package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String romanNumber = "IV";
        int rusalt = romanInteger(romanNumber);
        System.out.println(romanNumber);
        System.out.println(rusalt);
    }

    public static int romanInteger(String roman) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int rusalt = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            if (i > 0 && numbers.get(ch) > numbers.get(roman.charAt(i - 1))) {
                rusalt += numbers.get(ch) - 2 * numbers.get(roman.charAt(i - 1));
            } else {
                rusalt += numbers.get(ch);
            }
        }
        return rusalt;
    }


}

