public class Main {

    static void main() {

        //Creamos el cliente
        Cliente cliente = new Cliente("Ana López", "600123456", 25);

        //Creamos el camarero
        Camarero camarero = new Camarero("Carlos", "C01");

        //Creamos varios productos
        Bebida cafe = new Bebida("Café", 1.80, "mediano");
        Comida bocadillo = new Comida("Bocadillo", 3.50, true);
        Bebida zumo = new Bebida("Zumo", 2.20, "grande");

        //Creamos el ticket con su cliente y camarero
        Ticket ticket = new Ticket(cliente, camarero);

        //Añadimos los productos al ticket
        ticket.agregarProducto(cafe);
        ticket.agregarProducto(bocadillo);
        ticket.agregarProducto(zumo);

        //Enseñamos el ticket completo + total
        ticket.mostrarTicket();

        //Aplicamos un descuento usando la interfaz Descontable
        System.out.println();
        Descontable productoDescontable = cafe;   // el café se trata como Descontable
        double porcentaje = 10;
        double precioConDescuento = productoDescontable.aplicarDescuento(porcentaje);

        System.out.println("Descuento aplicado al café: " + (int) porcentaje + "%");
        System.out.println("Precio final del café: " + String.format("%.2f", precioConDescuento) + " €");
    }



    }

