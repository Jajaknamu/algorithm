import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] result = new String[r+1];
        for (int i=l; i<=r; i++){
            result[i] = String.valueOf(i);
            if (result[i].replace("0","").replace("5","").isEmpty()){
                answer.add(i);
            }
        }
        if (answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}