import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (o1, o2) ->{
            if(o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            else return Integer.compare(o1[0], o2[0]);
        });
        answer = Math.abs(dots[0][1] - dots[3][1]) * Math.abs(dots[0][0]-dots[3][0]);
        return answer;
    }
}