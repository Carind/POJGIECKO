//package pl.imiajd.giecko;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Ibisz", LocalDate.parse("1999-03-02")));
        grupa.add(new Osoba("Nowak", LocalDate.parse("1999-03-03")));
        grupa.add(new Osoba("Abc", LocalDate.parse("1999-03-04")));
        grupa.add(new Osoba("Nowak", LocalDate.parse("1999-03-05")));
        grupa.add(new Osoba("Kowalski", LocalDate.parse("1999-03-02")));
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
