
public class Solution {

    public String reverseWords(String s) {

        int start = s.length();
        int end = start + 1;
        StringBuilder sb = new StringBuilder();

        while (start < end) {

            end = --start;
            while (end >= 0 && Character.isSpaceChar(s.charAt(end))) {
                end--;
            }

            start = end;
            while (start >= 0 && !Character.isSpaceChar(s.charAt(start))) {
                start--;
            }

            sb.append(s.substring(++start, ++end)).append(" ");
        }

        return sb.toString().trim();
    }
}
