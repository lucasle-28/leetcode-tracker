// Last updated: 10/25/2025, 2:37:47 PM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ii = a.length() - 1;
        int jj = b.length() - 1;
        int carry = 0;
        while (ii >= 0 || jj >= 0 || carry > 0) {
            int intA;
            int intB;
            int sum = 0;
            if (ii >= 0) {
                intA = a.charAt(ii) - '0';
            }
            else {
                intA = 0;
            }
            if (jj >= 0) {
                intB = b.charAt(jj) - '0';
            }
            else {
                intB = 0;
            }
            sum = intA + intB + carry;
            res.append(sum%2);
            carry = sum/2;
            ii--;
            jj--;
        }
        return res.reverse().toString();
    }
}