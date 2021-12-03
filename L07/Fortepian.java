//package pl.imiajd.giecko;
public class Fortepian extends Instrument{
    public Fortepian(String producent, java.time.LocalDate rokProdukcji) {
        super(producent,rokProdukcji);
    }
    public String dzwiek(){
        return String.format("dum dum dum");
    }
}
