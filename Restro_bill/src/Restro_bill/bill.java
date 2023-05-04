package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 678, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Bill ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(266, 34, 180, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(76, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(76, 152, 80, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Pizza 150", "Burger 80", "ChickenBiryani 200", "Mutton mandi 300"}));
		c1.setBounds(194, 102, 124, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(194, 154, 124, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String item=(String) c1.getSelectedItem();
				String Quantity= t1.getText();
				int q=Integer.parseInt(Quantity);
				int bill=0;
			
				if(item.equals("Pizza 150"))
				{
					bill=q*150;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("Burger 80"))
		{
			bill=q*80;
			JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
		}
		else if(item.equals("ChickenBiryani 200"))
		{
			bill=q*200;
			JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
		}
		else if(item.equals("Mutton mandi 300"))
		{
			bill=q*300;
			JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
		}
				}
					
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(124, 217, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
