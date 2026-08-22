class Solution {
    public boolean search(int[] nums, int target) {
        int lb=0,ub=nums.length-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if (nums[mid]==target) return true;
            // to decide which half is sorted
            if(nums[lb]==nums[mid]&&nums[mid]==nums[ub]){
                lb++;
                ub--;
            }
            // left half is sorted
            else if(nums[lb]<=nums[mid]){
                if(nums[lb]<=target&&target<nums[mid]){
                    ub=mid-1;
                } else{
                    lb=mid+1;
                }
            }
            // right half is sorted
            else{
                if(nums[mid]<target&&target<=nums[ub]) {
                    lb=mid+1;
                } else{
                    ub=mid-1;
                }
            }
        }
        return false;

    }
}