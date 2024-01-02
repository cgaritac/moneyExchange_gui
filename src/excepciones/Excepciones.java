
package excepciones;

import javax.swing.JOptionPane;


public class Excepciones {
    private double valor;
    private int ex;

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public int getEx() {
        return ex;
    }

    private void setEx(int ex) {
        this.ex = ex;
    }
    
    public void soloNumeros(String parametro, String tipo){
                           
        try{                
            valor = Double.parseDouble(parametro);
                
            if (valor <= 0){                    
                JOptionPane.showMessageDialog(null, "Valor de "+tipo+" no válido");                       
                ex = -1;
                }
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Valor de "+tipo+" no válido");      
            ex = -1;                
        }            
        
        setValor(valor);
        setEx(ex);
    }  

   
}
