public class Cliente {

    //Atributos privados de Cliente
    private String nombre;
    private String telefono;
    private int edad;

    //Constructor-> guarda nombre, telefono y edad para saber si es mayor de edad o no
    public Cliente(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        setEdad(edad);

    }

    //Getter y setter
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Teléfono
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Edad
    public int getEdad() {
        return edad;
    }
    //Setter + la comprobación de edad que añada el user
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        }else  {
            System.out.println("Edad incorrecta, se pone 0");
            this.edad = 0;
        }
    }

    public boolean mayorEdad(){
        if (edad >= 18){
            return true;
        }else  {
            return false;
        }
    }

    @Override
    public String toString() {
        String edadCliente;
        if (mayorEdad()){
            edadCliente = "mayor de edad";
        }else  {
            edadCliente = "menor de edad";
        }
        return nombre + ", teléfono: " + telefono + ", es " + edadCliente;
    }


}
