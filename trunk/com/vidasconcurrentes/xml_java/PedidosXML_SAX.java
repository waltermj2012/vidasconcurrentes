/*
 * Author: Meta | http://vidasconcurrentes.blogspot.com
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/tratamiento-de-xml-en-java-lectura-y.html
 */

package com.vidasconcurrentes.javaxml;

import java.io.IOException;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class PedidosXML_SAX extends DefaultHandler {

	private XMLReader reader;
	
	public PedidosXML_SAX() {
		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(this);
			reader.setErrorHandler(this);
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Pedido> XMLtoPedidos(String ruta) {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		
		try {
			reader.parse(ruta);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		
		return pedidos;
	}
	
	@Override
	public void startElement(String uri, String localName, String name, Attributes atts) {
		System.out.println("<" + localName + ">");
	}
	
	@Override  
	public void characters(char[] cadena, int inicio, int length) {   
		if(String.valueOf(cadena, inicio, length).trim().length() != 0)
			System.out.println(String.valueOf(cadena, inicio, length));
	}  
	
	@Override
	public void endElement(String uri, String name, String qName) {
		System.out.println("</" + name +">");
	}
}
