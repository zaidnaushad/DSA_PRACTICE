class Solution {
    public int search(int[] nums, int target) {
        int ub=nums.length-1;
        int lb=0;
        int m=0;
        while(lb<=ub){
            m=(lb+ub)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                lb=m+1;
            }
            else{
                ub=m-1;
            }
        }
        return -1;
    }
}