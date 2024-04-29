/*
 * Juan Manuel Ambriz Nu�ez 195554 
 * 02/12/2020
 */
public class Persona implements Comparable<Persona> {
	private String nombre;
	private int edad;
	private char edoCivil;
	
	public Persona(String nombre, int edad, char edoCivil) {
		this.nombre = nombre;
		this.edad = edad;
		this.edoCivil = edoCivil;
	}

	public char getEdoCivil() {
		return edoCivil;
	}

	public void setEdoCivil(char edoCivil) {
		this.edoCivil = edoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
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
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Persona otra) {
		int resp;
		if(otra.getEdad()==edad) //<--
			resp=0;
		else
			if(edad<otra.getEdad())
				resp=-1;
			else
				resp=1;
		return resp;
	}	
	
	public String toString() {
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("Persona\n");
		sb.append("  nombre:       "+nombre+"\n");
		sb.append("  edad:         "+edad+"\n");
		sb.append("  edo civil:    "+edoCivil+"\n");
		
		return sb.toString();
	}
	

}
