package baroja.lenmar.tema4.Arantxa;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TiendaTest {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\Arantxa\\";
    static TiendaARG miPapeleria = new TiendaARG();

    // Método para pasar de xml a objeto
    private static void unmarchalling(){
        try {
            JAXBContext context = JAXBContext.newInstance(TiendaARG.class);
            Unmarshaller um = context.createUnmarshaller();

            miPapeleria = (TiendaARG) um.unmarshal(new File(RUTA_FICH+"tienda.xml"));
            System.out.println("La papelería de Arantxa tiene: " + miPapeleria);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // método para pasar de objeto a xml
    private static void marshalling() {
        try {
            JAXBContext context = JAXBContext.newInstance(TiendaARG.class);
            Marshaller marshal = context.createMarshaller();
            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshal.marshal(miPapeleria, new File(RUTA_FICH+"tiendaOUT.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unmarchalling();
        marshalling();
    }
}
