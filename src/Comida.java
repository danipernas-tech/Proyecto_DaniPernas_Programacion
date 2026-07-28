public class Comida extends Producto {

    private boolean Caliente;   //true es caliente, false es frío

    public Comida(String nombre, double precio, boolean esCaliente) {
        super(nombre, precio, "Comida");
        this.Caliente = esCaliente;
    }

    public boolean isEsCaliente() {
        return Caliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.Caliente = esCaliente;
    }

}