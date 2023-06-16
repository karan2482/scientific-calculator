import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Currency extends JFrame {

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
					Currency frame = new Currency();
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
	public Currency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 470);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		contentPane.setDoubleBuffered(false);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox from = new JComboBox();
		from.setBounds(172, 87, 141, 36);
		from.setFont(new Font("Tahoma", Font.PLAIN, 20));
		from.setModel(new DefaultComboBoxModel(new String[] {"US Dollar", "Indian Rupee", "Japanese Yen", "Bangladesh Taka", "Euro"}));
		contentPane.add(from);
		
		JComboBox to = new JComboBox();
		to.setBounds(381, 87, 141, 36);
		to.setModel(new DefaultComboBoxModel(new String[] {"US Dollar", "Indian Rupee", "Japanese Yen", "Bangladesh Taka", "Euro"}));
		to.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(to);
		
		JButton seven = new JButton("7");
		seven.setBounds(23, 215, 57, 45);
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
		eight.setBounds(98, 215, 57, 45);
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
		nine.setBounds(172, 215, 57, 45);
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
		four.setBounds(23, 289, 57, 45);
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
		five.setBounds(98, 289, 57, 45);
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
		six.setBounds(172, 289, 57, 45);
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
		one.setBounds(23, 358, 57, 45);
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
		two.setBounds(98, 358, 57, 45);
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
		three.setBounds(172, 358, 57, 45);
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
		del.setBounds(249, 215, 57, 45);
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
		point.setBounds(249, 289, 57, 45);
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
		zero.setBounds(249, 358, 57, 45);
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
		start.setBounds(185, 151, 94, 28);
		start.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(start);
		start.setColumns(10);
		
		end = new JTextField();
		end.setBounds(397, 151, 94, 28);
		end.setFont(new Font("Tahoma", Font.PLAIN, 22));
		end.setColumns(10);
		contentPane.add(end);
		
		JButton equal = new JButton(">");
		equal.setBounds(317, 142, 57, 45);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(from.getSelectedItem().equals("US Dollar")) {
					if(to.getSelectedItem().equals("US Dollar")) {
						double ans=Double.parseDouble(start.getText())*1;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Indian Rupee")) {
						double ans=Double.parseDouble(start.getText())*82.7906;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Japanese Yen")) {
						double ans=Double.parseDouble(start.getText())*150.4999;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Bangladesh Taka")) {
						double ans=Double.parseDouble(start.getText())*101.597;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Euro")) {
						double ans=Double.parseDouble(start.getText())*1.0236;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
				}
				else if(from.getSelectedItem().equals("Indian Rupee")) {
					if(to.getSelectedItem().equals("Indian Rupee")) {
						double ans=Double.parseDouble(start.getText())*1;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("US Dollar")) {
						double ans=Double.parseDouble(start.getText())*0.012;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Japanese Yen")) {
						double ans=Double.parseDouble(start.getText())*1.8178;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Bangladesh Taka")) {
						double ans=Double.parseDouble(start.getText())*1.2271;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Euro")) {
						double ans=Double.parseDouble(start.getText())*0.0123;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
				}
				else if(from.getSelectedItem().equals("Japanese Yen")) {
					if(to.getSelectedItem().equals("Japanese Yen")) {
						double ans=Double.parseDouble(start.getText())*1;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("US Dollar")) {
						double ans=Double.parseDouble(start.getText())*0.0066;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Indian Rupee")) {
						double ans=Double.parseDouble(start.getText())*0.5501;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Bangladesh Taka")) {
						double ans=Double.parseDouble(start.getText())*0.675;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Euro")) {
						double ans=Double.parseDouble(start.getText())*0.0068;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
				}
				else if(from.getSelectedItem().equals("Bangladesh Taka")) {
					if(to.getSelectedItem().equals("Bangladesh Taka")) {
						double ans=Double.parseDouble(start.getText())*1;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("US Dollar")) {
						double ans=Double.parseDouble(start.getText())*0.0098;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Indian Rupee")) {
						double ans=Double.parseDouble(start.getText())*0.8148;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Japanese Yen")) {
						double ans=Double.parseDouble(start.getText())*1.4813;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Euro")) {
						double ans=Double.parseDouble(start.getText())*0.0100;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
				}
				else if(from.getSelectedItem().equals("Euro")) {
					if(to.getSelectedItem().equals("Euro")) {
						double ans=Double.parseDouble(start.getText())*1;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("US Dollar")) {
						double ans=Double.parseDouble(start.getText())*1.0236;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Indian Rupee")) {
						double ans=Double.parseDouble(start.getText())*82.7906;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Japanese Yen")) {
						double ans=Double.parseDouble(start.getText())*150.4999;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
					if(to.getSelectedItem().equals("Bangladesh Taka")) {
						double ans=Double.parseDouble(start.getText())*101.5976;
						String conv=String.format("%.4f",ans);
						end.setText(String.valueOf(conv));
					}
				}
			}
		});
		equal.setForeground(SystemColor.inactiveCaptionBorder);
		equal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		equal.setBackground(new Color(0, 128, 128));
		contentPane.add(equal);
		
		JLabel lblNewLabel_1 = new JLabel("Currency");
		lblNewLabel_1.setBounds(50, 94, 94, 29);
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Unit Convertor");
		lblNewLabel.setBounds(23, 41, 185, 35);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 566, 30);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mode");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific Calci");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Scientific_calci.main(null);
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmDimensionConvertor = new JMenuItem("Dimension Convertor");
		mntmDimensionConvertor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Dimensions.main(null);
			}
		});
		mntmDimensionConvertor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmDimensionConvertor);
		
		JMenuItem mntmCurrency = new JMenuItem("Currency Convertor");
		mntmCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmCurrency);
		
		JMenuItem mntmPolynomialEquations = new JMenuItem("Polynomial Equations");
		mntmPolynomialEquations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Equations.main(null);
			}
		});
		mntmPolynomialEquations.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmPolynomialEquations);
	}

}
