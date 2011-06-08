/*
 * Author: Meta | http://vidasconcurrentes.blogspot.com
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/tratamiento-de-xml-en-java-lectura-y.html
 */

package com.vidasconcurrentes.javaxml;

import java.util.Date;

public class Producto {

	private String nombre;
	private Date fechaAlta;
	
	private void init(String nombre, Date fechaAlta) {
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
	}
	
	public Producto(String nombre) {
		init(nombre, new Date());
	}
	
	public Producto(String nombre, Date fechaAlta) {
		init(nombre, fechaAlta);
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}
}
