package baroja.lenmar.tema4.TestARG;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class BibliotecaTestARG {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\TestARG\\";
    static BibliotecaARG miBiblioteca = new BibliotecaARG();

    // Método para pasar de XML a objeto
    private static void unmarshalling(){
        try {
            JAXBContext contexto = JAXBContext.newInstance(BibliotecaARG.class);
            Unmarshaller um = contexto.createUnmarshaller();
            miBiblioteca = (BibliotecaARG) um.unmarshal(new File(RUTA_FICH+"bibliotecaARG.xml"));
            System.out.println("La biblioteca de Arantxa tiene: " + miBiblioteca);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // método para pasar de objeto a XML
    private static void marshalling(){
        try {
            JAXBContext contexto = JAXBContext.newInstance(BibliotecaARG.class);
            Marshaller marshal = contexto.createMarshaller();
            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshal.marshal(miBiblioteca, new File(RUTA_FICH+"biblioteca_salida_ARG.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unmarshalling();
        marshalling();
    }
    
}
