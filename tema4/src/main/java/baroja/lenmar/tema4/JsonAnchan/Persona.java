package baroja.lenmar.tema4.JsonAnchan;

import java.util.List;

// POJO plain old java object

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<String> aficiones;

    
    public Persona(String nombre, String apellido, int edad, List<String> aficiones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.aficiones = aficiones;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", aficiones=" + aficiones
                + "]";
    }

}
