public class Producto {

    //ATRIBUTOS
    //Declaramos los atributos y los ponemos en private para que solo se pueda tocar desde la clase (encapsulación)
    private String nombre;
    private double precio;
    private String categoria;

    //CONSTRUCTOR
    //El constructor se ejecuta cuando creamos un producto nuevo (new Producto) y el cual recibe 3 datos
    //del producto nuevo, el nombre, el precio y la categoría
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre; //con this nos referimos al atributo creado, y nombre en este caso el nombre asignado al producto
        setPrecio(precio);
        this.categoria = categoria;
    }

    //GETTER de nombre
    public String getNombre() {
        return nombre;
    }
    //SETTER de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTER de precio
    public double getPrecio() {
        return precio;
    }
    //SETTER de precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else  {
            System.out.println("El precio no puede ser negativo");
        }
    }

    //GETTER de categoria
    public String getCategoria() {
        return categoria;
    }
    //SETTER de categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Con el override sobrescribimos el toString() y lo mostramos con los datos de los productos
    @Override
    public String toString() {
        return nombre + " (" + categoria + ")" + "," + String.format("%.2f", precio)+"€";
    }
}

