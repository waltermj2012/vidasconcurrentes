/*
 * Author: Meta | http://vidasconcurrentes.blogspot.com
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/tratamiento-de-xml-en-java-lectura-y.html
 */

package com.vidasconcurrentes.javaxml;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		int lectura_o_escritura = 0; // 0 == escritura, 1 == lectura
		switch(lectura_o_escritura) {
			case 0:
				// lista de pedidos
				ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
				
				// usuarios
				Usuario user1 = new Usuario("Neo", "Thomas", "Anderson");
				Usuario user2 = new Usuario("Cifra", "Mr.", "Regan");
				
				// productos
				Producto product1 = new Producto("Matrix 7.0");
				Producto product2 = new Producto("Reinsercion 1.0");
				Producto product3 = new Producto("Gravedad 2.0");
				
				// creamos el primer pedido
				Pedido pedido1 = new Pedido(1, user1);
				pedido1.addProducto(product1);
				pedido1.addProducto(product3);
				
				// creamos el segundo pedido
				Pedido pedido2 = new Pedido(2, user2);
				pedido2.addProducto(product2);
				
				// añadimos los pedidos a la lista
				pedidos.add(pedido1);
				pedidos.add(pedido2);
				
				// creamos los procesadores en DOM y en SAX
				PedidosXML_DOM dom = new PedidosXML_DOM();
				PedidosXML_SAX sax = new PedidosXML_SAX();
				
				// escritura con DOM
				dom.pedidosToXML(pedidos, "pedidos.xml");
				break;
			case 1:
				// lectura de fichero, quitar comentario en el caso que se quiera probar
				ArrayList<Pedido> pedidosLeidos;
				// pedidosLeidos = dom.XMLtoPedidos("pedidos.xml");
				// pedidosLeidos = sax.XMLtoPedidos("pedidos.xml");
				break;
			default:
				System.out.println("lectura_o_escritura == 0 -> Escritura");
				System.out.println("lectura_o_escritura == 1 -> Lectura");
				break;
		}
	}
}
