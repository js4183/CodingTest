class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length /n][n];
        for (int i = 0; i < answer.length; i++) {
            int[] arr = new int[n];

            for (int j = 0; j < answer[i].length; j++) {
                arr[j] = num_list[i*n+j];
            }
            answer[i] =arr;
        }
        return answer;
    }
}