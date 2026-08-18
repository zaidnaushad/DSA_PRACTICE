class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                flag=1;
            }
        }
        if(flag==0){
            return false;
        }
        else{
            return true;
        }

    }
}