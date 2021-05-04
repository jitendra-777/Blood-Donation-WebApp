import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	protected javax.swing.JFrame frmLOGIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setBackground(new Color(72, 209, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setForeground(new Color(245, 222, 179));
		lblUserName.setBackground(new Color(95, 158, 160));
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUserName.setBounds(48, 55, 108, 37);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(245, 222, 179));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBackground(new Color(255, 140, 0));
		lblPassword.setBounds(48, 103, 108, 37);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(190, 60, 169, 28);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(190, 108, 169, 28);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String user= username.getText();
			String pass=password.getText();
			if(user.contains("jitendra")&&pass.contains("1234"))
			{
				username.setText(null);
				password.setText(null);
				BloodMain info=new BloodMain();
				BloodMain.main(null);
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"INVALID LOGIN DETAILS","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
				
			}
			}
		
		});
	
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setBounds(48, 174, 77, 28);
		contentPane.add(btnLogin);
		
		JButton btnClose = new JButton("EXIT");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLOGIN=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLOGIN, "CONFIRM IF YOU WANT TO EXIT ","LOGIN",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
				System.exit(0);		
			}
		});
		
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnClose.setBackground(new Color(0, 0, 128));
		btnClose.setBounds(332, 174, 77, 28);
		contentPane.add(btnClose);
		
		JButton btnRe = new JButton("RESET");
		btnRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
			}
		});
		btnRe.setBackground(new Color(0, 0, 128));
		btnRe.setForeground(new Color(255, 255, 255));
		btnRe.setBounds(192, 174, 71, 28);
		contentPane.add(btnRe);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 161, 414, 2);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(48, 42, -15, 109);
		contentPane.add(separator_2);
		
		JLabel lblLogin = new JLabel("LOGIN ");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLogin.setBounds(205, 21, 77, 20);
		contentPane.add(lblLogin);
	}

	protected Object JFrame(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
