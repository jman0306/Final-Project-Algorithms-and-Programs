```java
import java.util.ArrayList;

/*Juan Manuel Ambriz N��ez 195554
 * 02/10/2020
 * Clase para el manejo general de arreglos 
 */
public class ManejadorArreglos {
	
	public static double sumaArreglo(double a[], int n) {
	double suma;
	int i;
	
	suma=0;
	for(i=0;i<n;i++)
		suma=suma+a[i];
	return suma;
	}
	
	public static double promedioArreglo(double a[], int n) {
		double suma, prom;
		
		suma=sumaArreglo(a,n);
		prom=suma/n;
		return prom;
	}
	
	public static int mayorArreglo(double a[], int n) {
		int mayor, i;
		
		mayor=0;
		for (i=1;i<n; i++)
			if(a[i]>a[mayor])
				mayor=i;
		return mayor;
	}
	
	public static int menorArreglo(double a[], int n) {
		int menor, i;
		
		menor=0;
		for (i=1;i<n; i++)
			if(a[i]<a[menor])
				menor=i;
		return menor;
	}
	
	public static int cuantosMenorA(double a[], int n, double p) {
		int i, cuantos;
		
		cuantos=0;
		for(i=0; i<n; i++)
			if(a[i]<p)
				cuantos++;
		return cuantos;
	}
	
	public static int cuantosMayorA(double a[], int n, double p) {
		int i, cuantos;
		
		cuantos=0;
		for(i=0; i<n; i++)
			if(a[i]>p)
				cuantos++;
		return cuantos;
	}
	
	public static ArrayList<Double> cualesMayorA(double a[], int n, double p) {
		int i;
		ArrayList<Double> cuales;
		cuales=new ArrayList<Double>();
		for(i=0;i<n;i++)
			if(a[i]>p)
				cuales.add(a[i]);
		return cuales;
	}
	
	public static ArrayList<Double> cualesMenorA(double a[], int n, double p) {
		int i;
		ArrayList<Double> cual;
		cual=new ArrayList<Double>();
		for(i=0;i<n;i++)
			if(a[i]<=p)
				cual.add(a[i]);
		return cual;
	}
	
	public static void recorreDerecha(double a[], int n) {
		int i;
		for (i=n-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=0;
	}
	
	public static void recorreIzquierda(double a[], int n) {
		int i;
		for(i=0;i<n-1;i++)
			a[i]=a[i+1];
		a[n-1]=0;
	}
	
	public static void recorreDerechaApartirPos(double a[], int n, int pos) {//ver como se aplica en clase Editorial
		int i;
		for (i=n;i>0;i--)
			a[i]=a[i-1];
		a[pos]=0;
	}
	
	
	public static void invierteNumeros(double a[], int n) {
		int i;
		int z=n;
		double suma, d=n/2;
		for(i=0;i<d;i++){
			suma=0;
			suma=suma+a[i];
			a[i]=a[z];
			a[z]=suma;
			z--;
		}
	}
	
	public static void ordena(double a[], int n) {
		int i, j, menor;
		double aux;
		
		for(i=0;i<(n-1);i++) {
			menor=i;
			for(j=(i+1);j<n;j++)
				if(a[j]<a[menor])
				menor=j;
			aux=a[i];
			a[i]=a[menor];
			a[menor]=aux;
		}
	}
	
	public static int buscaSeq(double a[], int n, double valor) { //Indica la pocision de un elemento en un arreglo (CUANDO NO ESTA ORDENADO)
		int i, pos;
		
		i=0;
		while(i<n && a[i]!=valor)
			i++;
		if(i<n)
			pos=i;
		else
			pos=-1;
		return pos;
	}
	
	public static int buscaBinaria(double a[], int n, double valor) {//verfificar como se utiliza en clase Editorial
		int inicio, fin, mitad, resp;
		inicio=0;
		fin=n-1;
		mitad=(inicio+fin)/2;
		while(inicio<=fin && a[mitad]!=valor) {
			if(a[mitad]>valor)
				inicio=mitad+1;
			else
				fin=mitad-1;
			mitad=(inicio+fin)/2;
		}
		if(inicio<=fin)
			resp=mitad;
		else
			resp=inicio-1;
		return resp;
		}
	
	public static int[] cuentaNumeros(ArrayList<Integer>cuantos){
		int n, i, r, suma;
		n=cuantos.size();
		int a[] = new int[6];
		for(i=0;i<=5;i++) {
			suma=0;
			for(r=0;r<=n-1;r++) {
				if(i==cuantos.get(r))
				suma++;
			}
		a[i]=suma;
		}
		return a;
	}
}
```
