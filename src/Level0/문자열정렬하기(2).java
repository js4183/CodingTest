import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] stringChar = my_string.toCharArray();
        Arrays.sort(stringChar);
        String answer = "";

        answer = new String(stringChar);

        return answer;
    }
}