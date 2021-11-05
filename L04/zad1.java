import java.util.ArrayList;

public class zad1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> out=new ArrayList<Integer>();
        out.addAll(a);
        out.addAll(b);
        return out;
    }
    public static void main(String[] args){
        ArrayList<Integer> la = new ArrayList<>();
        la.add(1);
        la.add(2);
        la.add(3);
        ArrayList<Integer> lb = new ArrayList<>();
        lb.add(6);
        lb.add(7);
        lb.add(8);

        System.out.println(append(la,lb));
    }
}
