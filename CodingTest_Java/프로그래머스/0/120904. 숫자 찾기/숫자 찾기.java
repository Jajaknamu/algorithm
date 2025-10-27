import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str1 = Integer.toString(num);
        List<String> stringList = Arrays.asList(str1.split(""));
        
        for(int i=0; i<stringList.size(); i++){
            if(stringList.get(i).equals(Integer.toString(k))){
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}