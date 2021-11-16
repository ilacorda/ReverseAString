/*
 * Implement many ways to reverse a String
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverse {

    public static void main(String[] args) {
        String testString = "Strings are immutable";

        String reversedStringMethodOne = new StringReverse().reverseAStringOne(testString);
        System.out.println("reversed test String - method 1 " + reversedStringMethodOne);

        String reversedStringMethodTwo = new StringReverse().reverseAStringTwo(testString);
        System.out.println("reversed test String - method 2 " + reversedStringMethodTwo);

        String reversedStringMethodThree = new StringReverse().reverseAStringThree(testString);
        System.out.println("reversed test String - method 3 " + reversedStringMethodThree);
    }

    // StringBuilder approach
    private String reverseAStringOne(String str) {
        return String.valueOf(new StringBuilder(str).reverse());
    }

    // Java Collections Framework reverse() method
    private String reverseAStringTwo(String str) {
        // create an empty list of characters
        List<Character> list = new ArrayList<>();

        // push every character of the given string into it
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);

        StringBuilder builder = new StringBuilder(list.size());
        for (Character c : list) {
            builder.append(c);
        }
        return builder.toString();

    }

    // By Recursion
    private String reverseAStringThree(String str) {
        if (str.isEmpty())
            return str;
        return reverseAStringThree(str.substring(1)) + str.charAt(0);
    }
}
