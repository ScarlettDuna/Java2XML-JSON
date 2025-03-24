package baroja.lenmar.tema4.XMLAnchan;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class AlumnoTest {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\XMLAnchan\\";
    static Alumnos alumnosClase = new Alumnos();
    public static void main(String[] args) {
    
        /*         
        Alumno alumno1 = new Alumno(1, "Arantxa", "Reinoso", 8.9);
        Alumno alumno2 = new Alumno(2, "Jaime", "Arenal", 8.7);
        alumnosClase.getAlumnos().add(alumno1);
        alumnosClase.getAlumnos().add(alumno2);
        System.out.println("Alumnos de DAW: " + alumnosClase); */
        unmarshallingAlumnos();
        // para pasar a un fichero de salida 
        marshallingAlumnos();
    }
    private static void unmarshallingAlumnos(){
        try {
            JAXBContext contexto = JAXBContext.newInstance(Alumnos.class);
            Unmarshaller um = contexto.createUnmarshaller();
            // Realizar la transformación desde el fichero a 
            alumnosClase = (Alumnos) um.unmarshal(new File (RUTA_FICH+"alumno.xml"));
            System.out.println("Lista de alumnos leidos: " + alumnosClase);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
    }
    private static void marshallingAlumnos(){
        try {
            JAXBContext contexto = JAXBContext.newInstance(Alumnos.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(alumnosClase, new File(RUTA_FICH+"alumnosOUT.xml"));
            System.out.println("XML de salida generado correctamente.");
        } catch (JAXBException e) {
        }
    }
}
