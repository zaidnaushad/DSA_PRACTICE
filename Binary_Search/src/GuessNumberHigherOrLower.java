/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=0,c=n,m=0;
        while(i<=c){
            m=i+(c-i)/2;
            int r=guess(m);
            if(r==0){
                return m;
            }
            else if(r==1){
                i=m+1;
            }
            else{
                c=m-1;
            }
        }
        return m;

    }
}