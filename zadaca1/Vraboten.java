package fikt.oop.inki895.zadaca1;

public class Vraboten {
    private String ime;
    private String prezime;
    private int plata;

    public Vraboten(){
        ime="";
        prezime="";
        plata=0;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public int getPlata(){
        return plata;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public void setPlata(int plata){
        this.plata=plata;
    }
}
