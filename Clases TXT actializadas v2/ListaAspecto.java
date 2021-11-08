
package taller1;

public class ListaAspecto {
    private int max;
    private int cant;
    private Aspecto listaAspecto[];
    
    public ListaAspecto(int max){
        this.max = max;
        cant = 0;
        listaAspecto = new Aspecto[max];
    }
    public boolean AgregarAspecto(Aspecto Skin){
        if(cant < max){
            listaAspecto[cant] = Skin;
            cant++;
            return true;
        }
        else
        {
            return false;
        }
    }
     public Aspecto buscarAspecto(String nombreAspecto){
        int i = 0;
         while(i < cant && !listaAspecto[i].getNombreSkin().equals(nombreAspecto)){
         i++;
         }
    if(i == cant) {
        return null;
    }
    else {
        return listaAspecto[i];    
    }         
         
    }   
    
}
