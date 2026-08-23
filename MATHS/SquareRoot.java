class Solution {
    public int mySqrt(int x) {
        int lb=0;
        int ub=x;
        int fl=0;
        while(lb<=ub){
            int m=lb+(ub-lb)/2;
            long sq=(long)m*m;
            if(sq>x){
                ub=m-1;
            }
            else{
                fl=m;
                lb=m+1;
            }
        }
        return fl;
    }
}