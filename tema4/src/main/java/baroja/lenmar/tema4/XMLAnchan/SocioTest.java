package baroja.lenmar.tema4.XMLAnchan;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import java.io.File;

public class SocioTest {
    public static void main(String[] args) {
        final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\XMLAnchan\\";
        try {
            // Para procesar el xml necesito un JAXBContext
            JAXBContext contexto = JAXBContext.newInstance(Socio.class);
            // generamos el objeto para leer
            Unmarshaller um = contexto.createUnmarshaller();
            // leenos el xml, obtenemos sus elementos y lo pasamos a objeto socio
            Socio socioEntrada = (Socio) um.unmarshal(new File(RUTA_FICH+"socio.xml"));
            System.out.println("XML leido: " + socioEntrada);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
