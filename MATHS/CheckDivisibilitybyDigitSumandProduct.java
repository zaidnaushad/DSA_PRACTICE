class Solution {
    public boolean checkDivisibility(int n) {
        int c=n;
        int s=0,p=1,d=0;
        while(c!=0){
            d=c%10;
            s=s+d;
            p=p*d;
            c=c/10;
        }
        int f=s+p;
        if(n%f==0){
            return true;
        }
        else return false;
    }
}