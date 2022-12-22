package fikt.oop.inki895.zadaca1;
import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml {
    public void createXmlFile(String fName, Vraboten v){
        try{
            //Креирање на документ
            DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder doc=docFactory.newDocumentBuilder();
            Document document=doc.newDocument();
            //Креирање на елементите на документот
            //Креирање на root елементот
            Element root=document.createElement("Vraboten");
            //Креирање на елементот - Име
            Element ime=document.createElement("Ime");
            //Креирање на елементот - Презиме
            Element prezime=document.createElement("Prezime");
            //Креирање на елементот - Плата
            Element plata=document.createElement("Plata");

            root.appendChild(ime);
            root.appendChild(prezime);
            root.appendChild(plata);
            //Доделување вредности
            ime.appendChild(document.createTextNode(v.getIme()));
            prezime.appendChild(document.createTextNode(v.getPrezime()));
            plata.appendChild(document.createTextNode(String.valueOf(v.getPlata())));

            document.appendChild(root);
            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource source=new DOMSource(document);
            File f=new File(fName);
            StreamResult result=new StreamResult(f);
            transformer.transform(source,result);
            System.out.println("Dokumentot e kreiran i negovoto ime e: "+fName);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
