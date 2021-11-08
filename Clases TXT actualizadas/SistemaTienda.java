
package taller1;

public interface SistemaTienda {
    public boolean AgregarPersonaje(String nombrePersonaje,String rol, int recaudacion); //listo
    public boolean AgregarAspecto(String nombreAspecto, String calidad); // listo
    public void AsociarPersonajeAspecto(String nombrePersonaje, String nombreAspecto);
    public boolean AgregarCuenta(String nombreCuenta, String contraseña, String nombreUsuario, int nivel,int rpEnCuenta, String Servidor);
    public void AsociarPersonajePoseidoCuenta(String nombrePersonaje ,String nombreCuenta);
    // "Contrato Sospechoso"  public void AsociarAspectoCuenta(String nombreAspectoPoseido,String nombreCuenta);
    public boolean IniciarSesion(String nombreCuenta, String contraseña);
    public Cuenta EstablecerCUenta(String nombreCuenta);
    public boolean RegistrarCuenta(String nombreCuenta,String contraseña, String nombreUsuario,String Servidor);
    public int RecaudacionPersonaje(String nombrePersonaje);
    public AspectoPoseido ComprarAspecto(String Cuenta, String nombrePersonajePoseido, String nombreAspectoPoseido);
    public PersonajePoseido ComprarPersonaje(String Cuenta, String nombrePersonajePoseido);
    public boolean RecargarRp(String nombreCuenta, int cantRP);
    public String mostrarCuenta(String nombreCuenta);
    ///////////////////////////////// hasta aqui se ha implementado /////////////////////////////////////////////////////
    ///////////////////////////////// el resto son solo Imprimir (que no se como se hacen xD) /////////////////////////////////
    ///////////////////////////////// trabajo pendiente: Documentar con javaDoc todos los contratos de esta interfaz /////////////////////////////////
    public String mostrarPersonaje(PersonajePoseido personaje);
    public String mostrarAspecto(AspectoPoseido aspecto);
    public void CambiarContraseña(Cuenta cuenta, String contraseña);
    public void MostrarRecaudacionRol(ListaPersonaje listaPersonaje);
    public void MostrarRecaudacionRegion(ListaCuentas listacuenta);
    public void MostrarPersonajeRol(ListaPersonaje listaPersonaje);
    public void BloquearCuenta(String nombreCuenta);
    public void OrdenarCuentas(ListaCuentas listacuenta);
    public void MostrarCuentasOrden(ListaCuentas listacuenta);
    public void ObtenerCuentas();
    public void ObtenerPersonajes();
    public void ObtenerRecaudacion();        
    
    
    
    
}
