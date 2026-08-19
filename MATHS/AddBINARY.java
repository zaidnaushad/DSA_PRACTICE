class Solution {
   public String addBinary(String a, String b) {
        java.math.BigInteger i= new java.math.BigInteger(a,2);
        java.math.BigInteger j= new java.math.BigInteger(b,2);
        java.math.BigInteger c=i.add(j);
        String d=c.toString(2);
        return d;

    }
}
//Brute Brute