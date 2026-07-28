public class Comida extends Producto {

    // Atributo de Comida: avisa si el plato es caliente o frío
    private boolean Caliente;   //true es caliente, false es frío

    // Constructor de Comida: nombre + precio + atributo nuevo
    public Comida(String nombre, double precio, boolean esCaliente) {
        super(nombre, precio, "Comida");
        this.Caliente = esCaliente;
    }

    // Getter y setter del atributo nuevo
    public boolean isCaliente() {
        return Caliente;
    }

    public void setCaliente(boolean esCaliente) {
        this.Caliente = esCaliente;
    }

    // Sobrescribimos toString() para mostrar la info de la comida.
    @Override
    public String toString() {
        String temperatura;
        if (Caliente) {
            temperatura = "caliente";
        } else {
            temperatura = "frío/a";
        }
        return getNombre() + " " + temperatura + " - " + String.format("%.2f", getPrecio()) + " €";
    }
}