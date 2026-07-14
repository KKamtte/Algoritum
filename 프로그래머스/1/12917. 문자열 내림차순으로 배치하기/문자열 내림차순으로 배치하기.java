import java.util.*;

class Solution {
    public String solution(String s) {

        char[] chaArray = s.toCharArray();
        Character[] chars = new Character[chaArray.length];
        for (int i = 0; i < chaArray.length; i++) {
            chars[i] = chaArray[i];
        }
        Arrays.sort(chars,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (Character c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}