package baroja.lenmar.tema4.TestARG;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

    // Annotations
    @XmlRootElement(name="libro")
    @XmlAccessorType(XmlAccessType.FIELD)



public class LibroARG {

    private String titulo;
    private String autor;
    private int paginas;

    public LibroARG(String autor, int paginas, String titulo) {
        this.autor = autor;
        this.paginas = paginas;
        this.titulo = titulo;
    }

    public LibroARG(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "LibroARG [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }


    
}
