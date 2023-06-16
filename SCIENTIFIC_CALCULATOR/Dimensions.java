import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Dimensions extends JFrame {

	private JPanel contentPane;
	private JTextField start;
	private JTextField end;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dimensions frame = new Dimensions();
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
	public Dimensions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 461);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox from = new JComboBox();
		from.setBounds(172, 87, 141, 36);
		from.setFont(new Font("Tahoma", Font.PLAIN, 20));
		from.setModel(new DefaultComboBoxModel(new String[] {"Kilometer", "Meter", "Decimeter", "Centimeter", "Millimeter"}));
		contentPane.add(from);
		
		JComboBox to = new JComboBox();
		to.setBounds(382, 87, 141, 36);
		to.setModel(new DefaultComboBoxModel(new String[] {"Kilometer", "Meter", "Decimeter", "Centimeter", "Millimeter"}));
		to.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(to);
		
		JButton seven = new JButton("7");
		seven.setBounds(23, 210, 57, 45);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+seven.getText();
				start.setText(set);
			}
		});
		seven.setForeground(new Color(0, 128, 128));
		seven.setBackground(SystemColor.inactiveCaptionBorder);
		seven.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(seven);
		
		JButton eight = new JButton("8");
		eight.setBounds(98, 210, 57, 45);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+eight.getText();
				start.setText(set);
			}
		});
		eight.setForeground(new Color(0, 128, 128));
		eight.setFont(new Font("Tahoma", Font.PLAIN, 24));
		eight.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(eight);
		
		JButton nine = new JButton("9");
		nine.setBounds(172, 210, 57, 45);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+nine.getText();
				start.setText(set);
			}
		});
		nine.setForeground(new Color(0, 128, 128));
		nine.setFont(new Font("Tahoma", Font.PLAIN, 24));
		nine.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(nine);
		
		JButton four = new JButton("4");
		four.setBounds(23, 279, 57, 45);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+four.getText();
				start.setText(set);
			}
		});
		four.setForeground(new Color(0, 128, 128));
		four.setFont(new Font("Tahoma", Font.PLAIN, 24));
		four.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(four);
		
		JButton five = new JButton("5");
		five.setBounds(98, 279, 57, 45);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+five.getText();
				start.setText(set);
			}
		});
		five.setForeground(new Color(0, 128, 128));
		five.setFont(new Font("Tahoma", Font.PLAIN, 24));
		five.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(five);
		
		JButton six = new JButton("6");
		six.setBounds(172, 279, 57, 45);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+six.getText();
				start.setText(set);
			}
		});
		six.setForeground(new Color(0, 128, 128));
		six.setFont(new Font("Tahoma", Font.PLAIN, 24));
		six.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(six);
		
		JButton one = new JButton("1");
		one.setBounds(23, 345, 57, 45);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+one.getText();
				start.setText(set);
			}
		});
		one.setForeground(new Color(0, 128, 128));
		one.setFont(new Font("Tahoma", Font.PLAIN, 24));
		one.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(one);
		
		JButton two = new JButton("2");
		two.setBounds(98, 345, 57, 45);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+two.getText();
				start.setText(set);
			}
		});
		two.setForeground(new Color(0, 128, 128));
		two.setFont(new Font("Tahoma", Font.PLAIN, 24));
		two.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(two);
		
		JButton three = new JButton("3");
		three.setBounds(172, 345, 57, 45);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+three.getText();
				start.setText(set);
			}
		});
		three.setForeground(new Color(0, 128, 128));
		three.setFont(new Font("Tahoma", Font.PLAIN, 24));
		three.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(three);
		
		JButton del = new JButton("<");
		del.setBounds(249, 210, 57, 45);
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String del=null;
				if(start.getText().length()>0) {
					StringBuilder sb=new StringBuilder(start.getText());
					sb.deleteCharAt(start.getText().length()-1);
					del=sb.toString();
					start.setText(del);
				}
			}
		});
		del.setForeground(new Color(0, 128, 128));
		del.setFont(new Font("Tahoma", Font.PLAIN, 24));
		del.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(del);
		
		JButton point = new JButton(".");
		point.setBounds(249, 279, 57, 45);
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+point.getText();
				start.setText(set);
			}
		});
		point.setForeground(new Color(0, 128, 128));
		point.setFont(new Font("Tahoma", Font.PLAIN, 24));
		point.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(point);
		
		JButton zero = new JButton("0");
		zero.setBounds(249, 345, 57, 45);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=start.getText()+zero.getText();
				start.setText(set);
			}
		});
		zero.setForeground(new Color(0, 128, 128));
		zero.setFont(new Font("Tahoma", Font.PLAIN, 24));
		zero.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(zero);
		
		start = new JTextField();
		start.setBounds(184, 147, 94, 28);
		start.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(start);
		start.setColumns(10);
		
		end = new JTextField();
		end.setBounds(399, 147, 94, 28);
		end.setFont(new Font("Tahoma", Font.PLAIN, 22));
		end.setColumns(10);
		contentPane.add(end);
		
		JButton equal = new JButton(">");
		equal.setBounds(318, 138, 57, 45);
		equal.setBorderPainted(false);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(from.getSelectedItem().equals("Kilometer")) {
					if(to.getSelectedItem().equals("Kilometer")) {
						double ans=Double.parseDouble(start.getText())*1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Meter")) {
						double ans=Double.parseDouble(start.getText())*1000;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Decimeter")) {
						double ans=Double.parseDouble(start.getText())*10000;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Centimeter")) {
						double ans=Double.parseDouble(start.getText())*100000;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Millimeter")) {
						double ans=Double.parseDouble(start.getText())*1000000;
						end.setText(String.valueOf(ans));
					}
				}
				else if(from.getSelectedItem().equals("Meter")) {
					if(to.getSelectedItem().equals("Meter")) {
						double ans=Double.parseDouble(start.getText())*1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Kilometer")) {
						double ans=Double.parseDouble(start.getText())*0.001;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Decimeter")) {
						double ans=Double.parseDouble(start.getText())*10;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Centimeter")) {
						double ans=Double.parseDouble(start.getText())*100;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Millimeter")) {
						double ans=Double.parseDouble(start.getText())*1000;
						end.setText(String.valueOf(ans));
					}
				}
				else if(from.getSelectedItem().equals("Decimeter")) {
					if(to.getSelectedItem().equals("Decimeter")) {
						double ans=Double.parseDouble(start.getText())*1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Kilometer")) {
						double ans=Double.parseDouble(start.getText())*0.0001;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Meter")) {
						double ans=Double.parseDouble(start.getText())*0.1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Centimeter")) {
						double ans=Double.parseDouble(start.getText())*10;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Millimeter")) {
						double ans=Double.parseDouble(start.getText())*100;
						end.setText(String.valueOf(ans));
					}
				}
				else if(from.getSelectedItem().equals("Centimeter")) {
					if(to.getSelectedItem().equals("Centimeter")) {
						double ans=Double.parseDouble(start.getText())*10;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Kilometer")) {
						double ans=Double.parseDouble(start.getText())*0.00001;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Meter")) {
						double ans=Double.parseDouble(start.getText())*0.01;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Decimeter")) {
						double ans=Double.parseDouble(start.getText())*0.1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Millimeter")) {
						double ans=Double.parseDouble(start.getText())*10;
						end.setText(String.valueOf(ans));
					}
				}
				else if(from.getSelectedItem().equals("Millimeter")) {
					if(to.getSelectedItem().equals("Millimeter")) {
						double ans=Double.parseDouble(start.getText())*1;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Kilometer")) {
						double ans=Double.parseDouble(start.getText())*0.000001;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Meter")) {
						double ans=Double.parseDouble(start.getText())*0.001;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Decimeter")) {
						double ans=Double.parseDouble(start.getText())*0.01;
						end.setText(String.valueOf(ans));
					}
					if(to.getSelectedItem().equals("Centimeter")) {
						double ans=Double.parseDouble(start.getText())*0.1;
						end.setText(String.valueOf(ans));
					}
				}
			}
		});
		equal.setForeground(SystemColor.inactiveCaptionBorder);
		equal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		equal.setBackground(new Color(0, 128, 128));
		contentPane.add(equal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 572, 28);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mode");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific Calci");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Scientific_calci.main(null);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmDimensionConvertor = new JMenuItem("Dimension Convertor");
		mntmDimensionConvertor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmDimensionConvertor);
		
		JMenuItem mntmCurrencyConvertor = new JMenuItem("Currency Convertor");
		mntmCurrencyConvertor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Currency.main(null);
			}
		});
		mntmCurrencyConvertor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmCurrencyConvertor);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Polynomial Equations");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Equations.main(null);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("Unit Convertor");
		lblNewLabel.setBounds(10, 39, 185, 35);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		
		JLabel lblNewLabel_1 = new JLabel("Length");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(60, 89, 72, 29);
		contentPane.add(lblNewLabel_1);
	}
}
