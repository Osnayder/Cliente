package edu.cecar.Controlador;

import edu.cecar.Modelo.Archivo;
import java.io.File;

/** Clase: Cliente
 * 
 * @version: 0.1
 *  
 * @sincelejo: 20/09/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */
public class Cliente {
    public Cliente(String IPServidor, int puerto) {
	try {
            SocketObjeto socketObjeto = new SocketObjeto(IPServidor, puerto); 
            File directorio=new File("Cliente"); // crea directorio
            directorio.mkdir();
         
            String ruta = directorio.getName();
            System.out.println("Me conecte");
			
            //*** Se inicia la descarga de un  archivo ***
            String nombreArchivo = "ArchivosJSON.dat";
            Archivo archivo = new Archivo(nombreArchivo, "Descarga");
            socketObjeto.getSalida().writeObject(archivo);
            Object object = socketObjeto.getEntrada().readObject();
            archivo =(Archivo)object;  
            Utilidades.escribirAchivo(ruta+ "\\" + nombreArchivo, archivo.getBytes());
            System.out.println("Archivo Descargado del Servidor con exito");

            Thread.sleep(1000); //Se bloquea por lo explicado en clase
            System.out.println("Cerrando conexión");
	} catch (Exception e) {
		// TODO Auto-generated catch block
            e.printStackTrace();
	}
        
    }
}
