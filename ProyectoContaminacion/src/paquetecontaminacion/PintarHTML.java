package paquetecontaminacion;

import java.util.ArrayList;
import java.util.HashMap;

public class PintarHTML {

	public static String crearTabla(ArrayList<Contaminante> lista_contaminantes) {
		String html_tabla="<html><head></head><body>";
		html_tabla+="<table border=1>";
		html_tabla+="<tr><th>Magnitud</th><th>Estación</th><th>Fecha</th>"+cabeceraHoras()+"</tr>";
		HashMap<String, String> mapa_estaciones=ClaseConstantes.puntoMuestreo();
		HashMap<String, String> mapa_magnitudes=ClaseConstantes.contamin();
		for (Contaminante contaminante : lista_contaminantes) {
			String cod_magnitud=contaminante.getMagnitud();
			String cod_estacion=contaminante.getEstacion();
			String nombre_magnitud=mapa_magnitudes.get(cod_magnitud);
			String nombre_estacion=mapa_estaciones.get(cod_estacion);
			html_tabla+="<tr><td>"+nombre_magnitud+"</td><td>"+nombre_estacion+
					"</td><td>"+contaminante.getFecha()+"</td>"+pintarCantidades(contaminante.getCantidades())+"</tr>";
		}
		html_tabla+="</table></body></html>";
		return html_tabla;
	}

	private static String pintarCantidades(String[] cantidades) {
		String aux="";
		for (int i=0; i<cantidades.length; i++)
		{
			aux+="<td>"+convertirEnNumero(cantidades[i])+"</td>";//0005->5
		}
		return aux;
	}

	private static String convertirEnNumero(String string) {
		String numero="";
		try
		{
			int n=Integer.parseInt(string);
			numero=String.valueOf(n);
		}
		catch(Exception e)
		{
			float n=Float.parseFloat(string);
			numero=String.valueOf(n);
		}
		return numero;
		
	}

	private static String cabeceraHoras() {
		String aux="";
		for (int i=0; i<24; i++)
		{	aux+="<td>";
			aux+=i+":00-"+(i+1)+":00";
			aux+="</td>";
		}
		return aux;
	}

}
