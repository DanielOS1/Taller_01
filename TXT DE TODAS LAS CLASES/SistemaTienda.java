
package taller1;

public interface SistemaTienda {
    public boolean AgregarPersonaje(String nombrePersonaje,String rol); //listo
    public boolean AgregarAspecto(String nombreAspecto, String calidad); // listo
    public void AsociarPersonajeAspecto(String nombrePersonaje, String nombreAspecto);
    public boolean AgregarCuenta(String nombreCuenta, String contraseña, String nombreUsuario, int nivel, int rpEnCuenta);
    public void AsociarPersonajeCuenta(String nombrePersonajePoseido,String nombreCuenta);
    public void AsociarAspectoCuenta(String nombreAspectoPoseido,String nombreCuenta);
    public boolean IniciarSesion(String nombreCuenta, String contraseña);
    public boolean RegistrarCuenta(String nombreCuenta,String contraseña, String nombreUsuario);
    public void RecaudacionPersonaje(String nombrePersonaje, int recaudacion);
    public void ComprarAspecto(String nombrePersonajePoseido, String nombreAspectoPoseido);
    public void ComprarPersonaje(String nombrePersonajePoesido);
    public void RecargarRp(Cuenta cuenta, int cantRP);
    public void mostrarCuenta(Cuenta cuenta);
    public void mostrarPersonaje(PersonajePoseido personaje);
    //    "AUN NO DECLARADO"   public void mostrarAspecto(AspectoPoseido aspecto);
    public void CambiarContraseña(Cuenta cuenta, String contraseña);
            
    
    
    
    
}
