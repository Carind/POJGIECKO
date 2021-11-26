//package pl.imiajd.giecko;
public class Adres {
    private String ulica;
    private int numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, String numer_mieszkania,String miasto, String kod_pocztowy){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu,String miasto, String kod_pocztowy){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania="";
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public void pokaz(){
        System.out.printf(this.kod_pocztowy + " " + this.miasto
        + "\n" + this.ulica + this.numer_domu + this.numer_mieszkania);
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }
    public boolean przed(Adres in){
        if(Integer.parseInt(in.getKod_pocztowy())<Integer.parseInt(this.kod_pocztowy)){
            return true;
        }
        else
            return false;
    }

}
