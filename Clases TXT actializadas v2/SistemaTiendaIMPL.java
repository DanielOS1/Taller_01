
package taller1;

public class SistemaTiendaIMPL implements SistemaTienda{
    private ListaPersonaje listaPersonajes;
    private ListaAspecto listaAspectos;
    private ListaPersonajesPoseidos listaPersonajesPoseidos;
    private ListaAspectosPoseidos listaAspectosPoseidos;
    private ListaCuentas listaCuenta;

    public SistemaTiendaIMPL() {
        this.listaPersonajes = new ListaPersonaje(500);
        this.listaAspectos = new ListaAspecto(500);
        this.listaPersonajesPoseidos = new ListaPersonajesPoseidos(500);
        this.listaAspectosPoseidos = new ListaAspectosPoseidos(500);
        this.listaCuenta = new ListaCuentas(500);
    }
    
    public boolean AgregarPersonaje(String nombrePersonaje, String rolPersonaje){
        Personaje personaje = new Personaje(nombrePersonaje,rolPersonaje);
        boolean ingresoPersonaje = listaPersonajes.AgregarPersonaje(personaje);
        return ingresoPersonaje;
    }
    
    public boolean AgregarAspecto(String nombreAspecto, String Calidad){
        Aspecto aspecto = new Aspecto(nombreAspecto,Calidad);
        boolean ingresoAspecto = listaAspectos.AgregarAspecto(aspecto);
        return ingresoAspecto;
    }    
    
    public void AsociarPersonajeAspecto(String nombrePersonaje,String nombreAspecto){
        Aspecto aspecto = listaAspectos.buscarAspecto(nombreAspecto);
        Personaje personaje = listaPersonajes.buscarPersonaje(nombrePersonaje);
        if(personaje != null && aspecto != null) {
            personaje.getListaAspecto().AgregarAspecto(aspecto);
            aspecto.setPersonaje(personaje);
    }else{
            throw new NullPointerException("El personaje y/o aspecto no existe");
        }
    
    }
    
    public void AsociarPersonajePoseidoCuenta(String nombrePersonajePoseido,String nombreCuenta){
        Cuenta cuenta = listaCuenta.buscarCuenta(nombreCuenta);
        PersonajePoseido personajeAdquirido = listaPersonajesPoseidos.buscarPersonajePoseido(nombrePersonajePoseido);
        if (personajeAdquirido != null && cuenta != null){
            cuenta.getlistaPersonajePoseido().agregarPersonajePoseido(personajeAdquirido);
            personajeAdquirido.setDueño(cuenta);
        }else{
            throw new NullPointerException("El personaje y/o la cuenta no Existe");
        }
    }
    
    public boolean AgregarCuenta(String nombreCuenta, String contraseña, String nombreUsuario, int nivel,int rpEnCuenta, String Servidor){
        Cuenta cuenta = new Cuenta(nombreCuenta, contraseña, nombreUsuario, nivel, rpEnCuenta, Servidor);
        boolean ingresoCuenta = listaCuenta.AgregarCuenta(cuenta);
        return ingresoCuenta;
    }
    
   /* public void AsociarAspectoCuenta(String nombreAspectoPoseido,String nombreCuenta){
        AspectoPoseido aspectoAdquirido = listaAspectosPoseidos.buscarAspectoPoseido(nombreAspectoPoseido);
        Cuenta cuenta = listaCuenta.buscarCuenta(nombreCuenta);
        if (aspectoAdquirido != null && cuenta != null){
            cuenta.ge
        }
        else
        {
            
        }
        
    }
   */ 
    
    
    
    
    public boolean IniciarSesion(String nombreCuenta, String contraseña){
        Cuenta cuenta = listaCuenta.buscarCuenta(nombreCuenta);       
        if(cuenta.getNombreCuenta() != null && cuenta.getContraseña() != null || nombreCuenta == cuenta.getNombreCuenta() && contraseña == cuenta.getContraseña()){
           return true;
        }else{
            throw new NullPointerException("Informacion incorrecta");
        }
        
    }
    
    public boolean RegistrarCuenta(String nombreCuenta,String contraseña, String nombreUsuario,String Servidor){
        if(listaCuenta.buscarCuenta(nombreCuenta).getNombreCuenta().equals(nombreCuenta)){
            Cuenta cuenta = new Cuenta(nombreCuenta, contraseña, nombreUsuario, 0, 0, Servidor);
            boolean ingreso =listaCuenta.AgregarCuenta(cuenta);
            return ingreso;
        }
        else
        {
            throw new NullPointerException("La cuenta ya Existe");
        }
    }
    public int RecaudacionPersonaje(String nombrePersonaje){        
        return listaPersonajes.buscarPersonaje(nombrePersonaje).getRecaudacion();
        
        
    }    
    public Cuenta EstablecerCUenta(String nombreCuenta){
        return listaCuenta.buscarCuenta(nombreCuenta);
    }
    
    
    public AspectoPoseido ComprarAspecto(String Cuenta, String nombrePersonajePoseido, String nombreAspectoPoseido){
        if (listaPersonajes.buscarPersonaje(nombrePersonajePoseido).equals(nombrePersonajePoseido) && listaAspectos.buscarAspecto(nombreAspectoPoseido).equals(nombreAspectoPoseido) &&
                !listaCuenta.buscarCuenta(Cuenta).getlistaPersonajePoseido().buscarPersonajePoseido(nombrePersonajePoseido).getAspectosPoseidos().buscarAspecto(nombreAspectoPoseido).equals(nombreAspectoPoseido))
        {
            
            return listaAspectosPoseidos.buscarAspectoPoseido(nombreAspectoPoseido);
        }else{
            throw new NullPointerException("Informacion incorrecta");
        }
    }
    public PersonajePoseido ComprarPersonaje(String Cuenta, String nombrePersonajePoseido){
        if (!listaPersonajesPoseidos.buscarPersonajePoseido(nombrePersonajePoseido).equals(nombrePersonajePoseido)){
            return listaPersonajesPoseidos.buscarPersonajePoseido(nombrePersonajePoseido);
        }else
        {
            throw new NullPointerException("Informacion incorrecta");
        }
    }
    
    public boolean RecargarRp(String nombreCuenta, int cantRP){
        if (!listaCuenta.buscarCuenta(nombreCuenta).equals(null)){
        int rpTotal = cantRP + listaCuenta.buscarCuenta(nombreCuenta).getRpDeCuenta();
        listaCuenta.buscarCuenta(nombreCuenta).setRpDeCuenta(rpTotal);
        return true;
        }else{
            throw new NullPointerException("Informacion incorrecta");
        }
    }
    
    public String mostrarCuenta(String nombreCuenta){
        return listaCuenta.buscarCuenta(nombreCuenta).toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
