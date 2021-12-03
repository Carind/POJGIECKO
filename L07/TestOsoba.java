import java.time.LocalDate;
import java.util.*;
//package pl.imiajd.giecko;
public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski","Jan", LocalDate.of(1999,2,15),true, 50000);
        ludzie[1] = new Student("Nowak","Malgorzata",LocalDate.of(200,2,16),false, "informatyka");
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}