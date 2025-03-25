package baroja.lenmar.tema4.Arantxa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

    // Annotations
    @XmlRootElement(name="producto")
    @XmlAccessorType(XmlAccessType.FIELD)


public class ProductoARG {
    private String nombre;
    private float precio;
    private int stock;
    private String proveedor;

    public ProductoARG(String nombre, float precio, String proveedor, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.stock = stock;
    }

    public ProductoARG(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "ProductoARG [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor
                + "]";
    }

}
