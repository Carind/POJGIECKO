import java.util.ArrayList;

public class zad5 {
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> out= new ArrayList<Integer>();
        int tmp;
        for(int i=0;i<a.size()/2;i++){
            tmp=a.get(i);
            a.set(i,a.get(a.size()-i-1));
            a.set(a.size()-i-1,tmp);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> lb = new ArrayList<>();
        lb.add(6);
        lb.add(7);
        lb.add(8);
        lb.add(9);
        lb.add(10);
        reverse(lb);
        System.out.println(lb);
    }
}
