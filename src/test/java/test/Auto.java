
public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
	   int contador = 0;
	   for (int i = 0; i < asientos.length; i++) {
		   if (asientos[i] != null) {
			   contador++;
			   }
		   }
	        return contador;
	    
	}
	
    public String verificarIntegridad() {
        String estado = "Auto original";
        for (int j = 0; j < asientos.length; j++) {
            if ( (asientos[j]!=null) &&  (!(motor.registro == registro) || !(registro == asientos[j].registro))) {
                estado = "Las piezas no son originales";
                break;
            }
        }
        return estado;

    }
}
