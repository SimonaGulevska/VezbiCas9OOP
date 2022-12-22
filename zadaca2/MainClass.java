package fikt.oop.inki895.zadaca2;
import java.util.List;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){
        List<Vraboten> listaNaVraboteni = new ArrayList<Vraboten>();

        listaNaVraboteni.add(new Vraboten("Stefan", "Stefanovski", 10000));
        listaNaVraboteni.add(new Vraboten("Aleksandar", "Ristevski", 15000));
        Xml x1 = new Xml();
        x1.createXmlFile("zadaca2.xml", listaNaVraboteni);
    }
}
