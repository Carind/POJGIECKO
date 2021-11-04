import java.math.BigInteger;
public class zad4 {
    public static void main(String[] args){
        BigInteger sum = new BigInteger("1");
        BigInteger cn = new BigInteger("1");
        int n = Integer.parseInt(args[0]);
        BigInteger itwo = new BigInteger("2");
        for(int i=1;i<n*n;i++){
            cn=cn.multiply(itwo);
            sum=sum.add(cn);
        }
        System.out.print(sum);
    }
}
