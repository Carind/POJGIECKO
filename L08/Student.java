import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
//package pl.imiajd.giecko;
public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public Student(String nazwisko,LocalDate dataUrodzenia,double sredniaOcen){
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    @Override
    public int compareTo(Osoba os){
        Student ost = (Student)os;
        if(super.compareTo(os)==0)
            if(this.sredniaOcen==ost.getSredniaOcen())
                return -4;
        return -5;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return  " Nazwisko: " + this.getNazwisko() +
                " Data urodzenia: " + this.getDataUrodzenia().format(formatter) +
                " Srednia: "+this.sredniaOcen;
    }
}
