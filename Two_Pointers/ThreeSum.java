class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplet=new ArrayList<>();
        int j,r,l,s;
        int target;
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3){
            return triplet;
        }

        for(j=0;j<n-2;j++){
            if(j>0&&nums[j]==nums[j-1]){
                continue;
            }
            if(nums[j]>0){
                break;
            }
            target=-nums[j];
            l=j+1;
            r=n-1;
            while(l<r){
                s=nums[l]+nums[r];
                if(s==target){
                    triplet.add(Arrays.asList(nums[j],nums[l],nums[r]));
                    l=l+1;
                    r=r-1;
                    while(l<r&&nums[l]==nums[l-1]){
                        l=l+1;
                    }
                    while(l<r&&nums[r]==nums[r+1]){
                        r=r-1;
                    }
                }
                else if(s<target){
                    l=l+1;
                }
                else{
                    r=r-1;
                }
            }
        }
        return triplet;
    }
}