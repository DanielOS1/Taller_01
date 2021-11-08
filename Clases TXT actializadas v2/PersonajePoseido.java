/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author danie
 */
public class PersonajePoseido {
    
    private Personaje copiaPersonaje;
    private Cuenta dueño;
    private ListaAspecto AspectosPoseidos ;

    public PersonajePoseido() {
    }

    public void setDueño(Cuenta dueño) {
        this.dueño = dueño;
    }

    public void setCopiaPersonaje(Personaje copiaPersonaje) {
        this.copiaPersonaje = copiaPersonaje;
    }

    public ListaAspecto getAspectosPoseidos() {
        return AspectosPoseidos;
    }

    public void setAspectosPoseidos(ListaAspecto AspectosPoseidos) {
        this.AspectosPoseidos = AspectosPoseidos;
    }
    
    public Personaje getPersonajePoseido(){
        return copiaPersonaje;
    }

    @Override
    public String toString() {
        return "PersonajePoseido{" + "copiaPersonaje=" + copiaPersonaje + ", due\u00f1o=" + dueño + ", AspectosPoseidos=" + AspectosPoseidos + '}';
    }
    
    
}
