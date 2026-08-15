class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int c=0;
        int d=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                c=c+1;
            }
            if(c>d){
                d=c;
            }
            if(nums[i]==0){
                c=0;
            }
        }return d;
    }
}
