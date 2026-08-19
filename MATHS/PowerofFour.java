class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int c=n;
        while(c%4==0){
            c=c/4;
        }
        if(c==1){
            return true;
        }
        else{
            return false;
        }

    }
}