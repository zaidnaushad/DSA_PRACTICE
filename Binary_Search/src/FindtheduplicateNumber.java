class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] dup=new boolean[n];
        int d=0;
        for(int i=0;i<n;i++){
            if(dup[nums[i]]) {
                d=nums[i];
                break;
            }
            dup[nums[i]]=true;
        }
        return d;


    }
}