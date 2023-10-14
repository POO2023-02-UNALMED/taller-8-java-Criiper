package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + "tiene " + this.getEdad() + ", y juega de " + this.getPosicion()
		+ "con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad() - o.getEdad());
	}

	@Override
	public Boolean jugarConLasManos() {
		return false;
	}
	
}
