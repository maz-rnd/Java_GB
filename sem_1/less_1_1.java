/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 */
public class less_1_1 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word1.length() || i < word2.length(); i++) {

            if (i < word1.length())
                result.append(word1.charAt(i));

            if (i < word2.length())
                result.append(word2.charAt(i));
        }

        return result.toString();
    }

}
