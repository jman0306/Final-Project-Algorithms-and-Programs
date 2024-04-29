/*
 * Juan Manuel Ambriz Nu�ez 
 * 04/11/2020
 * Clase para el manejo de matrices
 */
public class ManejadorMatrices {
	
	public static double sumaColumna(double a[][], int n, int columna) {
		double resp;
		int i;
		
		resp=0;
		for(i=0;i<n;i++)
			resp=resp+a[i][columna];
		return resp;
	}
	
	public static double sumaFila(double a[][], int m, int fila) {
		double resp;
		int j;
		
		resp=0;
		for(j=0;j<m; j++)
			resp=resp+a[fila][j];
		return resp;
	}
	
	public static double sumaMatriz(double a[][], int n, int m) {//n filas, m columnas
		double resp;
		int i, j;
		resp=0;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				resp=resp+a[i][j];
		return resp;
	}
	
	public static int mayorColumna(double a[][], int n, int columna ) {
		int i, mayor;
		
		mayor=0;
		for(i=1;i<n;i++)
			if(a[i][columna]>a[mayor][columna])
				mayor=i;
		return mayor;
	}
	
	public static int mayorFila(double a[][], int m, int fila) {
	int j, mayor;
	
	mayor=0;
	for(j=1;j<m;j++)
		if(a[fila][j]>a[fila][mayor])
			mayor=j;
	return mayor;
	}
	
	public static int [][] invierteMatriz(int a[][],int m, int n) {
		int j, i, mitad, aux;
		mitad=n/2;
		
		for(i=0;i<mitad;i++)    
			for(j=0;j<m;j++) {
				aux=a[i][j];
				a[i][j]=a[(n-i-1)][j];
				a[((n-i)-1)][j]=aux;
		}
		return a;
	}
}
