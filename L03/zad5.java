import java.math.BigDecimal;
public class zad5 {
    public static void main(String[] args){
        BigDecimal k = new BigDecimal(args[0]);
        BigDecimal p = new BigDecimal(args[1]);
        int n = Integer.parseInt(args[2]);
        BigDecimal sum = new BigDecimal("0");
        for(int i=0;i<n;i++){
            k=k.multiply(p);
        }
        System.out.print(k);
    }
}
