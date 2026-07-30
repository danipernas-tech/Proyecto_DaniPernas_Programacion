public class Main {

    static void main() {

        //Productos
        Producto generico = new Producto("Servilletas", 0.50, "Otros");
        Bebida cafe = new Bebida("Café", 1.80, "mediano");
        Comida bocadillo = new Comida("Bocadillo", 3.50, true);

        System.out.println("\n---PRODUCTOS---");
        System.out.println(generico);
        System.out.println(cafe);
        System.out.println(bocadillo);

        System.out.println("\n---DESCUENTO---");
        System.out.println("Precio del café: " + cafe.getPrecio() + " €");
        System.out.println("Con 10% descuento: " + cafe.aplicarDescuento(10) + " €");

        System.out.println("Con 25% descuento: " + cafe.aplicarDescuento(25) + " €");

        //Personas
        System.out.println("\n---PERSONAS---");
        Cliente cliente = new Cliente("Dani Pernas", "600123456", 23);
        Camarero camarero = new Camarero("Silvia Benito", "C01");
        Cliente clienteJoven = new Cliente("Leo", "698653001", 16);

        System.out.println(cliente);
        System.out.println(camarero);
        System.out.println(clienteJoven);



    }
}
