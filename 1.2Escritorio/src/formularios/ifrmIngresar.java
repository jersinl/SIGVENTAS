package formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import datos.daoMarca;
import datos.daoTipoPrenda;
import entidades.entMarca;
import entidades.entTipoPrenda;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ifrmIngresar extends JInternalFrame {
	private JTable table;
	private JButton btnAgregarTallasY;
	private JComboBox cboMarca;
	private JComboBox cboTP;
	private JComboBox cboModelo;
	private JButton button;

	public ifrmIngresar() {
		setTitle("Ingreso de Mercaderia");
		setBounds(100, 100, 818, 467);
		getContentPane().setLayout(null);
		
		JLabel lblTipoDePrenda = new JLabel("Tipo de Prenda :");
		lblTipoDePrenda.setBounds(23, 50, 112, 14);
		getContentPane().add(lblTipoDePrenda);
		
		cboTP = new JComboBox();
		cboTP.setBounds(145, 47, 286, 20);
		getContentPane().add(cboTP);
		
		JLabel lblMarca = new JLabel("Marca :");
		lblMarca.setBounds(23, 94, 112, 14);
		getContentPane().add(lblMarca);
		
		cboMarca = new JComboBox();
		cboMarca.setBounds(145, 91, 235, 20);
		getContentPane().add(cboMarca);
		
		JLabel lblModelo = new JLabel("Modelo :");
		lblModelo.setBounds(441, 94, 112, 14);
		getContentPane().add(lblModelo);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(521, 91, 271, 20);
		getContentPane().add(cboModelo);
		
		button = new JButton("+");
		button.setBounds(390, 91, 41, 20);
		getContentPane().add(button);
		
		JLabel lblCantidad = new JLabel("Cantidad :");
		lblCantidad.setBounds(23, 153, 79, 14);
		getContentPane().add(lblCantidad);
		
		btnAgregarTallasY = new JButton("Agregar Tallas y colores");
		btnAgregarTallasY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAgregarTallasY.setBounds(145, 149, 235, 23);
		getContentPane().add(btnAgregarTallasY);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 215, 782, 141);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Prenda", "Marca", "Modelo", "Talla", "Color", "Cantidad"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(703, 392, 89, 23);
		getContentPane().add(btnGrabar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(585, 392, 89, 23);
		getContentPane().add(btnCancelar);

		llenarComboTipoPrenda();
		llenarComboMarcas();
	}
	
	private void llenarComboTipoPrenda(){
		try {
			DefaultComboBoxModel x = new DefaultComboBoxModel();
			cboTP.setModel(x);
			entTipoPrenda vacio = new entTipoPrenda();
			vacio.setIdTipoPrenda(0);
			vacio.setNombre("-- Seleccione un Tipo de Prenda --");
			x.addElement(vacio);			
			ArrayList<entTipoPrenda> lista = daoTipoPrenda.Instancia().ListarTiposPrenda();
			for(int i=0;i<lista.size();i++){
				x.addElement(lista.get(i));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(), 
						  	"Sistema de Ventas", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void llenarComboMarcas(){
		try {
			DefaultComboBoxModel x = new DefaultComboBoxModel();
			cboMarca.setModel(x);
			entMarca vacio = new entMarca();
			vacio.setIdMarca(0);
			vacio.setNombre("-- Seleccione un Marca --");
			x.addElement(vacio);			
			ArrayList<entMarca> lista = daoMarca.Instancia().ListarMarcas();
			for(int i=0;i<lista.size();i++){
				x.addElement(lista.get(i));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(), 
						  	"Sistema de Ventas", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
