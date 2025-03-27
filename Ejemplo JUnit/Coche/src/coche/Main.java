package coche;

/**
 *
 * @author Sonia
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche1;
        int stockActual;
        
        miCoche1 = new Coche("Opel",12000,500);
        operatoria_coches(miCoche1, 300); 
        stockActual = miCoche1.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    public static void operatoria_coches(Coche miCoche1, int cantidad) {
        try
        {
            System.out.println("Venta de Coches");
            miCoche1.vender(cantidad);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
        
        try
        {
            System.out.println("Compra de Coches");
            miCoche1.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

}
    
