import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] banList = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] speakingList = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            for (String ban : banList) {
                str = str.replace(ban, "X");
            }
            for (String speak : speakingList) {
                str = str.replace(speak, "?");
            }
            int sign =0;
            for(int i=0; i<str.length(); i++){
                if(!str.subSequence(i, i+1).equals("?")){
                    sign = 1;
                    break;
                }
            }
            if (sign==0) {
                answer++;
            }
        }
        return answer;
    }
}