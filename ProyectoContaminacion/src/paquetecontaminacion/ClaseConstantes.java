package paquetecontaminacion;

import java.util.HashMap;

public class ClaseConstantes {
	public static HashMap<String, String> puntoMuestreo() {
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("28079001", "P�. Recoletos");
		mapa.put("28079002", "Glta. de Carlos V");
		mapa.put("28079035", "Pza. del Carmen");
		mapa.put("28079004", "Pza. de Espa�a");
		mapa.put("28079039", "Barrio del Pilar");
		mapa.put("28079006", "Pza. Dr. Mara��n");
		mapa.put("28079007", "Pza. M. de Salamanca");
		mapa.put("28079008", "Escuelas Aguirre");
		mapa.put("28079009", "Pza. Luca de Tena");
		mapa.put("28079038", "Cuatro Caminos");
		mapa.put("28079011", "Av. Ram�n y Cajal");
		mapa.put("28079012", "Pza. Manuel Becerra");
		mapa.put("28079040", "Vallecas");
		mapa.put("28079014", "Pza. Fdez. Ladreda");
		mapa.put("28079015", "Pza. Castilla");
		mapa.put("28079016", "Arturo Soria");
		mapa.put("28079017", "Villaverde Alto");
		mapa.put("28079018", "C/ Farolillo");
		mapa.put("28079019", "Huerta Casta�eda");
		mapa.put("28079036", "Moratalaz");
		mapa.put("28079021", "Pza. Cristo Rey");
		mapa.put("28079022", "P�. Pontones");
		mapa.put("28079023", "Final C/ Alcal�");
		mapa.put("28079024", "Casa de Campo");
		mapa.put("28079025", "Santa Eugenia");
		mapa.put("28079026", "Urb. Embajada (Barajas)");
		mapa.put("28079027", "Barajas");
		mapa.put("28079047", "M�ndez �lvaro");
		mapa.put("28079048", "P�. Castellana");
		mapa.put("28079049", "Retiro");
		mapa.put("28079050", "Pza. Castilla");
		mapa.put("28079054", "Ensanche Vallecas");
		mapa.put("28079055", "Urb. Embajada (Barajas)");
		mapa.put("28079056", "Plaza El�ptica");
		mapa.put("28079057", "Sanchinarro");
		mapa.put("28079058", "El Pardo");
		mapa.put("28079059", "Parque Juan Carlos I ");
		mapa.put("28079060", "Tres Olivos");
		return mapa;
	}

	public static HashMap<String, String> contamin() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Dioxido de Azufre (�g/m 3)");
		map.put("6", "Mon�xido de Carbono (mg/m3)");
		map.put("7", "Mon�xido de Nitr�geno (�g/m3)");
		map.put("8", "Di�xido de Nitr�geno (�g/m3)");
		map.put("9", "Part�culas < 2.5 �m (�g/m3)");
		map.put("10", "Part�culas < 10 �m (�g/m3)");
		map.put("12", "�xidos de Nitr�geno (�g/m3)");
		map.put("14", "Ozono (�g/m3)");
		map.put("20", "Tolueno (�g/m3)");
		map.put("30", "Benceno (�g/m3)");
		map.put("35", "Etilbenceno (�g/m3)");
		map.put("37", "Metaxileno (�g/m3)");
		map.put("38", "Paraxileno (�g/m3)");
		map.put("39", "Ortoxileno (�g/m3)");
		map.put("42", "Hidrocarburos totales (hexano) (mg/m3)");
		map.put("43", "Metano (mg/m3)");
		map.put("44", "Hidrocarburos no met�nicos (hexano) (mg/m3)");
		return map;

	}
}
