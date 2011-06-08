/*
 * Author: Meta | http://vidasconcurrentes.blogspot.com
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/tratamiento-de-xml-en-java-lectura-y.html
 */

package com.vidasconcurrentes.javaxml;

public class Usuario {

	private String user;
	private String nombre;
	private String apellido;
	
	public Usuario(String user, String nombre, String apellido) {
		this.user = user;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getUser() {
		return user;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
}
