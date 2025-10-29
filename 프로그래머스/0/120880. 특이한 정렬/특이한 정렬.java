class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
         for(int i=0; i<numlist.length-1; i++){
            for(int j=i+1; j<numlist.length; j++){
                int distA = Math.abs(numlist[i] - n);
                int distB = Math.abs(numlist[j] - n);
                
                if(distA > distB || (distA==distB && numlist[i]<numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
         }
        return numlist;
    }
}