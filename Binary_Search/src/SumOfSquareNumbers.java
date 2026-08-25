class Solution {
    public boolean judgeSquareSum(int c) {
        long lb=0,ub=(long)Math.sqrt(c);
        while(lb<=ub){

            long sum=lb*lb+ub*ub;
            if( sum==c){
                return true;


            }
            else if(sum<c){
                lb=lb+1;
            }
            else{
                ub=ub-1;
            }
        }
        return false;

    }
}