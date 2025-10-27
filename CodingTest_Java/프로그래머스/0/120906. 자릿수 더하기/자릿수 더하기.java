import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        List<String> numlist = Arrays.asList(num.split(""));
        
        for(int i=0; i<numlist.size(); i++){
            answer += Integer.parseInt(numlist.get(i));
        }
        return answer;
    }
}