class Solution {
    public int[] solution(int n) {
        int[] arr = new int[10000];
        int index = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[index]=i;
                index++;
            }
        }
        int[] answer = new int[index];
        for(int j=0;j<index;j++){
            if(arr[j]!=0){
                answer[j]=arr[j];
            }
        }
        return answer;
    }
}