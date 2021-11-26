//package pl.imiajd.giecko;
public class Student extends Osoba{
    private String kierunek;

    @Override
    public String toString() {
        return this.getNazwisko() + " " + this.getRokUrodzenia() + " "+this.kierunek;
    }
}
