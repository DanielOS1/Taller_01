
package taller1;

public class ListaPersonaje {
    private Personaje listaPersonaje[];
    private int max;
    private int cant;
    
    
    public ListaPersonaje(int max){
        this.max = max;
        cant = 0;
        listaPersonaje = new Personaje[max];
    }
    
    public boolean AgregarPersonaje(Personaje Campeon){
    if (cant < max){
        listaPersonaje[cant] = Campeon;
        cant++;
        return true;
    }
    else
    {
        return false;
    }
    
}
    
    public Personaje buscarPersonaje(String nombrePersonaje){
        int i = 0;
         while(i < cant && !listaPersonaje[i].getNombre().equals(nombrePersonaje)){
         i++;
         }
    if(i == cant) {
        return null;
    }
    else {
        return listaPersonaje[i];    
    }         
         
    }
    
    
    
    
}
