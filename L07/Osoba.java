//package pl.imiajd.giecko;
abstract class Osoba
{
    public Osoba(String nazwisko, String imiona, java.time.LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getImiona(){
        return imiona;
    }
    public java.time.LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    public  boolean getPlec(){
        return  plec;
    }

    private String nazwisko;
    private String imiona;
    private java.time.LocalDate dataUrodzenia;
    private boolean plec;
}