/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.Modelo;

import java.io.Serializable;

/** Interface: UsuarioControlador
 * 
 * @version: 0.1
 *  
 * @sincelejo: 21/08/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */
public class Archivo implements Serializable{
    private static final long serialVersionUID = 1000L;
	private String nombre;
	private byte[] bytes;
	private String Operacion;
	
	public Archivo(String nombre,String operacion) {
		this.nombre = nombre;
		this.Operacion = operacion;
	}
	
	
	public Archivo(String nombre, byte[] bytes, String operacion) {
		
		this.nombre = nombre;
		this.bytes = bytes;
		Operacion = operacion;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	
	public String getNombre() {
		return nombre;
	}

	public byte[] getBytes() {
		return bytes;
	}
		
	public String getOperacion() {
		return Operacion;
	}
}
