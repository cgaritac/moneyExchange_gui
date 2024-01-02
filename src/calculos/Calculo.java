
package calculos;


public class Calculo {
    double monto;

    public double getMonto() {
        return monto;
    }

    private void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void calcColDol(double tC, double mC){
        monto = mC/tC;
        setMonto(monto);
    } 
    
     public void calcDolCol(double tC, double mD){
        monto = mD*tC;
        setMonto(monto);
    } 
    
}
