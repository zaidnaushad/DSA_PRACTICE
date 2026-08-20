class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];
        int id=1;
        int id1=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[id1]=nums[i];
                id1+=2;
            }
            else{
                arr[id]=nums[i];
                id+=2;
            }

        }
        return arr;
    }
}