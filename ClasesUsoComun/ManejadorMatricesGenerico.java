import java.util.ArrayList;
/*
 * Juan Manuel Ambriz Nu�ez 195554
 * 20/11/2020
 * Clase para el manejo de matrices de tipo T
 */
public class ManejadorMatricesGenerico {
	
	
	public static <T extends Comparable<T>> int buscaPorRenglon(T a[][], int f, T valor) {
		int m, j;
		boolean encontre;
	
		m=a[0].length;
		j=0;
		encontre=false;
		while(j<m && encontre==false) {
			if(a[f][j]!=null && a[f][j].equals(valor))
				encontre=true;
			else
				j++;
		}
		if(!encontre)
			j=-1;
		return j;
	}
	
	public static <T extends Comparable <T>> String creaString(T a[][]) {
		int i, j, n, m;
		StringBuilder sb;
		
		sb=new StringBuilder();
		n=a.length;
		m=a[0].length;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
				sb.append(a[i][j]+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static <T extends Comparable<T>> int buscaPorColumna(T a[][], int c, T valor) {
		int n, i;
		boolean encontre;
		
		n=a.length;
		i=0;
		encontre=false;
		
		while(i<n && encontre==false) {
			if(a[i][c]!=null && a[i][c].equals(valor))
				encontre=true;
			else
				i++;
		}
		if(!encontre)
			i=-1;
		return i;
	}

	public static <T extends Comparable<T>> int[] busca(T a[][],  T valor) {
		int i, j, resp[], n, m;
		boolean encontre;
		resp= new int [2];
		i=0;
		j=0;
		n=a.length;
		m=a[0].length;
		encontre=false;
		
		
		while(i<n && !encontre) {
			j=0;
			while(j<m && !encontre)
				if(a[i][j]!=null && a[i][j].equals(valor))
					encontre=true;
				else
					j++;
			if(j==m)
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
		return resp;
	}

	public static <T extends Comparable <T>> int indicaMayorColumna(T a[][], int c) {
		int i, mayor, n;
		n=a.length;
		mayor=0;
		
		for(i=1;i<n;i++)
			if(a[i][c].compareTo(a[mayor][c])>0)
				mayor=i;
		return mayor;
		
	}
	
	public static <T extends Comparable <T>> int indicaMenorColumna(T a[][], int c) {
		int i, menor, n;
		n=a.length;
		
		menor=0;
		for(i=1;i<n;i++)
			if(a[i][c].compareTo(a[menor][c])<0)
				menor=i;
		return menor;
	}
	
	public static <T extends Comparable <T>> int indicaMayorFila(T a[][], int f) {
		int j, mayor, m;
		m=a[0].length;
		
		mayor=0;
		for(j=1;j<m;j++)	
			if(a[f][j]!=null) {
				if(mayor==0)
					mayor=j;
				else
					if(a[f][j].compareTo(a[f][mayor])>0)
					mayor=j;
			}
		return mayor;
		
	}

	public static <T extends Comparable <T>> int indicaMenorFila(T a[][], int f) {
		int j, menor, m;
		m=a[0].length;
		
		menor=0;
		for(j=1;j<m;j++)
			if(a[f][j].compareTo(a[f][menor])<0)
				menor=j;
		return menor;
		
	}
	
	public static <T extends Comparable <T>> boolean sonIguales(T a[][], T b[][]) {
		int i, j, n1, n2, m1, m2;
		boolean iguales;
		
		n1=a.length;
		m1=a[0].length;
		n2=b.length;
		m2=b[0].length;
		iguales=true;
		
		if(n1==n2 && m1==m2) {
			i=0;
			while(i<n1 && iguales) {
				j=0;
				while(j<m1 && iguales) {
					if(!a[i][j].equals(b[i][j]))
						iguales=false;
					j++;
				}
				i++;
			}
		}
		else
			iguales=false;
		return iguales;
	}
	
	public static <T extends Comparable<T>> void matrizDiagonalInfMay(T a[][]) {
		int i, j, n, m;
		String resp;
		i=0;
		j=0;
		n=a.length;
		m=a[0].length;
		
		while(a[i][j].compareTo(a[j][i])>=0) {
			if(j<m)
				j++;
			else {
				i++;
				j=0;
			}
		}
			if(i>=0)
				resp="Mayor Arriba";
			else {
				while(a[i][j].compareTo(a[j][i])<=0) {
					if(j<m)
						j++;
					else {
						i++;
						j=0;
					}
			}
				if(i>=0)
					resp="Mayor Abajo";
				else
					resp="Diferentes";		
		}	
	}
	
	public static <T extends Comparable<T>> void incognita(T a[][]) {
		int i, j, n;
		n=a.length;
		
		for(i=0;i<n;i++)
			for(j=0;j<=i;j++)
				if(i==j)
					a[i][j]=null;
				else {
					if(a[i][j].compareTo(a[j][i])<0)
						a[i][j]=a[j][i];
					a[j][i]=null;
				}
	}
}
