class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int pro=0;
        int max=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                pro=(nums[i]-1)*(nums[j]-1);
                if(pro>=max){
                    max=pro;
                }
            }
        }return max;
    }
}
