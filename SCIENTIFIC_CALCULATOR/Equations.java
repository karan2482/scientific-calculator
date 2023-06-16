import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class Equations extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equations frame = new Equations();
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
	public Equations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Linear equation");
		lblNewLabel.setBounds(10, 58, 205, 31);
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblQuadraticEquation = new JLabel("Quadratic equation");
		lblQuadraticEquation.setBounds(10, 181, 225, 31);
		lblQuadraticEquation.setForeground(SystemColor.inactiveCaptionBorder);
		lblQuadraticEquation.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblQuadraticEquation);
		
		JLabel lblA = new JLabel("ax");
		lblA.setBounds(24, 90, 31, 31);
		lblA.setForeground(SystemColor.inactiveCaptionBorder);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setBounds(138, 90, 31, 31);
		lblB.setForeground(SystemColor.inactiveCaptionBorder);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblB);
		
		JLabel lblA_1 = new JLabel("ax^2");
		lblA_1.setBounds(10, 228, 63, 31);
		lblA_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblA_1);
		
		JLabel lblBx = new JLabel("bx");
		lblBx.setBounds(128, 228, 31, 31);
		lblBx.setForeground(SystemColor.inactiveCaptionBorder);
		lblBx.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblBx);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(218, 228, 31, 31);
		lblC.setForeground(SystemColor.inactiveCaptionBorder);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblC);
		
		textField = new JTextField();
		textField.setBounds(10, 127, 63, 31);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 127, 63, 31);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 283, 63, 31);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 283, 63, 31);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(202, 283, 63, 31);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.setBounds(337, 70, 104, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double a=Double.parseDouble(textField.getText());
			double b=Double.parseDouble(textField_1.getText());
			double ans=-(b/a);
			String res=String.format("%.4f", ans);
			textField_5.setText(res);
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Solve");
		btnNewButton_1.setBounds(355, 228, 104, 31);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField_2.getText());
				double b=Double.parseDouble(textField_3.getText());
				double c =Double.parseDouble(textField_4.getText());
				double disc=b*b-4.0*a*c;
				if(disc>0.0) {
					double r1=(-b+Math.pow(disc, 0.5))/(2.0*a);
					double r2=(-b-Math.pow(disc, 0.5))/(2.0*a);
					String rr1=String.format("%.4f", r1);
					String rr2=String.format("%.4f", r2);
					textField_6.setText(rr1);
					textField_7.setText(rr2);
					}
				else if(disc==0.0) {
					double r1=-(b/2*a);
					String rr1=String.format("%.4f", r1);
					textField_6.setText(rr1);
					textField_7.setText(rr1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Roots are not real");
				}
			}
		});
		btnNewButton_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		contentPane.add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(337, 127, 104, 31);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(311, 283, 84, 31);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(426, 283, 79, 31);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 533, 31);
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
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
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
		
		JMenuItem mntmCurrencyConvertor = new JMenuItem("Currency Convertor");
		mntmCurrencyConvertor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				Currency.main(null);
			}
		});
		mntmCurrencyConvertor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmCurrencyConvertor);
		
		JMenuItem mntmPolynomialEquations = new JMenuItem("Polynomial Equations");
		mntmPolynomialEquations.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmPolynomialEquations);
	}
}
