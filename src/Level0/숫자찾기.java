class Solution {
    public int solution(int num, int k) {
        String s = num+"";
        String ms = k+"";
        int answer = s.indexOf(ms);
        return answer>-1 ? ++answer :answer;
    }
}