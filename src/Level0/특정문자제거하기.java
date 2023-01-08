class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String let = "";
        for(int i=0; i<my_string.length();i++){
            let = my_string.substring(i,i+1);
            if(!letter.equals(let)){
                answer += my_string.substring(i,i+1);
            }
        }
        return answer;
    }
}