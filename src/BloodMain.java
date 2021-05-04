import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class BloodMain extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField bgroup;
	private JTextField address;
	private JTextField phone;
	private JTextField ref;
	private JTextField willing;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodMain frame = new BloodMain();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				}
		});
	}
 public BloodMain()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blood Donation");
		lblNewLabel.setBounds(444, 12, 238, 61);
		lblNewLabel.setForeground(new Color(250, 235, 215));
		lblNewLabel.setFont(new Font("Tibetan Machine Uni", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(40, 54, 971, 583);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("ADD DONOR", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblAddDonationPersonal = new JLabel("ADD DONATION PERSONAL INFORMATION");
		lblAddDonationPersonal.setForeground(new Color(25, 25, 112));
		lblAddDonationPersonal.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAddDonationPersonal.setBounds(22, 40, 541, 50);
		panel.add(lblAddDonationPersonal);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Dialog", Font.BOLD, 18));
		lblName.setBounds(39, 102, 138, 43);
		panel.add(lblName);
		
		name = new JTextField();
		name.setBounds(232, 109, 261, 32);
		panel.add(name);
		name.setColumns(10);
		
		bgroup = new JTextField();
		bgroup.setColumns(10);
		bgroup.setBounds(232, 165, 261, 32);
		panel.add(bgroup);
		
		JLabel label = new JLabel("BLOOD GROUP");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setBounds(39, 157, 163, 43);
		panel.add(label);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(232, 219, 261, 32);
		panel.add(address);
		
		JLabel label_1 = new JLabel("ADDRESS");
		label_1.setFont(new Font("Dialog", Font.BOLD, 18));
		label_1.setBounds(39, 212, 138, 43);
		panel.add(label_1);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(232, 274, 261, 32);
		panel.add(phone);
		
		JLabel label_2 = new JLabel("PHONE");
		label_2.setFont(new Font("Dialog", Font.BOLD, 18));
		label_2.setBounds(39, 267, 138, 43);
		panel.add(label_2);
		
		ref = new JTextField();
		ref.setColumns(10);
		ref.setBounds(232, 325, 261, 32);
		panel.add(ref);
		
		JLabel label_3 = new JLabel("REFREENCE");
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		label_3.setBounds(39, 318, 138, 43);
		panel.add(label_3);
		
		willing = new JTextField();
		willing.setBackground(new Color(255, 255, 255));
		willing.setColumns(10);
		willing.setBounds(232, 381, 261, 32);
		panel.add(willing);
		
		JLabel label_4 = new JLabel("WILLING");
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		label_4.setBounds(39, 373, 138, 43);
		panel.add(label_4);
		
		JButton ADD_BLOOD_DONOR = new JButton("ADD DONATION DETAILS");
		ADD_BLOOD_DONOR.setForeground(new Color(255, 255, 255));
		ADD_BLOOD_DONOR.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ADD_BLOOD_DONOR.setBackground(new Color(165, 42, 42));
		//ADD_BLOOD_DONOR.addActionListener(this);
		ADD_BLOOD_DONOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String str;
				if(e.getSource() == ADD_BLOOD_DONOR )
				{
					//JOptionPane.showMessageDialog(null, "Enter Doner Details");
					try
					{
					File fp = new File("blood12.txt");
					FileWriter fwr = new FileWriter(fp,true);
					str = "Name :-"+name.getText()+"\t     \t Blood Grup :-"+bgroup.getText()+"\t Address :-"+address.getText()+"\t Phone no :-"+phone.getText()+"\t Referance :-"+ref.getText()+"\t Willing :-"+willing.getText()+"\n";
					fwr.write(str);
					System.out.println(str);
					JOptionPane.showMessageDialog(null, "Data Copy SuccessFully");
					fwr.close();
					//frame.dispose();
					}
					catch(Exception ex)
					{
						
					}
					
				}
				
				
				
			}
		});
		ADD_BLOOD_DONOR.setBounds(270, 463, 234, 43);
		panel.add(ADD_BLOOD_DONOR);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(112, 128, 144));
		comboBox.setBounds(459, 165, 34, 32);
		panel.add(comboBox);
			
	}
}