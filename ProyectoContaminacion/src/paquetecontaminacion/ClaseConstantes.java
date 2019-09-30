package paquetecontaminacion;

import java.util.HashMap;

public class ClaseConstantes {
	public static HashMap<String, String> puntoMuestreo() {
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("28079001", "Pº. Recoletos");
		mapa.put("28079002", "Glta. de Carlos V");
		mapa.put("28079035", "Pza. del Carmen");
		mapa.put("28079004", "Pza. de España");
		mapa.put("28079039", "Barrio del Pilar");
		mapa.put("28079006", "Pza. Dr. Marañón");
		mapa.put("28079007", "Pza. M. de Salamanca");
		mapa.put("28079008", "Escuelas Aguirre");
		mapa.put("28079009", "Pza. Luca de Tena");
		mapa.put("28079038", "Cuatro Caminos");
		mapa.put("28079011", "Av. Ramón y Cajal");
		mapa.put("28079012", "Pza. Manuel Becerra");
		mapa.put("28079040", "Vallecas");
		mapa.put("28079014", "Pza. Fdez. Ladreda");
		mapa.put("28079015", "Pza. Castilla");
		mapa.put("28079016", "Arturo Soria");
		mapa.put("28079017", "Villaverde Alto");
		mapa.put("28079018", "C/ Farolillo");
		mapa.put("28079019", "Huerta Castañeda");
		mapa.put("28079036", "Moratalaz");
		mapa.put("28079021", "Pza. Cristo Rey");
		mapa.put("28079022", "Pº. Pontones");
		mapa.put("28079023", "Final C/ Alcalá");
		mapa.put("28079024", "Casa de Campo");
		mapa.put("28079025", "Santa Eugenia");
		mapa.put("28079026", "Urb. Embajada (Barajas)");
		mapa.put("28079027", "Barajas");
		mapa.put("28079047", "Méndez Álvaro");
		mapa.put("28079048", "Pº. Castellana");
		mapa.put("28079049", "Retiro");
		mapa.put("28079050", "Pza. Castilla");
		mapa.put("28079054", "Ensanche Vallecas");
		mapa.put("28079055", "Urb. Embajada (Barajas)");
		mapa.put("28079056", "Plaza Elíptica");
		mapa.put("28079057", "Sanchinarro");
		mapa.put("28079058", "El Pardo");
		mapa.put("28079059", "Parque Juan Carlos I ");
		mapa.put("28079060", "Tres Olivos");
		return mapa;
	}

	public static HashMap<String, String> contamin() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Dioxido de Azufre (µg/m 3)");
		map.put("6", "Monóxido de Carbono (mg/m3)");
		map.put("7", "Monóxido de Nitrógeno (µg/m3)");
		map.put("8", "Dióxido de Nitrógeno (µg/m3)");
		map.put("9", "Partículas < 2.5 µm (µg/m3)");
		map.put("10", "Partículas < 10 µm (µg/m3)");
		map.put("12", "Óxidos de Nitrógeno (µg/m3)");
		map.put("14", "Ozono (µg/m3)");
		map.put("20", "Tolueno (µg/m3)");
		map.put("30", "Benceno (µg/m3)");
		map.put("35", "Etilbenceno (µg/m3)");
		map.put("37", "Metaxileno (µg/m3)");
		map.put("38", "Paraxileno (µg/m3)");
		map.put("39", "Ortoxileno (µg/m3)");
		map.put("42", "Hidrocarburos totales (hexano) (mg/m3)");
		map.put("43", "Metano (mg/m3)");
		map.put("44", "Hidrocarburos no metánicos (hexano) (mg/m3)");
		return map;

	}
}
