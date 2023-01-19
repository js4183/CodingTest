class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;

        for(int z=i; z<=j; z++){
            String tmp = Integer.toString(z);
            if(tmp.contains(String.valueOf(k))){
                int check =z;
                while (check!=0){
                    if(check%10==k){
                        cnt++;
                        check /= 10;
                    }else{
                        check /= 10;
                    }
                }
            }
        }
        return cnt;
    }
}