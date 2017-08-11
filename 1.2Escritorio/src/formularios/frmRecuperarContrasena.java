package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class frmRecuperarContrasena extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private String asunto;
	private String correo2;
	private JComboBox cboTipo;

	
 public static int NumeroAleatorio(){
		
		int num=0;
	Random rnd = new Random();
	for(int i = 1; i<=99999; i++){
	num=(int)Math.round(Math.random()*99999);
	
	return num;}
	
	return num;
	
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRecuperarContrasena frame = new frmRecuperarContrasena();
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
	public frmRecuperarContrasena() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(51, 153, 255)), "Envio de Codigo de Seguridad : ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 414, 103);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Ingrese Correo :");
		label.setBounds(10, 21, 118, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Tipo : ");
		label_1.setBounds(20, 43, 46, 14);
		panel.add(label_1);
		
		cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"gmail", "hotmail"}));
		cboTipo.setBounds(87, 40, 84, 20);
		panel.add(cboTipo);
		
		JLabel label_2 = new JLabel("Email :");
		label_2.setBounds(20, 68, 60, 14);
		panel.add(label_2);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(85, 71, 160, 20);
		panel.add(txtEmail);
		
		JButton btnEnviar = new JButton("Enviar ");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtEmail.getText().equals("")){
					getToolkit().beep();
					JOptionPane.showMessageDialog(null, "Ingrese un correo por favor.");
					
					return;
				}
   
        
           
              if(cboTipo.equals("Hotmail")){
                
    try {
    	
    	String correo1, pass, mensaje;
        correo1 = "jersin1969@gmail.com";
                     pass = "76504227";
      
            correo2 =txtEmail.getText();
    
            asunto = String.valueOf(NumeroAleatorio());
     
            mensaje = "Su codigo de seguridad es:\t"+ asunto;
            
    	
    	
        Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", correo1);
            props.setProperty("mail.smtp.auth", "true");


            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correo1));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correo2));
            message.setSubject(asunto);
            message.setText(mensaje);

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect(correo1, pass);
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
            getToolkit().beep();
     JOptionPane.showMessageDialog(null, "Codigo de Seguridad enviado, revisar su correo por favor.","Sistema Extasis",JOptionPane.INFORMATION_MESSAGE);
     txtEmail.setText("");
     return;
     
     
        }
        catch (Exception e)
        {
        	getToolkit().beep();
        	JOptionPane.showMessageDialog (null,"Correo invalido.");
            
        }// cerramos el try
                
              }  
              
              else {     
    try {
    	
    	String correo1, pass, mensaje;
        correo1 = "jersin1969@gmail.com";
                     pass = "76504227";
      
            correo2 =txtEmail.getText();
    
            asunto = String.valueOf(NumeroAleatorio());
     
            mensaje = "Su codigo de seguridad es:\t"+ asunto;
    	
    	
        Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", correo1);
            props.setProperty("mail.smtp.auth", "true");

           
            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correo1));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correo2));
            message.setSubject(asunto);
            message.setText(mensaje);

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect(correo1, pass);
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Codigo de Seguridad enviado, revisar su correo por favor.","Sistema Farmacia",JOptionPane.INFORMATION_MESSAGE);
            txtEmail.setText("");
            return;
        }
        catch (Exception e)
        {	getToolkit().beep();
        	JOptionPane.showMessageDialog (null,"Correo invalido.");
        }
				
				
              }
			}
		});
		btnEnviar.setBounds(271, 64, 89, 23);
		panel.add(btnEnviar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(51, 153, 255)), "Verificaci\u00F3n de codigo y Cambio de Contrase\u00F1a :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 125, 440, 155);
		contentPane.add(panel_1);
		
		JLabel label_3 = new JLabel("Codigo de Seguridad :");
		label_3.setBounds(10, 26, 115, 14);
		panel_1.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 23, 86, 20);
		panel_1.add(textField_1);
		
		JLabel label_4 = new JLabel("Usuario :");
		label_4.setBounds(10, 62, 79, 14);
		panel_1.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 59, 86, 20);
		panel_1.add(textField_2);
		
		JLabel label_5 = new JLabel("Contrase\u00F1a Nueva :");
		label_5.setBounds(10, 98, 115, 14);
		panel_1.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 95, 86, 20);
		panel_1.add(textField_3);
		
		JLabel label_6 = new JLabel("Confirmar Contrase\u00F1a :");
		label_6.setBounds(10, 130, 115, 14);
		panel_1.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(144, 127, 86, 20);
		panel_1.add(textField_4);
		
		JButton button_1 = new JButton("Cambiar ");
		button_1.setBounds(296, 58, 89, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Salir");
		button_2.setBounds(296, 104, 89, 23);
		panel_1.add(button_2);
	}
}
