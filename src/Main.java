public class Main {

    static void main() {

        Producto generico = new Producto("Servilletas", 0.50, "Otros");
        Bebida cafe = new Bebida("Café", 1.80, "mediano");
        Comida bocadillo = new Comida("Bocadillo", 3.50, true);

        System.out.println("---PRODUCTOS---");
        System.out.println(generico);
        System.out.println(cafe);
        System.out.println(bocadillo);

        System.out.println("---DESCUENTO---");
        System.out.println("Precio del café: " + cafe.getPrecio() + " €");
        System.out.println("Con 10% descuento: " + cafe.aplicarDescuento(10) + " €");

        System.out.println("Con 25% descuento: " + cafe.aplicarDescuento(25) + " €");

    }
}
