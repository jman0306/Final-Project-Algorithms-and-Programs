	/*
 * Juan Manuel Ambriz Nu�ez 195554 
 * 02/12/2020
 * Una fiesta que tiene como atributos un arreglo de meseros y una matriz de invitados 
 */

public class Fiesta {
	private String nombre;
	private String direccion;
	private final int MAXF=5;
	private final int MAXC=10;
	private Persona lugares[][];
	private Mesero meseros[];
	private int ocupados;
	
	public Fiesta(){
		lugares= new Persona [MAXF][MAXC];
		meseros= new Mesero [MAXF];
	}

	public Fiesta(String nombre, String direccion) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public String getElementMatriz(int fila, int col) {
		String resp;
		if(fila>=0 && fila<MAXF && col>=0 && col<MAXC)
			if(lugares[fila][col]!=null)
				resp=lugares[fila][col].getNombre();
			else 
				resp=" ";
		else
			resp="-";
		return resp;
	}
	
	public String getElementArreglo(int lugar) {
		String resp;
		if(lugar>=0 && lugar<MAXF)
			if(meseros[lugar]!=null)
				resp=meseros[lugar].getNombre();
			else
				resp=" ";
		else
			resp=" ";
		return resp;
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
		Fiesta other = (Fiesta) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Fiesta otra) {
		return nombre.compareTo(otra.getNombre());
	}
	
	public String toString() {
		StringBuilder sb;
		int i, j;
		sb=new StringBuilder();
		sb.append("Fiesta\n");
		sb.append("  nombre:       "+nombre+"\n");
		sb.append("  direccion:    "+direccion+"\n");
		sb.append("  lugarres:     \n"); 
		for(i=0;i<MAXF;i++) {                   //imprimir matriz
			for(j=0;j<MAXC;j++)
				if(lugares[i][j]==null)
					sb.append("-----"+"\t");
				else
					sb.append(lugares[i][j].getEdad()+"\t");
			sb.append("\n");
		}
		sb.append("  meseros: ");
		for(i=0;i<MAXF;i++)
			if(meseros[i]!=null)
				sb.append(meseros[i].getNombre());
			else
				sb.append("  ---  ");
		sb.append("\n");
		return sb.toString();
	}
	
	public boolean altaInvitado(String nombre, int edad, char edoCivil) {
		int resp[];
		int i, j, fila;
		boolean encontre;
		Persona otra;
		
		resp=new int [2];
		if(edoCivil=='S') {//mesa 1 de solteros
			
			j=0;
			while(j<MAXC && lugares[0][j]!=null)
				j++;
			if(j<MAXC) {
				resp[0]=0;
				resp[1]=j;
				encontre=true;
			}
			else {
				resp[0]=-1;
				resp[1]=-1;
				encontre=false;
			}
		}
		else {
			i=1;
			j=0;
			encontre=false;
			while(i<MAXF && !encontre) {
				j=0;
				while(j<MAXC && lugares [i][j]!=null)
					j++;
				if(j<MAXC)
					encontre=true;
				else
					i++;
				}
				if(encontre) {
					resp[0]=i;
					resp[1]=j;
				}
				else {
					resp[0]=-1;
					resp[1]=-1;
				}
			}
			if(encontre) {
				otra=new Persona(nombre, edad, edoCivil);
				fila=resp[0];
				lugares[fila][resp[1]]=otra;
			}
		return encontre;
	}
	
	public boolean bajaInvitado (String nombre, int edad) {
		int i, j;
		boolean resp;
		i=0;
		j=0;
		resp=false;
	
		while(i<MAXF && !resp) {
			j=0;
			while(j<MAXC && !resp)
				if(lugares[i][j]!=null && lugares[i][j].getNombre().equals(nombre) && lugares[i][j].getEdad()==edad)
					resp=true;
				else 
					j++;
			if(j<MAXC)
				resp=true;
			else 
				i++;
			
			if(resp) {
				lugares[i][j]=null;
			}
			else
				resp=false;
		}
		return resp;	
	}
	
	public boolean altaMesero(String nombre, char genero, int mesa) {
		boolean resp;
		Mesero otro;
		
		otro=new Mesero(nombre, genero, mesa);
		resp=ManejadorArreglosGenerico.altaOrdenada(otro, meseros, ocupados, MAXF);
		if(resp)
			ocupados++;
		
		return resp;
	}
	
	public boolean bajaMesero(String nombre, int mesa) {
		boolean encontre;
		int i;
		Mesero otro, resp1;
		otro=new Mesero(nombre, ' ', mesa);
		encontre= false;
		i=0;
		
		
		resp1=ManejadorArreglosGenerico.bajaOrdenada(otro, meseros, ocupados);
		if(resp1==null)
			encontre=false;
		else
			encontre=true;
		
		return encontre;
	}
	
	public  int inidcaTotalInvitados() { 
		int i, j, ocupados;
		
		ocupados=0;
		for(i=0;i<MAXF;i++)
			for(j=0;j<MAXC;j++)
				if(lugares[i][j]!=null)
					ocupados++;
		return ocupados;
	}
	
	public String indicaMayorPorMesa(int mesa){
		String a;
		int resp;
		
		resp=ManejadorMatricesGenerico.indicaMayorFila(lugares, mesa);
		a=lugares[mesa][resp].getNombre();		
		
		return a;
	}
	
	public int [] encuentraAsiento(String nombre, int edad) {
		Persona una;
		int a[];
		a= new int [2];
		una= new Persona(nombre, edad, ' ');
		
		a=ManejadorMatricesGenerico.busca(lugares, una);
		if(a[0]!=-1 && a[1]!=-1)
			lugares[a[0]][a[1]].setEdoCivil('R');
		
		return a;
	}
	
	public boolean retiraNoLlegaron() {
		boolean resp = false;
		int i, j;
		
		for(i=0;i<MAXF;i++)
			for(j=0;j<MAXC;j++)
				if(lugares[i][j].getEdoCivil()!='R')
					resp=bajaInvitado(lugares[i][j].getNombre(), lugares[i][j].getEdad());
		
	return resp;
	}
	
}
