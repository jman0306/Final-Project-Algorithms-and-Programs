import java.io.*;
import java.util.*;

/*
 * Juan Manuel Ambriz Nu�ez 195554 
 * 02/12/2020
 * Probar funcionalidad de la calse Fiesta
 */
public class EFiesta {

	public static void main(String[] args) {
		Fiesta miFiesta;
		Scanner lectura;
		File miArchivo;
		int n, edad, i, mesa;
		String nombre;
		char edoCivil, genero;
		boolean resp;
		int a[];
		a=new int [2];
		
		miFiesta= new Fiesta("Fiesta de Maria", "Calle 1");
		miArchivo= new File("Invitados.txt");
		
		try {
			lectura=new Scanner(miArchivo);
			n=lectura.nextInt();
			
			for(i=1;i<=n;i++) {
				nombre=lectura.next();
				edad=lectura.nextInt();
				edoCivil=lectura.next().charAt(0);
				
				resp=miFiesta.altaInvitado(nombre, edad, edoCivil);
				if(resp!=true)
					System.out.println("Alta NO exitosa "+nombre+" "+edad);
			}
			System.out.println(miFiesta.toString());
			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		
		
		n=miFiesta.inidcaTotalInvitados();
		System.out.println("Total de invitados: "+n);
		nombre=miFiesta.indicaMayorPorMesa(1);
		System.out.println("Mayor de la mesa 1: "+nombre);
		lectura=new Scanner(System.in);
		
		/*lectura=new Scanner(System.in);
		System.out.println("Dame nombre:");
		nombre=lectura.next();
		System.out.println("Dame edad:");
		edad=lectura.nextInt();
		a=miFiesta.encuentraAsiento(nombre, edad);
		System.out.println("Mesa "+a[0]+" asiento "+a[1]);
		
		resp=miFiesta.retiraNoLlegaron();
		if(resp)
			System.out.println("Correcto");
		System.out.println(miFiesta.toString());
		*/
		
		resp=miFiesta.altaMesero("ALEJANDRA", 'F', 1);
		if(!resp)
			System.out.println("Alta NO exitosa");
		System.out.println(miFiesta.toString());
		System.out.println("Dame nombre");
		nombre=lectura.next();
		System.out.println("Dame genero");
		genero=lectura.next().charAt(0);
		System.out.println("Dame mesa");
		mesa=lectura.nextInt();
		resp=miFiesta.altaMesero(nombre, genero, mesa);
		if(!resp)
			System.out.println("Alta NO exitosa");
		System.out.println(miFiesta.toString());
		resp=miFiesta.altaMesero("JUAN", 'M', 0);
		if(!resp)
			System.out.println("Alta no exitosa");
		System.out.println(miFiesta.toString());
		resp=miFiesta.bajaMesero("JUAN", 0);
		if(!resp)
			System.out.println("Baja NO exitosa");
		System.out.println(miFiesta.toString());
		

	}

}
