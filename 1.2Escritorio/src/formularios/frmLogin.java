package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Conexion;
import entidades.entEmpleado;
import negocios.negEmpleado;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtPassword;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(155, 65, 194, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(155, 107, 194, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setBounds(48, 68, 97, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(48, 110, 97, 14);
		contentPane.add(lblPassword);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					entEmpleado ux = negEmpleado.Instancia().VerificarAcceso(txtUsuario.getText(),txtPassword.getText());
					JOptionPane.showMessageDialog(null, "Bienvenido : "+ux.getIdPersona().getNombres()+ " "+ux.getIdPersona().getApellidos(), 
							"Login",JOptionPane.INFORMATION_MESSAGE);
					dispose();
					frmPrincipal frm = new frmPrincipal();
					frm.show();
					
				} catch (ArithmeticException e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), 
							"Login", JOptionPane.OK_OPTION);
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnIngresar.setBounds(83, 188, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(230, 188, 89, 23);
		contentPane.add(btnCancelar);
	}
}
