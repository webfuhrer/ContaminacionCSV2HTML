package paquetecontaminacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {
	public static ArrayList<Contaminante> leerFichero()
	{
		ArrayList<Contaminante> lista_contaminantes=new ArrayList<Contaminante>();
		try {
			FileReader fr=new FileReader("T:\\contaminacion\\horario.csv");
			BufferedReader br=new BufferedReader(fr);
			String linea=br.readLine();//La primera línea no tiene datos. Sólo cabecera.
			linea=br.readLine();
			while(linea!=null)
			{
				String[] datos=linea.split(";");
				String magnitud=datos[3];
				//datos[4] es 28079004_1_38
				String estacion=datos[4].split("_")[0];
				String fecha=datos[7]+"/"+datos[6]+"/"+datos[5];
				String[] cantidades=new String[24];
				int indice_cantidades=0;
				for (int i=8; i<datos.length; i=i+2)
				{
					cantidades[indice_cantidades]=datos[i];
					indice_cantidades++;
				}
				Contaminante c=new Contaminante(estacion, magnitud, fecha, "", cantidades);
				lista_contaminantes.add(c);
				linea=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista_contaminantes;
	}

	public static void grabarTabla(String html_tabla) {
		try {
			FileWriter fw=new FileWriter("T:\\tabla.html");
			fw.write(html_tabla);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
