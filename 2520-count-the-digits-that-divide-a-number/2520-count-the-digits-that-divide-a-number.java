class Solution {
    public int countDigits(int num) {
        int count = 0;
        int org = num;
        while(num>0){
            int val = num%10;
            num/=10;
            if(val!=0 && org % val == 0){
                count++;
            }
       }return count;
    }
}