package baroja.lenmar.tema4.XMLAnchan;

public class Empleado {
    private int numEmpleado;
    private String nombre;
    private String apellido;
    private String email;
    private String departamento;

    public Empleado(String apellido, String departamento, String email, String nombre, int numEmpleado) {
        this.apellido = apellido;
        this.departamento = departamento;
        this.email = email;
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
                + email + ", departamento=" + departamento + "]";
    }

}
