
package taller1;


public class Aspecto {
    private String nombreSkin;
    private String calidad;
    private int precioSkin;
    private Personaje personaje;
    
    
    public Aspecto(String nombreSkin, String calidad) {
        this.nombreSkin = nombreSkin;
        this.calidad = calidad;
        
        if (calidad.equalsIgnoreCase("M")){
            precioSkin = 3250;
        }
        if (calidad.equalsIgnoreCase("D")){
            precioSkin = 2750;
        }
        if (calidad.equalsIgnoreCase("L")){
            precioSkin = 1820;
        }
        if (calidad.equalsIgnoreCase("E")){
            precioSkin = 1350;
        }
        if (calidad.equalsIgnoreCase("N")){
            precioSkin = 975;
        }
        
    }

    public String getNombreSkin() {
        return nombreSkin;
    }

    @Override
    public String toString() {
        return "Aspecto{" + "nombreSkin=" + nombreSkin + ", calidad=" + calidad + ", precioSkin=" + precioSkin + '}';
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    
    
    
}
