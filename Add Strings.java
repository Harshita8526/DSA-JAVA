import java.math.BigDecimal;
class Solution {
    public String addStrings(String num1, String num2) {
        BigDecimal n1=new BigDecimal(num1);
        BigDecimal n2=new BigDecimal(num2);
        BigDecimal sum=n1.add(n2);
        String result=sum.toString();
        return result;
    }
}
