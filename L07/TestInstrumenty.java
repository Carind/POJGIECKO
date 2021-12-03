import java.time.LocalDate;
import java.util.*;
//package pl.imiajd.giecko;
public class TestInstrumenty{
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();

        orkiestra.add (new Flet("Yamaha", LocalDate.of(2010,2,15)));
        orkiestra.add (new Fortepian("Seiler",LocalDate.of(1970,2,16)));
        orkiestra.add (new Skrzypce("Stainer",LocalDate.of(1970,2,16)));
        orkiestra.add (new Skrzypce("Stainer",LocalDate.of(2005,2,16)));
        orkiestra.add (new Flet("Yamaha",LocalDate.of(2017,2,16)));

        for (Instrument p : orkiestra) {
            System.out.println(p.dzwiek());
        }
        for (Instrument p : orkiestra) {
            System.out.println(p.getClass().getName()+" Producent: "+p.getProducent()+" Rok produkcji: "+p.getRokProdukcji());
        }
    }
}