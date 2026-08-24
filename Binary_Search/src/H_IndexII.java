class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int lb=0,ub=n-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(citations[mid]>=n-mid){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return n-lb;


    }
}