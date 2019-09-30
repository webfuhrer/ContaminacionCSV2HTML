package paquetecontaminacion;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		ArrayList<Contaminante> lista_contaminantes=AccesoFichero.leerFichero();
		String html_tabla=PintarHTML.crearTabla(lista_contaminantes);
		System.out.println(html_tabla);
		AccesoFichero.grabarTabla(html_tabla);

	}

}
