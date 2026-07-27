public class Bebida extends Producto{

    // Atributo propio de Bebida + los que hereda de Producto
    private String tamanio;   // ej: "pequeño", "mediano", "grande"

    // Constructor de Bebida.
    // Recibe nombre, precio y tamanio.
    public Bebida(String nombre, double precio, String tamanio) {
        super(nombre, precio, "Bebida");   // llama al constructor de Producto (el padre)
        this.tamanio = tamanio;
    }

    // Getter y setter del atributo propio de bebida.
    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    // Sobrescribimos toString() para mostrar los atributos de bebida.
    @Override
    public String toString() {
        return getNombre() + " " + tamanio + " - " + String.format("%.2f", getPrecio()) + " €";
    }
}




