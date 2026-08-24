class Solution {
    public boolean isPerfectSquare(int num) {
        int lb=0,ub=num,m=0,c=0;
        while(lb<=ub){
            m=lb+(ub-lb)/2;
            long sq=(long)m*m;
            if(sq==num){
                c=1;
                break;

            }
            else if(sq<num){
                lb=m+1;
            }
            else{
                ub=m-1;
            }
        }
        if(c==1){
            return true;
        }
        else{
            return false;
        }

    }
}