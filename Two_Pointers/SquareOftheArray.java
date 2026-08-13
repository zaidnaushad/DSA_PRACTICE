package Two_Pointers;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int j=0;

        int dup;
        for(int i=0;i<nums.length;i++){
            for(j=0;j<nums.length-1-i;j++){
                int k=j+1;
                if(nums[j]>nums[k]){
                    dup=nums[j];
                    nums[j]=nums[k];
                    nums[k]=dup;
                }

            }

        }
        return nums;}}

