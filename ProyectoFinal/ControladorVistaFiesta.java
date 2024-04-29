import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/*
 * Juan Manuel Ambriz Nu�ez 195554
 * 4/12/2020
 * Clase para dar funcionalidad a la clase vista fiesta
 */
public class ControladorVistaFiesta extends VistaFiesta{
	
	private Fiesta miFiesta;
	private JTextField matriz[][];
	private JTextField arreglo [];
	private final int MAXF=5;
	private final int MAXC=10;
	
public void creaMatriz() {
		
		matriz=new JTextField [MAXF][MAXC];
		matriz[0][0]=ctm00;matriz[0][1]=ctm01;matriz[0][2]=ctm02;matriz[0][3]=ctm03;matriz[0][4]=ctm04;
		matriz[0][5]=ctm05;matriz[0][6]=ctm06;matriz[0][7]=ctm07;matriz[0][8]=ctm08;matriz[0][9]=ctm09;
		
		matriz[1][0]=ctm10;matriz[1][1]=ctm11;matriz[1][2]=ctm12;matriz[1][3]=ctm13;matriz[1][4]=ctm14;
		matriz[1][5]=ctm15;matriz[1][6]=ctm16;matriz[1][7]=ctm17;matriz[1][8]=ctm18;matriz[1][9]=ctm19;
		
		matriz[2][0]=ctm20;matriz[2][1]=ctm21;matriz[2][2]=ctm22;matriz[2][3]=ctm23;matriz[2][4]=ctm24;
		matriz[2][5]=ctm25;matriz[2][6]=ctm26;matriz[2][7]=ctm27;matriz[2][8]=ctm28;matriz[2][9]=ctm29;
		
		matriz[3][0]=ctm30;matriz[3][1]=ctm31;matriz[3][2]=ctm32;matriz[3][3]=ctm33;matriz[3][4]=ctm34;
		matriz[3][5]=ctm35;matriz[3][6]=ctm36;matriz[3][7]=ctm37;matriz[3][8]=ctm38;matriz[3][9]=ctm39;
	
		matriz[4][0]=ctm40;matriz[4][1]=ctm41;matriz[4][2]=ctm42;matriz[4][3]=ctm43;matriz[4][4]=ctm44;
		matriz[4][5]=ctm45;matriz[4][6]=ctm46;matriz[4][7]=ctm47;matriz[4][8]=ctm48;matriz[4][9]=ctm49;
	}

public void creaArreglo() {
	
	arreglo= new JTextField [MAXF];
		arreglo[0]=ctMesero0; arreglo[1]=ctMesero1; arreglo[2]=ctMesero2; arreglo[3]=ctMesero3;arreglo[4]=ctMesero4;
}


public void muestraLugares() {
	int i, j; 
	for(i=0;i<MAXF;i++)
		for(j=0;j<MAXC;j++)
			matriz[i][j].setText(miFiesta.getElementMatriz(i, j));
}

public void muestraMeseros() {
	int i;
	
	for(i=0;i<MAXF;i++)
		arreglo[i].setText(miFiesta.getElementArreglo(i));
}

public void limpia() {
	ctNombre.setText("");
	ctEdad.setText("");
	ctMesa.setText("");
	ctGenero.setText("");
}

public class EscuchaAltaMesero implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int mesa;
		char genero;
		String nombre, smesa;
		boolean resp;
		
	
		
		if(ctNombre.getText().equals("")) {
			info.setText("Inserta: nombre, genero, mesa");
			
		}
		else {
			nombre=ctNombre.getText();
			genero=ctGenero.getText().charAt(0);
			smesa=ctMesa.getText();
			mesa=Integer.parseInt(smesa);
			resp=miFiesta.altaMesero(nombre, genero, mesa);
				if(!resp)
					info.setText("Alta NO Exitosa");
				else
					info.setText("Alta Exitosa");
				muestraMeseros();
				limpia();	
		}
	}
}

public class EscuchaBajaMesero implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nombre, smesa;
		int mesa;
		boolean resp;
		
		if(ctNombre.getText().equals("")) {
			info.setText("Inserta: nombre y mesa");
			
		}
		else {
			nombre=ctNombre.getText();
			smesa=ctMesa.getText();
			mesa=Integer.parseInt(smesa);
			resp=miFiesta.bajaMesero(nombre, mesa);
				if(!resp)
					info.setText("Baja NO Exitosa");
				else
					info.setText("Baja Exitosa");
				muestraMeseros();
				limpia();	
		}
		
	}
	
}

public class EscuchaAsiento implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre, sEdad;
		int edad;
		int resp[];
		resp=new int [2];
		
		if(ctNombre.getText().equals("")) {
			info.setText("Inserta: nombre y edad;");
			
		}
		else {
			nombre=ctNombre.getText();
			sEdad=ctEdad.getText();
			edad=Integer.parseInt(sEdad);
			resp=miFiesta.encuentraAsiento(nombre, edad);
				if(resp[0]!=-1)
					info.setText("Mesa "+resp[0]+" Asiento "+resp[1]);
				else
					info.setText("NO en Lista");
				muestraLugares();
				limpia();	
		}
		
	}
	
}

public class EscuchaLimpiar implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		miFiesta.retiraNoLlegaron();
		muestraLugares();
		limpia();
	}
	
}

public class EscuchaTotal implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int resp;
		
		resp=miFiesta.inidcaTotalInvitados();
		info.setText("Total Invitados "+resp);
		muestraLugares();
		limpia();
	}
	
}

public class EscuchaMayorMesa implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String sMesa, resp;
		int mesa;
		
		if(ctMesa.getText().equals("")) {
			info.setText("Inserta: mesa");
			
		}
		else {
			sMesa=ctMesa.getText();
			mesa=Integer.parseInt(sMesa);
			resp=miFiesta.indicaMayorPorMesa(mesa);
				if(resp!=null)
					info.setText(/*"Mayor de la mesa "+mesa+" es: "+*/resp);
				else
					info.setText("ERROR");
				limpia();	
		}
		
		
	}
	
}

public void leeArchivo() {
	File miArchivo;
	Scanner lectura;
	int n, i, edad;
	char edoCivil;
	String nombre;
	boolean resp;
	
	miArchivo=new File("Invitados.txt");
	try {
		lectura=new Scanner(miArchivo);
		n=lectura.nextInt();
		for(i=1;i<=n;i++) {
			nombre=lectura.next();
			edad=lectura.nextInt();
			edoCivil=lectura.next().charAt(0);
			resp=miFiesta.altaInvitado(nombre, edad, edoCivil);
			if(!resp)
				info.setText("ERROR");
		}
		muestraLugares();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
}

public ControladorVistaFiesta() {
	super();
	miFiesta=new Fiesta("Cumplea�os de Maria", "Calle 1");
	creaMatriz();
	creaArreglo();
	leeArchivo();
	btAltaMesero.addActionListener(new EscuchaAltaMesero());
	btBajaMesero.addActionListener(new EscuchaBajaMesero());
	btAsiento.addActionListener(new EscuchaAsiento());
	btLimpiar.addActionListener(new EscuchaLimpiar());
	btTotal.addActionListener(new EscuchaTotal());
	btMayorMesa.addActionListener(new EscuchaMayorMesa());
}

}
