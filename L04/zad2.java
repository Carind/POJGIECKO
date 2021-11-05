import java.util.ArrayList;

public class zad2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> out=new ArrayList<Integer>();
        for(int i=0;i<a.size()&&i<b.size();i++){
            out.add(a.get(i));
            out.add(b.get(i));
        }
        if(a.size()>b.size()){
            for(int i=b.size();i<a.size();i++){
                out.add(a.get(i));
            }
        }
        else{
            for(int i=a.size();i<b.size();i++){
                out.add(b.get(i));
            }
        }
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
        lb.add(9);
        System.out.println(merge(la,lb));
    }
}
