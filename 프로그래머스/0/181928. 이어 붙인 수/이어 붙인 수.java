class Solution {
    public int solution(int[] num_list) {
         int answer = 0;
        String oddNum = "";
        String evenNum = "";

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                oddNum += num_list[i];
            } else{
                evenNum += num_list[i];
            }
        }
        int odd = Integer.parseInt(oddNum);
        int even = Integer.parseInt(evenNum);

        answer = odd + even;

        return answer;
    }
}