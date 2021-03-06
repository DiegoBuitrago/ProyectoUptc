package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;



public class JFrameEmpleadoPrincipal extends JFrame {
	
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelCenterEmpleadoPrincipal jpanelCenter;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;

	
	public JFrameEmpleadoPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelCenter = new JpanelCenterEmpleadoPrincipal();
		this.jpanelLeft =  new JpanelLeftPantallaPrincipal();
		this.jMeuBarPantallaPrincipal =  new JMeuBarPantallaPrincipal();

		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setJMenuBar(jMeuBarPantallaPrincipal);
		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(jpanelCenter, BorderLayout.CENTER);
		this.add(jpanelLeft, BorderLayout.WEST);


		
		
		
		this.setVisible(true);
	}

}
