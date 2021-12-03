//package pl.imiajd.giecko;
class Student extends Osoba
{
    public Student(String nazwisko, String imiona, java.time.LocalDate dataUrodzenia, boolean plec, String kierunek)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getSredniaOcen(){
        return sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
