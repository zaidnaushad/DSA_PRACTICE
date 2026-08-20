class Solution {
    public int reverse(int x){
        int y=x;
        int len=0;
        long z=0;
        while(y!=0){
            y=y/10;
            len=len+1;
        }

        for (int i=0;i<len;i++){

            z=z*10+x%10;
            x=x/10;
        }
        if(z>Integer.MAX_VALUE||z<Integer.MIN_VALUE){
            return 0;
        }
        return (int)z;

    }
}