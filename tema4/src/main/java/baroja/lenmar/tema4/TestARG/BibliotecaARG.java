package baroja.lenmar.tema4.TestARG;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* Anotaciones */
@XmlRootElement(name = "biblioteca")
@XmlAccessorType(XmlAccessType.FIELD)

public class BibliotecaARG {
    @XmlElement(name="libro")
    private final List<LibroARG> biblioteca = null;

    public BibliotecaARG(){}

    public List<LibroARG> getBiblioteca(){
        return biblioteca;
    }

    @Override
    public String toString() {
        return "BibliotecaARG [biblioteca=" + biblioteca + "]";
    }

    
    
}
