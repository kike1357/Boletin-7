package boletin7_7;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Cadrado {
    double lado;
    public Cadrado(){
        this.lado=lado;
    }
    public double getLado(){
        
        return (Double.parseDouble(JOptionPane.showInputDialog("Introducir lado ")));
    }
    
    public double areaCadrado(double lado){
        return Math.pow(lado,2);
    }  
    }
    
    

