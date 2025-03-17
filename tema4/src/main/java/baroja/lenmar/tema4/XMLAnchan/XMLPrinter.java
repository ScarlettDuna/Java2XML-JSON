package baroja.lenmar.tema4.XMLAnchan;

import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class XMLPrinter {
    public static void imprimirXMLPorPantalla(Document doc2Print) {


    DOMSource domSource = new DOMSource(doc2Print);
    TransformerFactory tf = TransformerFactory.newInstance();
    StringWriter writer = new StringWriter();
    StreamResult result = new StreamResult(writer);
    Transformer transformer;

    try {
        transformer = tf.newTransformer();
        transformer.transform(domSource, result);
        System.out.println("EML generado " + writer.toString());
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}
}


