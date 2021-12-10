import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
//package pl.imiajd.giecko;
public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(){
        this.nazwisko="";
        this.dataUrodzenia=LocalDate.parse("0000-00-00");
    }

    public Osoba(String nazwisko,LocalDate dataUrodzenia){
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return  " Nazwisko: " + nazwisko +
                " Data urodzenia: " + dataUrodzenia.format(formatter) + ".";
    }
    @Override
    public boolean equals(Object o) {
        Osoba os = (Osoba) o;
        if (os.getNazwisko() == this.nazwisko && os.getDataUrodzenia()==this.dataUrodzenia){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Osoba os){
        if(this.equals(os))
            return 1;
        if(this.nazwisko.equals(os.getNazwisko()))
            return 0;
        if (this.dataUrodzenia.equals(os.getDataUrodzenia()))
            return -1;
        return -2;
    }
}
