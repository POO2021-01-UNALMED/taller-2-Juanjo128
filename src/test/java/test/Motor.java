
public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int x) {
		this.registro = x;
	}
	
	public void asignarTipo(String y) {
		if(y.equals("gasolina") || y.equals("electrico")) {
			this.tipo = y;
		}
	}
}
