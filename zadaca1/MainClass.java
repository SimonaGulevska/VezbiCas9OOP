package fikt.oop.inki895.zadaca1;

public class MainClass {
    public static void main(String[] args){
        Vraboten vraboten = new Vraboten();
        vraboten.setIme("Stefan");
        vraboten.setPrezime("Stefanovski");
        vraboten.setPlata(10000);

        Xml xml = new Xml();
        xml.createXmlFile("zadaca1.xml", vraboten);
    }
}
