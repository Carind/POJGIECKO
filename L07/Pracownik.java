//package pl.imiajd.giecko;
class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String imiona, java.time.LocalDate dataUrodzenia, boolean plec, double pobory)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }
    public java.time.LocalDate getDataZarudnienia(){
        return dataZarudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
    private java.time.LocalDate dataZarudnienia;
}