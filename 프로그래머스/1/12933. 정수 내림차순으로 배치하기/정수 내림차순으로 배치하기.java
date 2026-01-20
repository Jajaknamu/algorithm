import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        String result = "";
        String string = String.valueOf(n);
        String[] split = string.split("");

        Arrays.sort(split, Collections.reverseOrder());

        for (int i = 0; i < split.length; i++) {
            result += split[i];
        }

        long answer = Long.parseLong(result);
        return answer;
    }
}