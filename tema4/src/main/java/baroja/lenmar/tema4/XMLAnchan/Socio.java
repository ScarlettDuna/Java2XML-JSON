package baroja.lenmar.tema4.XMLAnchan;

import javax.xml.bind.annotation.*;

// JAXB API 2.3.1
// JAXB RUNTIME

/* Anotaciones */
@XmlRootElement(name = "socio")  
// usamos la propiedad propOrder que espedifica la lista de elementos y el orden
@XmlType(propOrder = {"nombreSocio", "direccion", "fechaAlta"})
// Y usamos XmlAccessType.FIELD para acceder a los campos
@XmlAccessorType(XmlAccessType.FIELD)


public class Socio {
    @XmlAttribute(required=true)
    private int id;
    @XmlElement(name="nombre")
    private String nombreSocio;
    @XmlElement(name="direccion")
    private String direccion;
    @XmlElement(name="alta")
    private String fechaAlta;

    public Socio(String direccion, String fechaAlta, int id, String nombreSocio) {
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.id = id;
        this.nombreSocio = nombreSocio;
    }
    public Socio(){}

    public int getId() {
        return id;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }
    @Override
    public String toString() {
        return "socio [id=" + id + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta="
                + fechaAlta + "]";
    }
    
}
