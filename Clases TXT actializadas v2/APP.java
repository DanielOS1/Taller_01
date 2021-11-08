
package taller1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) throws FileNotFoundException  {
        SistemaTienda sistema = new SistemaTiendaIMPL();
        leerPersonajes(sistema);
        leerCuentas(sistema);
        
        
    }
    
    public static void leerPersonajes(SistemaTienda sistema) throws FileNotFoundException {
               Scanner scan = new Scanner(new File("Personajes.txt"));
        while (scan.hasNextLine()){
            String linea = scan.nextLine();
            String [] partes = linea.split(",");
            String nombrePersonaje = partes[0];
            String rol = partes[1];
            int cant = Integer.parseInt(partes[2]);
            
            if (!sistema.AgregarPersonaje(nombrePersonaje, rol)){
                System.out.println("El personaje ya existe");
                break;
            }else{
                 
            }
            for (int i = 3; i < partes.length; i+=2) {
                String nombreA = partes[i];
                String calidadA = partes[i+1];                
                if (!sistema.AgregarAspecto(nombreA, calidadA)){
                    System.out.println("El aspecto ya existe ");
                try{
                    sistema.AsociarPersonajeAspecto(nombrePersonaje, nombreA);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    break;
                    
                }
            }
            
        }
        }
    }
    
    public static void leerCuentas(SistemaTienda sistema)throws FileNotFoundException{
     Scanner scan = new Scanner(new File("Cuentas.txt"));
   
     while (scan.hasNextLine()){
         String linea = scan.nextLine();
         String [] partes = linea.split(",");
         
         String nombre = partes[0];
         String contraseña = partes[1];
         String nick = partes[2];
         int nivel = Integer.parseInt(partes[3]);
         int rp = Integer.parseInt(partes[4]);
         int cant = Integer.parseInt(partes[5]);
         String servidor = partes[partes.length-1];
         for (int i = 6; i < partes.length-2; i++){
             String campeon = partes[i];
             System.out.println("Campeon: "+campeon);
             int cantAspectos = Integer.parseInt(partes[i+1]);
             for (int j = (i+2); j < (i+2)+cantAspectos; j++){
                 String nombreAspecto = partes[j];
                 System.out.println("\tAspecto: "+nombreAspecto);
             }
             i+=(cantAspectos+1);
             
         }
         
     }
     
     
    }
    
    
    
    
    
    
}

