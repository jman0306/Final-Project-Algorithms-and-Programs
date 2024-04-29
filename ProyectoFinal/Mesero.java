/*
 * Juan Manuel Ambriz Nu�ez 195554 
 * 02/12/2020
 */
public class Mesero implements Comparable<Mesero>{
	private String nombre;
	private char genero;
	private int mesa;
	
	public Mesero(String nombre, char genero, int mesa) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.mesa = mesa;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public String getNombre() {
		return nombre;
	}

	public char getGenero() {
		return genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesero other = (Mesero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Mesero otro) {
		return nombre.compareTo(otro.getNombre());
	}
	
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Mesero\n");
		sb.append("  nombre:      "+nombre+"\n");
		sb.append("  genero:      "+genero+"\n");
		sb.append("  mesa  :      "+mesa+"\n");
		
		return sb.toString();
	}
}
