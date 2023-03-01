import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeC=before.toCharArray();
        char[] afterC=after.toCharArray();

        Arrays.sort(beforeC);
        Arrays.sort(afterC);

        String beS = new String(beforeC);
        String afS = new String(afterC);

        if(beS.equals(afS)){
            return 1;
        }else{
            return 0;
        }
    }
}