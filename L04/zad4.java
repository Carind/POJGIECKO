import java.util.ArrayList;

public class zad4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> out= new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--){
            out.add(a.get(i));
        }
        return out;
    }
    public static void main(String[] args){
        ArrayList<Integer> lb = new ArrayList<>();
        lb.add(6);
        lb.add(7);
        lb.add(8);
        lb.add(9);
        System.out.println(reversed(lb));
    }
}
