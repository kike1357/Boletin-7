
package boletin7_6;

/**
 *
 * @author epastorizalorenzo
 */
public class Boletin7_6 {

    public static void main(String[] args) {
        float ventas ;
        String articulo;
        AlmacenConsumo n=new AlmacenConsumo();
        articulo=n.pedirArticulo();
        ventas=n.pedirVentas();
        
        n.cantidadConsumo(ventas,articulo);
    }
    }
    
    

