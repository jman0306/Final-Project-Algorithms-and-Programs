import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
/*
 * Juan Manuel Ambriz Nu�ez 195554
 * 25/11/2020
 * Clase para poner los elementos visuales en una ventana 
 */
public class VistaFiesta extends JFrame {
	
	protected JLabel etNombre, etEdad, etMesa, etVacia, etGenero ,Mesa0, Mesa1, Mesa2, Mesa3, Mesa4, et0, et1, et2, et3, et4, et5, et6, et7, et8, et9, etMeseros;
	protected JTextField ctNombre, ctEdad, ctMesa, ctGenero, ctMesero0, ctMesero1, ctMesero2, ctMesero3, ctMesero4;
	protected JTextField ctm00, ctm01, ctm02, ctm03, ctm04, ctm05, ctm06, ctm07, ctm08, ctm09;
	protected JTextField ctm10, ctm11, ctm12, ctm13, ctm14, ctm15, ctm16, ctm17, ctm18, ctm19;
	protected JTextField ctm20, ctm21, ctm22, ctm23, ctm24, ctm25, ctm26, ctm27, ctm28, ctm29;
	protected JTextField ctm30, ctm31, ctm32, ctm33, ctm34, ctm35, ctm36, ctm37, ctm38, ctm39;
	protected JTextField ctm40, ctm41, ctm42, ctm43, ctm44, ctm45, ctm46, ctm47, ctm48, ctm49;
	protected JTextArea info;
	protected JButton btAsiento, btMayorMesa, btAltaMesero, btBajaMesero, btTotal, btLimpiar;
	protected JPanel miPanel;
	protected Border miBorde;
	
	
	public VistaFiesta(){
		super("Fiesta de Maria");
		miPanel=new JPanel(new GridLayout(12,11));
		miBorde=BorderFactory.createEmptyBorder(20, 20, 20, 20);
		miPanel.setBorder(miBorde);
		
		//Primer renglon 
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etNombre=new JLabel("NOMBRE");
		miPanel.add(etNombre);
		etEdad=new JLabel("EDAD");
		miPanel.add(etEdad);
		etGenero=new JLabel("GENERO");
		miPanel.add(etGenero);
		etMesa=new JLabel("MESA");
		miPanel.add(etMesa);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		btAltaMesero=new JButton("ALTA MESERO");
		miPanel.add(btAltaMesero);
		btLimpiar=new JButton("LIMPIAR");
		miPanel.add(btLimpiar);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		info=new JTextArea();
		miPanel.add(info);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		
		
		
		//Segundo renglon
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		ctNombre=new JTextField(10);
		miPanel.add(ctNombre);
		ctEdad=new JTextField(10);
		miPanel.add(ctEdad);
		ctGenero=new JTextField(10);
		miPanel.add(ctGenero);
		ctMesa=new JTextField(10);
		miPanel.add(ctMesa);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		btBajaMesero=new JButton("BAJA MESERO");
		miPanel.add(btBajaMesero);
		btTotal=new JButton("TOTAL");
		miPanel.add(btTotal);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		
		
		
		//Tercer renglon
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		btAsiento=new JButton("ASIENTO");
		miPanel.add(btAsiento);
		btMayorMesa=new JButton("MAYOR MESA");
		miPanel.add(btMayorMesa);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		//cuarto renglon
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		
		//quinto renglon
		etMeseros=new JLabel("MESEROS");
		miPanel.add(etMeseros);
		ctMesero0=new JTextField(10);
		miPanel.add(ctMesero0);
		ctMesero1=new JTextField(10);
		miPanel.add(ctMesero1);
		ctMesero2=new JTextField(10);
		miPanel.add(ctMesero2);
		ctMesero3=new JTextField(10);
		miPanel.add(ctMesero3);
		ctMesero4=new JTextField(10);
		miPanel.add(ctMesero4);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		
		//Sexto renglon 
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		
		
		//Septimo renglon
		etVacia=new JLabel(" ");
		miPanel.add(etVacia);
		et0=new JLabel("    LUGAR 0");
		miPanel.add(et0);
		et1=new JLabel("    LUGAR 1");
		miPanel.add(et1);
		et2=new JLabel("    LUGAR 2");
		miPanel.add(et2);
		et3=new JLabel("    LUGAR 3");
		miPanel.add(et3);
		et4=new JLabel("    LUGAR 4");
		miPanel.add(et4);
		et5=new JLabel("    LUGAR 5");
		miPanel.add(et5);
		et6=new JLabel("    LUGAR 6");
		miPanel.add(et6);
		et7=new JLabel("    LUGAR 7");
		miPanel.add(et7);
		et8=new JLabel("    LUGAR 8");
		miPanel.add(et8);
		et9=new JLabel("    LUGAR 9");
		miPanel.add(et9);

		
	
		//matriz 
		//0
		Mesa0=new JLabel("MESA 0");
		miPanel.add(Mesa0);
		ctm00=new JTextField(10);
		miPanel.add(ctm00);
		ctm01=new JTextField(10);
		miPanel.add(ctm01);
		ctm02=new JTextField(10);
		miPanel.add(ctm02);
		ctm03=new JTextField(10);
		miPanel.add(ctm03);
		ctm04=new JTextField(10);
		miPanel.add(ctm04);
		ctm05=new JTextField(10);
		miPanel.add(ctm05);
		ctm06=new JTextField(10);
		miPanel.add(ctm06);
		ctm07=new JTextField(10);
		miPanel.add(ctm07);
		ctm08=new JTextField(10);
		miPanel.add(ctm08);
		ctm09=new JTextField(10);
		miPanel.add(ctm09);
		
		//1
		Mesa1=new JLabel("MESA 1");
		miPanel.add(Mesa1);
		ctm10=new JTextField(10);
		miPanel.add(ctm10);
		ctm11=new JTextField(10);
		miPanel.add(ctm11);
		ctm12=new JTextField(10);
		miPanel.add(ctm12);
		ctm13=new JTextField(10);
		miPanel.add(ctm13);
		ctm14=new JTextField(10);
		miPanel.add(ctm14);
		ctm15=new JTextField(10);
		miPanel.add(ctm15);
		ctm16=new JTextField(10);
		miPanel.add(ctm16);
		ctm17=new JTextField(10);
		miPanel.add(ctm17);
		ctm18=new JTextField(10);
		miPanel.add(ctm18);
		ctm19=new JTextField(10);
		miPanel.add(ctm19);
		
		//2
		Mesa2=new JLabel("MESA 2");
		miPanel.add(Mesa2);
		ctm20=new JTextField(10);
		miPanel.add(ctm20);
		ctm21=new JTextField(10);
		miPanel.add(ctm21);
		ctm22=new JTextField(10);
		miPanel.add(ctm22);
		ctm23=new JTextField(10);
		miPanel.add(ctm23);
		ctm24=new JTextField(10);
		miPanel.add(ctm24);
		ctm25=new JTextField(10);
		miPanel.add(ctm25);
		ctm26=new JTextField(10);
		miPanel.add(ctm26);
		ctm27=new JTextField(10);
		miPanel.add(ctm27);
		ctm28=new JTextField(10);
		miPanel.add(ctm28);
		ctm29=new JTextField(10);
		miPanel.add(ctm29);
		
		//3
		Mesa3=new JLabel("MESA 3");
		miPanel.add(Mesa3);
		ctm30=new JTextField(10);
		miPanel.add(ctm30);
		ctm31=new JTextField(10);
		miPanel.add(ctm31);
		ctm32=new JTextField(10);
		miPanel.add(ctm32);
		ctm33=new JTextField(10);
		miPanel.add(ctm33);
		ctm34=new JTextField(10);
		miPanel.add(ctm34);
		ctm35=new JTextField(10);
		miPanel.add(ctm35);
		ctm36=new JTextField(10);
		miPanel.add(ctm36);
		ctm37=new JTextField(10);
		miPanel.add(ctm37);
		ctm38=new JTextField(10);
		miPanel.add(ctm38);
		ctm39=new JTextField(10);
		miPanel.add(ctm39);
		
		//4
		Mesa4=new JLabel("MESA 4");
		miPanel.add(Mesa4);
		ctm40=new JTextField(10);
		miPanel.add(ctm40);
		ctm41=new JTextField(10);
		miPanel.add(ctm41);
		ctm42=new JTextField(10);
		miPanel.add(ctm42);
		ctm43=new JTextField(10);
		miPanel.add(ctm43);
		ctm44=new JTextField(10);
		miPanel.add(ctm44);
		ctm45=new JTextField(10);
		miPanel.add(ctm45);
		ctm46=new JTextField(10);
		miPanel.add(ctm46);
		ctm47=new JTextField(10);
		miPanel.add(ctm47);
		ctm48=new JTextField(10);
		miPanel.add(ctm48);
		ctm49=new JTextField(10);
		miPanel.add(ctm49);
		
		super.setContentPane(miPanel);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);//SIEMPRE al terminar
	}
}
