package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JpanelCenterEmpleadoPrincipal extends JPanel {
	JLabel jLabel = new JLabel("Empleado");
	JButton jButton, jButton2, jButton3;
	JPanel jPanel, jPanel2;
	private JTable jTable;
	private String[][] datos = { { "Nombre", "Apellido", "Documento de Identidad", "Cargo","Direccion","Edad","Telefono","Codigo"}, { "Nombre", "Apellido", "Documento de Identidad", "Cargo","Direccion","Edad","Telefono","Codigo" },
			{  "Nombre", "Apellido", "Documento de Identidad", "Cargo","Direccion","Edad","Telefono","Codigo" }, };

	private String[] cabezera = { "Nombre", "Apellido", "Documento de Identidad", "Cargo","Direccion","Edad","Telefono","Codigo"};
	ImageIcon imageIcon;
	Icon icon;

	public JpanelCenterEmpleadoPrincipal() {
		init();

	}

	private void init() {

		this.setLayout(new BorderLayout());
		jPanel = new JPanel();
		jPanel.setPreferredSize(new Dimension(0, 100));
		jPanel2 = new JPanel();
//		jPanel.setBackground(Color.green);
//		jPanel2.setBackground(Color.red);
		
		
		jPanel.setLayout(null);
		jLabel.setBounds(450, 0, 200, 20);
		
		
		jButton= new JButton("A�ADIR");
		jButton.setBounds(70, 20, 100, 50);
		jPanel.add(jLabel);
		jPanel.add(jButton);
		
		jButton2= new JButton("ELIMINAR");
		jButton2.setBounds(200, 20, 100, 50);
		jPanel.add(jButton2);
		
		
		jButton3= new JButton("MODIFICAR");
		jButton3.setBounds(330, 20, 100, 50);
		jPanel.add(jButton3);
		
		
		
		jTable = new JTable(datos, cabezera);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(900, 500));
		jPanel2.add(jScrollPane);

		this.add(jPanel, BorderLayout.NORTH);
		this.add(jPanel2, BorderLayout.CENTER);

	}

}
