package baroja.lenmar.tema4.XMLAnchan;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* Anotaciones */
@XmlRootElement(name = "alumnos") 
@XmlAccessorType(XmlAccessType.FIELD)

public class Alumnos {
    @XmlElement(name="alumno")
    // Atributo
    private List<Alumno> Alumnos = null;

    // Constructor
    public Alumnos(){}
    // Getter
    public List<Alumno> getAlumnos() {
        return Alumnos;
    }

    @Override
    public String toString() {
        return "Alumnos [listaAlumnos=" + Alumnos + "]";
    }

    
}
