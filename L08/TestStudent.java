//package pl.imiajd.giecko;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
//package pl.imiajd.giecko;
public class TestStudent {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Student("Ibisz", LocalDate.parse("1999-03-02"),2));
        grupa.add(new Student("Nowak", LocalDate.parse("1999-03-03"),3));
        grupa.add(new Student("Abc", LocalDate.parse("1999-03-04"),4));
        grupa.add(new Student("Nowak", LocalDate.parse("1999-03-05"),5));
        grupa.add(new Student("Kowalski", LocalDate.parse("1999-03-02"),6));
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
        Collections.sort(grupa);
        System.out.println("Po sorcie:");
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
    }
}
