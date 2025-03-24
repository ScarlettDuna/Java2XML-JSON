package baroja.lenmar.tema4.XMLAnchan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/* Anotaciones */
@XmlRootElement(name = "alumno") 
@XmlAccessorType(XmlAccessType.FIELD)

public class Alumno {
    
    private Integer id;
    private String nombre;
    private String apellido;
    private double notaMedia;

    public Alumno(Integer id, String nombre, String apellido, double notaMedia) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public Alumno(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia + "]";
    }
    

}
