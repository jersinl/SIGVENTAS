package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.entEmpleado;
import metodosComunes.ImagenFondo;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.MenuBar;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane jdpContenedor;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmPrincipal.class.getResource("/imagenes/categoria.jpg")));
		setTitle("SIG VENTAS  - EXTASIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 544);
		
		
	
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/registrar.jpg")));
		mnInicio.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnInicio);
		
		JMenuItem mntmquienesSomos = new JMenuItem("\u00BFQuienes Somos?");
		mntmquienesSomos.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnInicio.add(mntmquienesSomos);
		
		JSeparator separator = new JSeparator();
		mnInicio.add(separator);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmCerrarSesin.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnInicio.add(mntmCerrarSesin);
		
		JMenu mnSeguridad = new JMenu("Seguridad");
		mnSeguridad.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/seguridadicono.png")));
		mnSeguridad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnSeguridad);
		
		JMenuItem mntmEmpleado = new JMenuItem("Empleado");
		mntmEmpleado.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnSeguridad.add(mntmEmpleado);
		
		JSeparator separator_1 = new JSeparator();
		mnSeguridad.add(separator_1);
		
		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de Baja Empleado");
		mntmDarDeBaja.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnSeguridad.add(mntmDarDeBaja);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/reporte1.png")));
		mnReportes.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnReportes);
		
		JMenuItem mntmProducto = new JMenuItem("Producto");
		mntmProducto.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmProducto);
		
		JSeparator separator_2 = new JSeparator();
		mnReportes.add(separator_2);
		
		JMenuItem mntmVentasXFecha = new JMenuItem("Ventas x Fecha");
		mntmVentasXFecha.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmVentasXFecha);
		
		JSeparator separator_3 = new JSeparator();
		mnReportes.add(separator_3);
		
		JMenuItem mntmVentasXEmpleado = new JMenuItem("Ventas x Empleado");
		mntmVentasXEmpleado.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmVentasXEmpleado);
		
		JSeparator separator_4 = new JSeparator();
		mnReportes.add(separator_4);
		
		JMenuItem mntmVentasXSucursal = new JMenuItem("Ventas x Sucursal");
		mntmVentasXSucursal.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmVentasXSucursal);
		
		JSeparator separator_5 = new JSeparator();
		mnReportes.add(separator_5);
		
		JMenuItem mntmProductoXSucursal = new JMenuItem("Producto x Sucursal");
		mntmProductoXSucursal.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmProductoXSucursal);
		
		JSeparator separator_6 = new JSeparator();
		mnReportes.add(separator_6);
		
		JMenuItem mntmVentasDelDia = new JMenuItem("Ventas del dia");
		mntmVentasDelDia.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnReportes.add(mntmVentasDelDia);
		
		JMenu mnIngreso = new JMenu("Ingreso");
		mnIngreso.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/compra.png")));
		mnIngreso.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnIngreso);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnIngreso.add(mntmCategoria);
		
		JSeparator separator_7 = new JSeparator();
		mnIngreso.add(separator_7);
		
		JMenuItem mntmProducto_1 = new JMenuItem("Producto");
		mntmProducto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame frm = new ifrmIngresar();
				jdpContenedor.add(frm);
				frm.setVisible(true);
				
			}
		});
		mntmProducto_1.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnIngreso.add(mntmProducto_1);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/Venta.png")));
		mnVentas.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnVentas);
		
		JMenuItem mntmRealizarUnaVenta = new JMenuItem("Realizar una Venta");
		mntmRealizarUnaVenta.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnVentas.add(mntmRealizarUnaVenta);
		
		JSeparator separator_8 = new JSeparator();
		mnVentas.add(separator_8);
		
		JMenuItem mntmCambiarPrenda = new JMenuItem("Cambiar Prenda");
		mntmCambiarPrenda.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnVentas.add(mntmCambiarPrenda);
		
		JMenu mnBusqueda = new JMenu("Busqueda");
		mnBusqueda.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/bucar.png")));
		mnBusqueda.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnBusqueda);
		
		JMenuItem mntmPorProducto = new JMenuItem("Por Producto");
		mntmPorProducto.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnBusqueda.add(mntmPorProducto);
		
		JSeparator separator_9 = new JSeparator();
		mnBusqueda.add(separator_9);
		
		JMenuItem mntmProductoXSucursal_1 = new JMenuItem("Producto x Sucursal");
		mntmProductoXSucursal_1.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnBusqueda.add(mntmProductoXSucursal_1);
		
		JMenu mnPrestamos = new JMenu("Prestamos");
		mnPrestamos.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/ico_contrato.png")));
		mnPrestamos.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnPrestamos);
		
		JMenuItem mntmRealizarPrestamoA = new JMenuItem("Realizar prestamo a Sucursal");
		mntmRealizarPrestamoA.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnPrestamos.add(mntmRealizarPrestamoA);
		
		JSeparator separator_10 = new JSeparator();
		mnPrestamos.add(separator_10);
		
		JMenuItem mntmDevolucinDelPrestamo = new JMenuItem("Devoluci\u00F3n del prestamo ");
		mntmDevolucinDelPrestamo.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnPrestamos.add(mntmDevolucinDelPrestamo);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setIcon(new ImageIcon(frmPrincipal.class.getResource("/imagenes/caetgorias.png")));
		mnAyuda.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnAyuda);
		
		JMenuItem mntmContctanos = new JMenuItem("Cont\u00E1ctanos");
		mntmContctanos.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnAyuda.add(mntmContctanos);
		
		JSeparator separator_11 = new JSeparator();
		mnAyuda.add(separator_11);
		
		JMenuItem mntmManualDeUsuario = new JMenuItem("Manual de Usuario");
		mntmManualDeUsuario.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnAyuda.add(mntmManualDeUsuario);
		
		JSeparator separator_12 = new JSeparator();
		mnAyuda.add(separator_12);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca De");
		mntmAcercaDe.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		mnAyuda.add(mntmAcercaDe);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jdpContenedor = new JDesktopPane();
		jdpContenedor.setBackground(new Color(102, 153, 255));
		jdpContenedor.setBounds(0, 0, 1362, 657);

		contentPane.add(jdpContenedor, BorderLayout.CENTER);
		jdpContenedor.setBorder(new ImagenFondo());
		this.setExtendedState(MAXIMIZED_BOTH);
	}
}
