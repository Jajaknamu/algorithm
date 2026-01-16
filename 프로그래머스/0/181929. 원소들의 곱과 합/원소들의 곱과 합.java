class Solution {
    public int solution(int[] num_list) {
         int answer = 0;
        int num = 1; //원소들의 곱
        int sum = 0; //원소들의 합의 제곱
        for(int i = 0; i < num_list.length; i++){
            num *= num_list[i];
            sum = sum + num_list[i];
        }
        sum = sum * sum;

        if (num < sum) {
            answer = 1;
        }
        return answer;
    }
}