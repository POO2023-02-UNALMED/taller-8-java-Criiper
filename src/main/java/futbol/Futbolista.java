package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.posicion = posicion;
	}

	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public abstract boolean jugarConLasManos();
	
	abstract public int compareTo(Futbolista f);

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	public String toString() {
		return "El futbolista " + this.getNombre() + "tiene " + this.getEdad() + ", y juega de" + this.getPosicion();
 	}
	
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		else {
			return false;
		}
	}
}

