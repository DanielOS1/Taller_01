
package taller1;

public class ListaPersonajesPoseidos {
    private int max;
    private int cant;
    private PersonajePoseido listaPersonajePoseidos[];
    
    public ListaPersonajesPoseidos(int max){
        this.max = max;
        cant = 0;
        listaPersonajePoseidos = new PersonajePoseido[max];
    }    
    public boolean agregarPersonajePoseido(PersonajePoseido personaje){
        if(cant < max){
            listaPersonajePoseidos[cant] = personaje;
            cant++;
            return true;
        }
        else
        {
            return false;
        }        
    }
    
    
    public PersonajePoseido buscarPersonajePoseido(String nombrePersonajePoseido){
        int i = 0;
        while(i < cant && !listaPersonajePoseidos[i].getPersonajePoseido().getNombre().equals(nombrePersonajePoseido)){
            i++;
        }
        if (i == cant){
            return null;
        }else{
            return listaPersonajePoseidos[i];
        }
    }
    
}
