package baroja.lenmar.tema4.JsonAnchan;

import java.util.List;

public class CV {
    private String nombre;
    private String apellido; 
    private int edad;
    private String direccion;
    private String email;
    private String telefono;
    private List<String> estudios;
    private List<String> experienciaProfesional;

    public CV(String apellido, String direccion, int edad, String email, List<String> estudios, List<String> experienciaProfesional, String nombre, String telefono) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.estudios = estudios;
        this.experienciaProfesional = experienciaProfesional;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getEstudios() {
        return estudios;
    }

    public void setEstudios(List<String> estudios) {
        this.estudios = estudios;
    }

    public List<String> getExperienciaProfesional() {
        return experienciaProfesional;
    }

    public void setExperienciaProfesional(List<String> experienciaProfesional) {
        this.experienciaProfesional = experienciaProfesional;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CV {");
        sb.append(" nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append(", estudios=").append(estudios);
        sb.append(", experienciaProfesional=").append(experienciaProfesional);
        sb.append('}');
        return sb.toString();
    }
    
    
}
