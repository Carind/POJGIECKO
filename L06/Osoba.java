//package pl.imiajd.giecko;
public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    @Override
    public String toString() {
        return nazwisko + " " + rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
}
