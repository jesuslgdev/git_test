package coche;

/**
 * Clase que representa un coche con atributos como nombre, precio y stock.
 * Permite comprar y vender unidades, además de obtener información del coche.
 *
 * @author Jesús
 * @version 2.0 21/03/2025
 */
public class Coche {

    /** Nombre del coche */
    private String nombre;
    /** Precio del coche sin IVA */
    private double precio;
    /** Precio del coche con IVA */
    private double precioIVA;
    /** Stock disponible de coches */
    private int stock;

    /**
     * Constructor por defecto sin argumentos.
     */
    public Coche() {
    }

    /**
     * Constructor que inicializa los atributos del coche.
     *
     * @param nom Nombre del coche.
     * @param precio Precio del coche sin IVA.
     * @param stock Stock disponible del coche.
     */
    public Coche(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Asigna un nombre al coche.
     *
     * @param nom Nombre a asignar.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del coche.
     *
     * @return Nombre del coche.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el stock actual del coche.
     *
     * @return Stock disponible.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Compra una cantidad de coches, aumentando el stock disponible.
     *
     * @param cantidad Cantidad de coches a comprar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de coches");
        setStock(getStock() + cantidad);
    }

    /**
     * Vende una cantidad de coches, reduciendo el stock disponible.
     *
     * @param cantidad Cantidad de coches a vender.
     * @throws Exception Si la cantidad es negativa o si el stock es insuficiente.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede vender una cantidad negativa de coches");
        if (obtenerStock() < cantidad)
            throw new Exception("No hay suficientes coches para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Obtiene el nombre del coche.
     *
     * @return Nombre del coche.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del coche.
     *
     * @param nombre Nombre del coche.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del coche sin IVA.
     *
     * @return Precio del coche sin IVA.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del coche sin IVA.
     *
     * @param precio Precio del coche sin IVA.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio del coche con IVA.
     *
     * @return Precio del coche con IVA.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Establece el precio del coche con IVA.
     *
     * @param precioIVA Precio del coche con IVA.
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Obtiene el stock disponible del coche.
     *
     * @return Stock disponible.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock disponible del coche.
     *
     * @param stock Stock disponible.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
