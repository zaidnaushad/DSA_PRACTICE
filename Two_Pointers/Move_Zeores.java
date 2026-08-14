package Two_Pointers;

class Solution {
    public void moveZeroes(int[] nums){
        int i=0;
        int n=nums.length;
        int[] temp=new int[n];
        int j=0;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j=j+1;
            }
        }
        i=0;
        for(j=0;j<temp.length;j++){

            nums[i]=temp[j];
            i=i+1;

        }
        for(i=temp.length;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
