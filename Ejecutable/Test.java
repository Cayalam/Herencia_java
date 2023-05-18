package Ejecutable;

import javax.swing.JOptionPane;

import Clases.Resta;
import Clases.Suma;

public class Test {
    public static void main(String[] args)
    {
    
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite ell valor de y: "));
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite ell valor de x: "));
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null,"La Suma de"+ x+"y"+y+"es"+miSuma.mostrarResultados());
        System.exit(0);
        Resta miResta = new Resta(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null,"La Suma de"+ x+"y"+y+"es"+miSuma.mostrarResultados());
        System.exit(0);
    }
      
     
        
    
}
