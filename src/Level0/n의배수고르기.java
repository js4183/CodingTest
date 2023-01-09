class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[100];
        int index =0;
        int index2 =0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                arr[index]=n;
                index++;
            }
        }
        int[] answer = new int[index];
        for(int j=0;j<numlist.length;j++){
            if(numlist[j]%n==0){
                answer[index2]=numlist[j];
                index2++;
            }
        }

        return answer;
    }
}