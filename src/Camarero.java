public class Camarero {

    //Atributos privados de Camarero
    private String nombre;
    private String codigoEmpleado;

    //Constructor -> guarda nombre y código de empleado
    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Código de empleado
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return nombre + " - Código: " + codigoEmpleado;
    }
}
