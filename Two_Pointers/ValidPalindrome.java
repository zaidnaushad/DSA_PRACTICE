class Solution {
    public boolean isPalindrome(String s) {

        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int b=s1.length();
        int flag=0;
        for(int i=0;i<b-1;i++){
            char ch,dh;
            ch=s1.charAt(i);
            dh=s1.charAt(b-1);
            if(ch==dh){
                b--;
            }
            else{
                flag++;

            }

        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }


    }

}