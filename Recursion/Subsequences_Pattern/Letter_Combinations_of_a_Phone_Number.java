package Recursion.Subsequences_Pattern;

import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
    public static void generateLetterCombinations(Map<Character, String> letters, String digit, int index,
            StringBuilder curr, List<String> result) {
        if (digit.length() == index) {
            result.add(curr.toString());
            return;
        }

        char currentDigit = digit.charAt(index);
        String currentLetter = letters.get(currentDigit);
        for (int i = 0; i < currentLetter.length(); i++) {
            curr.append(currentLetter.charAt(i));
            generateLetterCombinations(letters, digit, index + 1, curr, result);
            curr.deleteCharAt(curr.length() - 1);
        }

    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String> letters = new HashMap<>();
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");
        generateLetterCombinations(letters, digits, 0, new StringBuilder(), result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
