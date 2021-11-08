
package taller1;

public class ListaCuentas {
    private int max;
    private int cant;
    private Cuenta ListaCuenta[];
    
    public ListaCuentas(int max){
        this.max = max;
        cant = 0;
        ListaCuenta = new Cuenta[max];
    }
    
    public boolean AgregarCuenta(Cuenta cuenta){
    if (cant < max){
        ListaCuenta[cant] = cuenta;
        cant++;
        return true;
    }
    else
    {
        return false;
    }
    
}    
    
    
    public Cuenta buscarCuenta(String nombreCuenta){
        int i = 0;
        while(i < cant && !ListaCuenta[i].getNombreCuenta().equals(nombreCuenta)){
        i++;
        }
        if(i == cant) {
            return null;
        }
        else {
            return ListaCuenta[i];    
        }         
         
    }     
}
