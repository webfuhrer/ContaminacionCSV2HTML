package paquetecontaminacion;

public class Contaminante {
private String estacion, magnitud, fecha, unidades;
private String[] cantidades=new String[24];
public Contaminante(String estacion, String magnitud, String fecha, String unidades, String[] cantidades) {
	super();
	this.estacion = estacion;
	this.magnitud = magnitud;
	this.fecha = fecha;
	this.unidades = unidades;
	this.cantidades = cantidades;
}
public String getEstacion() {
	return estacion;
}
public String getMagnitud() {
	return magnitud;
}
public String getFecha() {
	return fecha;
}
public String getUnidades() {
	return unidades;
}
public String[] getCantidades() {
	return cantidades;
}


}
