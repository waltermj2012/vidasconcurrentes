/*
 * Author: Meta | http://vidasconcurrentes.blogspot.com
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/tratamiento-de-xml-en-java-lectura-y.html
 */

package com.vidasconcurrentes.javaxml;

import java.util.ArrayList;

public class Pedido {

	private int numeroPedido;
	private Usuario cliente;
	private ArrayList<Producto> listaProductos;
	
	public Pedido(int numeroPedido, Usuario cliente) {
		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
		this.listaProductos = new ArrayList<Producto>();
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void addProducto(Producto producto) {
		this.listaProductos.add(producto);
	}
}
