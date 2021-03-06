package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import controller.ProyectoListener;



public class JFramePantallaPrincipal extends JFrame  {
	
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelCenterPantallarPrincipal jpanelCenter;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;
	
	public JFramePantallaPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelCenter = new JpanelCenterPantallarPrincipal();
		this.jpanelLeft =  new JpanelLeftPantallaPrincipal();
		this.jMeuBarPantallaPrincipal =  new JMeuBarPantallaPrincipal();
//		ProyectoListener.getInstancse().setJpanelStatusBar(jpanelLeft);
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
