public class 짝수는싫어요 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n) {
                int arrN;
                if(n%2==1){
                    arrN=n/2+1;
                }else{
                    arrN=n/2;
                }

                int[] answer = new int[arrN];
                int addN=0;
                for(int i= 1; i<=n;i++){
                    if(i%2==1){
                        answer[addN]=i;
                        addN++;
                    }
                }
                return answer;
            }
        }
    }
}