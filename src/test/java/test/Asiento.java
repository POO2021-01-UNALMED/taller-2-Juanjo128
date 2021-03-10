package test;
public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String Color) {
		if(Color.equals("rojo") || Color.equals("verde") || Color.equals("amarillo") || Color.equals("negro") || Color.equals("blanco")) {
			this.color = Color;
		}
	}
}
