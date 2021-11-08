
package taller1;


public class ListaAspectosPoseidos {
    private int max;
    private int cant;
    private AspectoPoseido listaAspectoPoseido[];
    
    public ListaAspectosPoseidos(int max){
        this.max = max;
        cant = 0;
        listaAspectoPoseido = new AspectoPoseido[max];
    }        
    
    public boolean agregarAspectoPoseido(AspectoPoseido aspecto){
        if(cant < max){
            listaAspectoPoseido[cant] = aspecto;
            cant++;
            return true;
        }
        else
        {
            return false;
        }        
    }
    
    public AspectoPoseido buscarAspectoPoseido(String nombreAspectoPoseido){
        int i = 0;
        while(i < cant && !listaAspectoPoseido[i].getCopiaAspecto().getNombreSkin().equals(nombreAspectoPoseido)){
            i++;
        }
        if (i == cant){
            return null;
        }else{
            return listaAspectoPoseido[i];
        }
    }    
    
}
