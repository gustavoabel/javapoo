import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Cadastro {

	private JFrame frame;
	private JTextField jTxtNome;
	private JTextField jTxtEmail;
	private JTextField jTxtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 317, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 57, 14);
		frame.getContentPane().add(lblNewLabel);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(57, 8, 231, 20);
		frame.getContentPane().add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 46, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		jTxtEmail = new JTextField();
		jTxtEmail.setBounds(57, 43, 231, 20);
		frame.getContentPane().add(jTxtEmail);
		jTxtEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtNome.getText());
				cliente.setEmail(jTxtEmail.getText());
				cliente.setIdade(Integer.parseInt(jTxtIdade.getText()));
				JOptionPane.showMessageDialog(null, cliente.salvar());
				jTxtNome.setText("");
				jTxtEmail.setText("");
				jTxtIdade.setText("");
			}
		});
		btnCadastrar.setBounds(162, 99, 126, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 79, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		jTxtIdade = new JTextField();
		jTxtIdade.setBounds(57, 76, 231, 20);
		frame.getContentPane().add(jTxtIdade);
		jTxtIdade.setColumns(10);
	}
}
