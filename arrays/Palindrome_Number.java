class Solution {
    public boolean isPalindrome(int x) {

        int i=x;
        long z=0;
        while(i>0){
            z=z*10+i%10;
            i=i/10;
        }
        if(z==x){
            return true;
        }
        else {
            return false;}
    }
}
