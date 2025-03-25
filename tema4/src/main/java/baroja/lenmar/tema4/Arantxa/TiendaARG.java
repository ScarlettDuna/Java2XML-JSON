package baroja.lenmar.tema4.Arantxa;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* Anotaciones */
@XmlRootElement(name = "tienda")
@XmlAccessorType(XmlAccessType.FIELD)

public class TiendaARG {
    @XmlElement(name = "producto")
    private List<ProductoARG> tienda = null;

    public TiendaARG(){}

    public List<ProductoARG> getTienda(){
        return tienda;
    }

    @Override
    public String toString() {
        return "TiendaARG [tienda=" + tienda + "]";
    }
    
    
}
