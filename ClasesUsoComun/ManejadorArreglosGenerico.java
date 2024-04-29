import java.util.ArrayList;

/*
 * Juan Manuel Ambriz Nu�ez 195554
 * 
 */
//SIEMPRE PONER IMPLEMENT EN LA BASICA (Alumno de Universidad), ej, "public class Alumno implements Comparable <Alumno>"
public class ManejadorArreglosGenerico {//Solo entre objetos de arreglos 
	
	public static <T extends Comparable<T>> int indiceMayor(T a[], int n) {//T porque tiene que ser del mismo tipo, Ej, Alumnos=Alumnos 
		int mayor, i;
		
		mayor=0;
		for (i=1;i<n; i++)
			if(a[i].compareTo(a[mayor])>0)//en lo que tenga en el compareTo
				mayor=i;
		return mayor;
	}
	
	public static <T extends Comparable<T>> int indiceMenor(T a[], int n) {
		int menor, i;
		
		menor=0;
		for (i=1;i<n; i++)
			if(a[i].compareTo(a[menor])<0)
				menor=i;
		return menor;
	}
	
	public static <T extends Comparable<T>> int cuantosMayorA(T a[], int n, T p) {
		int i, cuantos;
		
		cuantos=0;
		for(i=0; i<n; i++)
			if(a[i].compareTo(p)>0)
				cuantos++;
		return cuantos;
	}
	
	public static <T extends Comparable<T>> int cuantosMenorA(T a[], int n, T p) {
		int i, cuantos;
		
		cuantos=0;
		for(i=0; i<n; i++)
			if(a[i].compareTo(p)<0)
				cuantos++;
		return cuantos;
	}
	
	public static <T extends Comparable<T>> ArrayList<T> cualesMayorA(T a[], int n, T p) {
		int i;
		ArrayList<T> cuales;
		
		cuales=new ArrayList<T>();
		for(i=0;i<n;i++)
			if(a[i].compareTo(p)>0)
				cuales.add(a[i]);
		return cuales;
	}
	
	public static <T extends Comparable<T>> void recorreDerechaApartirPos(T a[], int n, int pos) {
		int i;
		for (i=n;i>pos;i--)//habia n-1
			a[i]=a[i-1];
		a[pos]=null;
	}
	
	public static <T extends Comparable<T>> void recorreIzquierdaApartirPos(T a[], int n, int pos) {
		int i;
		for (i=pos;i<n-1;i++)
			a[i]=a[i+1];
		a[n-1]=null;
	}
	
	
	public static <T extends Comparable<T>> int buscaSeq(T a[], int n, T valor) { //Indica la pocision de un elemento en un arreglo (CUANDO NO ESTA ORDENADO)
		int i, pos;
		
		i=0;
		while(i<n && !a[i].equals(valor))
			i++;
		if(i<n)
			pos=i;
		else
			pos=-1;
		return pos;
	}
	
	public static <T extends Comparable<T>> int buscaBinaria(T a[], int n, T valor) {
		int inicio, fin, mitad, resp;
		inicio=0;
		fin=n-1;
		mitad=(inicio+fin)/2;
		while(inicio<=fin && !a[mitad].equals(valor)) {
			if(valor.compareTo(a[mitad])>0)
				inicio=mitad+1;
			else
				fin=mitad-1;
			mitad=(inicio+fin)/2;
		}
		if(inicio<=fin)
			resp=mitad;
		else
			resp=-inicio-1;
		return resp;
		}
	
	public static <T extends Comparable<T>> boolean altaOrdenada(T uno, T a[], int ocupados, int MAX) {
		boolean resp;
		int pos;
		
		if (ocupados<MAX) {
			pos=buscaBinaria(a, ocupados, uno);
			if(pos>0)
				resp=false;
			else {
				pos=(pos*-1)-1;
				recorreDerechaApartirPos(a, ocupados, pos);
				a[pos]=uno;
				resp=true;
			}
		}
		else
			resp=false;
		return resp;
	}
	
	
	public static <T extends Comparable<T>> boolean altaFinal(T uno, T a[], int ocupados, int MAX) {
		boolean resp;
		int pos;
		
		if(ocupados<MAX) {//si hay lugar
			pos=buscaSeq(a, ocupados, uno);
			if(pos<ocupados) //ya esta
				resp=false;
			else{
				a[ocupados]=uno;
				resp=true;
			}
		}
		else 
			resp=false; //no hay lugar 
		return resp;
		}
	
	
	public static <T extends Comparable<T>> T bajaOrdenada(T uno, T a[], int ocupados) {
		int pos;
		T resp;
		
		pos=buscaBinaria(a, ocupados, uno);
		if(pos>=0) {//si esta
			uno=a[pos];
			recorreIzquierdaApartirPos(a, ocupados, pos);
			resp=uno;
		}
		else
			resp=null;
		return resp;
		}
	
	public static <T extends Comparable<T>> T baja(T uno, T a[], int ocupados) {
		int pos;
		T resp;
		
		pos=buscaSeq(a, ocupados, uno);
		if(pos>=0) {
			uno=a[pos];
			recorreIzquierdaApartirPos(a, ocupados, pos);
			resp=uno;
		}
		else
			resp=null;
		return resp;
		}
}
