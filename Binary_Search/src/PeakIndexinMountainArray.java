class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lb=0,ub=n-1,mid=0;

        while(lb<ub){
            mid=lb+(ub-lb)/2;
            if(arr[mid]<arr[mid+1]){

                lb=mid+1;

            }
            else if(arr[mid]>arr[mid+1]){
                ub=mid;

            }
        }
        return lb;

    }

}