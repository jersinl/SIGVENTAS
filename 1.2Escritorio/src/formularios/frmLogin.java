package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Conexion;
import datos.daoEmpleado;
import entidades.entEmpleado;
import negocios.negEmpleado;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setResizable(false);
		setTitle("Sistema de Ventas Fashon Like");
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmLogin.class.getResource("/imagenes/iconoLogin.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 406, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setEnabled(true);
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(28, 102, 106, 28);
		contentPane.add(txtUsuario);
		
		txtPassword = new JPasswordField();
		txtPassword.setEnabled(true);
		txtPassword.setBounds(221, 102, 116, 28);
		contentPane.add(txtPassword);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtUsuario.getText().equals("")){
					getToolkit().beep();
					JOptionPane.showMessageDialog(null,"Ingrese un nombre de usuario por favor" , "Sistema Ventas",JOptionPane.OK_OPTION);
							return;
						}
						
						if (txtPassword.getText().equals("")){
							getToolkit().beep();
							JOptionPane.showMessageDialog(null,"Ingrese una contraseña por favor" , "Sistema Ventas",JOptionPane.OK_OPTION);
							return;
							
						}
						
						
						try{					
//							
				
							entEmpleado ux = negEmpleado.Instancia().VerificarAcceso(txtUsuario.getText(),txtPassword.getText());
							JOptionPane.showMessageDialog(null, "Bienvenido : "+ux.getIdPersona().getNombres()+ " "+ux.getIdPersona().getApellidos(), 
									"Login",JOptionPane.INFORMATION_MESSAGE);
							dispose();
							frmPrincipal frm = new frmPrincipal();
							frm.show();
								
			
						}
							catch(Exception e){
							getToolkit().beep();
							JOptionPane.showMessageDialog(null, 
									e.getMessage(),
									"Sistema Ventas",
									JOptionPane.ERROR_MESSAGE);						
						}	
				
						
			}
		});
		btnIngresar.setEnabled(true);
		btnIngresar.setBounds(28, 149, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				getToolkit().beep();
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema.","Sistema de Ventas",JOptionPane.CLOSED_OPTION);	
				
				dispose();
			}
		});
		btnSalir.setEnabled(true);
		btnSalir.setBounds(127, 149, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblCambiarContrasena = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrasena.setForeground(SystemColor.textHighlight);
		lblCambiarContrasena.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblCambiarContrasena.setBounds(252, 150, 146, 20);
		contentPane.add(lblCambiarContrasena);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(frmLogin.class.getResource("/imagenes/for.jpg")));
		label.setBounds(0, 0, 430, 201);
		contentPane.add(label);
		
	}
}
