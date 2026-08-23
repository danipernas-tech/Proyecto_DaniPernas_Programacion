public class Main {

    static void main() {

        //Ticket 1
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

        //Aplicamos un descuento usando la interfaz Descontable
        double porcentaje = 10;
        Descontable productoDescontable = cafe;
        cafe.setPrecio(productoDescontable.aplicarDescuento(porcentaje));

        //Enseñamos el ticket completo + descuento
        ticket.mostrarTicket();

        System.out.println();
        System.out.println("Descuento aplicado al café: " + (int) porcentaje + "%");
        System.out.println("Precio final del café: " + String.format("%.2f", cafe.getPrecio()) + " €");


        //Ticket 2
        System.out.println();
        System.out.println();

        Cliente cliente2 = new Cliente("Luis", "600885323", 55);
        Camarero camarero2 = new Camarero ("Silvia", "C02");

        Bebida batido = new Bebida("Batido Oreo", 4.50, "grande");
        Comida desayuno = new Comida("Tostada de jamon con tomate", 3.90, true);

        Ticket ticket2 = new Ticket(cliente2, camarero2);
        ticket2.agregarProducto(batido);
        ticket2.agregarProducto(desayuno);

        batido.setPrecio(batido.aplicarDescuento(15));

        ticket2.mostrarTicket();

        System.out.println();
        System.out.println("Descuento aplicado al batido: 15%");
        System.out.println("Precio final batido: " + String.format("%.2f" , batido.getPrecio()) + " €");
    }



    }

