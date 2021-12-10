import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
//package pl.imiajd.giecko;
public class main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < args.length; i++){
            list.add(args[i]);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Po sorcie: ");
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
