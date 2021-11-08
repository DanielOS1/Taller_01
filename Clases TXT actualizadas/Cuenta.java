
package taller1;

public class Cuenta {
    private String nombreCuenta;
    private String contraseña;
    private String nick;
    private int nivelDeCuenta;
    private int rpDeCuenta;
    private String region;
    private boolean estadoDeBloqueo;
    private ListaPersonajesPoseidos listaPersonajePoseidos;
    
       public Cuenta(String nombreCuenta, String contraseña, String nick, int nivelDeCuenta, int rpDeCuenta, String region) {
        this.nombreCuenta = nombreCuenta;
        this.contraseña = contraseña;
        this.nick = nick;
        this.nivelDeCuenta = nivelDeCuenta;
        this.rpDeCuenta = rpDeCuenta;
        this.region = region;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public ListaPersonajesPoseidos getlistaPersonajePoseido(){
        return listaPersonajePoseidos;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getNivelDeCuenta() {
        return nivelDeCuenta;
    }

    public void setNivelDeCuenta(int nivelDeCuenta) {
        this.nivelDeCuenta = nivelDeCuenta;
    }

    public int getRpDeCuenta() {
        return rpDeCuenta;
    }

    public void setRpDeCuenta(int rpDeCuenta) {
        this.rpDeCuenta = rpDeCuenta;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isEstadoDeBloqueo() {
        return estadoDeBloqueo;
    }

    public void setEstadoDeBloqueo(boolean estadoDeBloqueo) {
        this.estadoDeBloqueo = estadoDeBloqueo;
    }

    public ListaPersonajesPoseidos getListaPersonajePoseidos() {
        return listaPersonajePoseidos;
    }

    public void setListaPersonajePoseidos(ListaPersonajesPoseidos listaPersonajePoseidos) {
        this.listaPersonajePoseidos = listaPersonajePoseidos;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombreCuenta=" + nombreCuenta + ", contraseña=" + "*******"+contraseña.substring(contraseña.length()-3,contraseña.length()) + ", nick=" + nick + '}';
    }
    
    
    
    
    
    
}
