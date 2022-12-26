/*
 * Given an input string s, reverse the order of the words.
 * 
 */
public class less_1_4 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        return result.toString();

    }
}
