class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while(chicken>=10){
            int servc = chicken / 10;
            int coupon = chicken % 10;
            chicken = servc + coupon;
            answer += servc;
        }

        return answer;
    }
}