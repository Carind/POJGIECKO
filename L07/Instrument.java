//package pl.imiajd.giecko;
import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private java.time.LocalDate rokProdukcji;

    public Instrument(String producent, java.time.LocalDate rokProdukcji) {
        this.producent=producent;
        this.rokProdukcji=rokProdukcji;
    }
    public String getProducent() {
        return producent;
    }
    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    public abstract String dzwiek();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
