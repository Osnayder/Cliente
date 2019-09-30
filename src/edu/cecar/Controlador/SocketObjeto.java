package edu.cecar.Controlador;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/** Clase: SocketObjeto
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
public class SocketObjeto {
    private Socket socket;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public SocketObjeto(String IPServidor, int puerto) {

		try {
			socket = new Socket(IPServidor,puerto);
			salida = new ObjectOutputStream(socket.getOutputStream()); 
			entrada = new ObjectInputStream(socket.getInputStream());

		} catch (Exception e)   {
			System.out.println("Error General"+e);
		}

	} 

	public Socket getSocket() {
		return socket;
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}  

	public ObjectOutputStream getSalida() {
		return salida;
	}
}
