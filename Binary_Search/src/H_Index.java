class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int lb=0;
        int ub=n-1;
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