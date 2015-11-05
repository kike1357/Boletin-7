package boletin7_6;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class AlmacenConsumo {
    
    public String pedirArticulo(){
    String articulo;
    articulo=JOptionPane.showInputDialog("Introduce articulo :");
    return articulo;
    }
    public float pedirVentas(){
        float ventas;
        String res= JOptionPane.showInputDialog("Introduce el numero de ventas :");
        ventas=Float.parseFloat(res);
        return ventas;
    }
    public void cantidadConsumo(float ventas,String articulo){
        if(ventas<=100){
            JOptionPane.showMessageDialog(null,"El articulo "+articulo+" es de tipo de consumo bajo");
        }
        else if(ventas>=100 && ventas<=500){
            JOptionPane.showMessageDialog(null,"El articulo "+articulo+ " es de tipo de consumo medio");
        }
        else if(ventas>=500 && ventas <= 1000){
            JOptionPane.showMessageDialog(null,"El articulo "+articulo+ " es de tipo de consumo alto");
        }
        else if(ventas>1000){
            JOptionPane.showMessageDialog(null,"El articulo "+articulo+ " es de primera necesidad");
        }
    }
}
       
    

