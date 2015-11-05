package boletin7_7;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Triangulo {
    double base,altura;
    
    
    
    public double areaTriangulo(double base,double altura){
        return (base*altura)/2;
    }
    public double getBase(){
        
        return (Double.parseDouble(JOptionPane.showInputDialog("Introducir base ")));
       
    }
    public double getAltura(){
       
        return(Double.parseDouble(JOptionPane.showInputDialog("Introducir altura")));
    }
    }
    

