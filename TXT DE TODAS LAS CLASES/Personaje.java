
package taller1;

public class Personaje {
    private String Nombre;
    private String Rol;
    private int Recaudacion;
    private int Precio = 975;
    private ListaAspecto listaSkin[];

    public Personaje(String Nombre, String Rol, int Recaudacion) {
        this.Nombre = Nombre;
        this.Rol = Rol;
        this.Recaudacion = Recaudacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRol() {
        return Rol;
    }

    public int getRecaudacion() {
        return Recaudacion;
    }

    public void setRecaudacion(int Recaudacion) {
        this.Recaudacion = Recaudacion;
    }

    public int getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "Personaje{" + "Nombre=" + Nombre + ", Rol=" + Rol + ", Recaudacion=" + Recaudacion + ", Precio=" + Precio + '}';
    }


    
    
    
}
