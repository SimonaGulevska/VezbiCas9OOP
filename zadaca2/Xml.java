package fikt.oop.inki895.zadaca2;
import java.util.List;
import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml {
    public void createXmlFile(String fName, List<Vraboten> vraboteni) {
        try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder doc = docFactory.newDocumentBuilder();
        Document document = doc.newDocument();

        Element root = document.createElement("Vraboteni");
        document.appendChild(root);
        for (Vraboten v : vraboteni) {
            Element vraboten = document.createElement("Vraboten");
            root.appendChild(vraboten);

            Element ime = document.createElement("Ime");
            vraboten.appendChild(ime);
            ime.appendChild(document.createTextNode(v.getIme()));

            Element prezime = document.createElement("Prezime");
            vraboten.appendChild(prezime);
            prezime.appendChild(document.createTextNode(v.getPrezime()));

            Element plata = document.createElement("Plata");
            vraboten.appendChild(plata);
            plata.appendChild(document.createTextNode(String.valueOf(v.getPlata())));
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        File f = new File(fName);
        StreamResult result = new StreamResult(f);
        transformer.transform(source, result);
        System.out.println("Dokumentot e kreiran i negovoto ime e: " + fName);
    }
    catch(Exception e){
        System.out.println(e.toString());
    }
  }
}


