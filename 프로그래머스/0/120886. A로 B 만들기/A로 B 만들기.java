import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] charBefore = before.toCharArray();
        char[] charAfter = after.toCharArray();
        
        Arrays.sort(charBefore);
        Arrays.sort(charAfter);
        
        if(Arrays.equals(charBefore,charAfter)){
            return 1;
        } else return 0;
    }
}