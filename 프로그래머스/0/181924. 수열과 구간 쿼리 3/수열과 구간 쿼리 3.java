class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                int x = queries[i][0];
                int y = queries[i][1];
                for (int k=0; k< arr.length; k++){
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                    answer = arr;
                    break;
                }
                break;
            }
        }
        return answer;
    }
}