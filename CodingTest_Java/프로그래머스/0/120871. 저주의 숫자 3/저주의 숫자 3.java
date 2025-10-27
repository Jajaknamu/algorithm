import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while(n > 0){
            count++;
            if(count%3 !=0 && !String.valueOf(count).contains("3")) {
                n--;
            }
            answer ++;
        }
        return answer;
    }
}