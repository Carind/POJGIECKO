//package pl.imiajd.giecko;
public class Nauczyciel extends Osoba{
    private float pensja;

    @Override
    public String toString() {
        return this.getNazwisko() + " " + this.getRokUrodzenia() + " "+this.pensja;
    }
}
