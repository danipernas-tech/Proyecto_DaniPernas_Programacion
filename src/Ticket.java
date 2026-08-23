public class Ticket {

    //Ticket: contiene un cliente, un camarero y un array de productos
    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    //Constructor
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[20]; //max 20
        this.contadorProductos = 0;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    //Añade un producto al ticket si hay hueco
    //Devuelve true si lo añadió, false si no pudo por espacio
    public boolean agregarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("No se puede añadir un producto vacío");
            return false;
        }
        if (contadorProductos >= productos.length) {
            System.out.println("El ticket está lleno, no caben más productos");
            return false;
        }
        productos[contadorProductos] = producto;
        contadorProductos++;
        return true;
    }

    //Recorre los productos guardados y suma sus precios
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }
        return total;
    }

    //Mostrar ticket
    public void mostrarTicket() {
        System.out.println("---CAFETERÍA DANI---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero);
        System.out.println();
        System.out.println("Productos:");

        if (contadorProductos == 0) {
            System.out.println("El ticket está vacío");
        } else {
            for (int i = 0; i < contadorProductos; i++) {
                System.out.println((i + 1) + ". " + productos[i]);
            }
        }
        System.out.println();
        System.out.println("Total: " + String.format("%.2f", calcularTotal()) + " €");
    }
}
