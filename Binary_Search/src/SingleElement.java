class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lb=0,ub=nums.length-1,single=0,m=0;
        while(lb<ub){
            m=lb+(ub-lb)/2;
            if(m%2==0){
                if(nums[m]!=nums[m+1]){
                    ub=m;


                }
                else{
                    lb=m+2;
                }
            }
            else{
                if(nums[m]!=nums[m-1]){
                    ub=m-1;

                }
                else{
                    lb=m+1;
                }
            }
        }return nums[lb];
    }
}