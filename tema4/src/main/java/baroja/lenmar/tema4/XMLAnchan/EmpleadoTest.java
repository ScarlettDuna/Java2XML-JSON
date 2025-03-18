package baroja.lenmar.tema4.XMLAnchan;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import com.google.gson.Gson;

public class EmpleadoTest {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\XMLAnchan\\";
    public static void main(String[] args) {
        
        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "empleado.json"));
            Empleado empleado1 = gson.fromJson(reader, Empleado.class);
            System.out.println("Empleado " + empleado1);
            fromEmpleadoToXML(empleado1);

            // Imprimir por pantalla
            // imprimirXMLPorPantalla(doc);

            // Imprimir a fichero
            // imprimirXMLFichero(docEmpleado, RUTA_FICH + "ficheroSalida.xml")
        } catch (IOException | TransformerFactoryConfigurationError | TransformerException e) {
            e.printStackTrace();
        }
    }

    private static void fromEmpleadoToXML(Empleado emplIn) throws TransformerFactoryConfigurationError, TransformerException{
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        
        try {
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            // insertar en el XML los datos del empleado
            Element elemEmpleado = document.createElement("empleado");
            document.appendChild(elemEmpleado);
            Element elemNumEmpleado = document.createElement("numEmpleado");
            Text textNumEmpleado = document.createTextNode(emplIn.getNumEmpleado());
            elemEmpleado.appendChild(elemNumEmpleado);
            elemNumEmpleado.appendChild(textNumEmpleado);

            Element elemNombre = document.createElement("nombre");
            Text textNombre = document.createTextNode(emplIn.getNombre());
            elemEmpleado.appendChild(elemNombre);
            elemNombre.appendChild(textNombre);

            Element elemApellido = document.createElement("apellido");
            Text textApellido = document.createTextNode(emplIn.getApellido());
            elemEmpleado.appendChild(elemApellido);
            elemApellido.appendChild(textApellido);

            Element elemEmail = document.createElement("email");
            Text textEmail = document.createTextNode(emplIn.getEmail());
            elemEmpleado.appendChild(elemEmail);
            elemEmail.appendChild(textEmail);

            Element elemDepartamento = document.createElement("departamento");
            Text textDepartamento = document.createTextNode(emplIn.getDepartamento());
            elemEmpleado.appendChild(elemDepartamento);
            elemDepartamento.appendChild(textDepartamento);
            // imprimir el documento
            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(RUTA_FICH+"Empleado2.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }
}
