import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {

        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);

        BigInteger answer = c.add(d);

        String e = answer.toString();
        
        return e;
    }
}