import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scientific_calci {

	private JFrame frame;
	private JTextField res;
	private JButton eight;
	double num1;
	double num2;
	double ans;
	String ops;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_calci window = new Scientific_calci();
					
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
	public Scientific_calci() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 767, 32);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mode");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific Calci");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmUnitConvertor_1 = new JMenuItem("Dimension Convertor");
		mntmUnitConvertor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Dimensions d=new Dimensions();
				d.setVisible(true);
			}
		});
		mntmUnitConvertor_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmUnitConvertor_1);
		
		JMenuItem mntmUnitConvertor = new JMenuItem("Currency Convertor");
		mntmUnitConvertor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Currency c=new Currency();
				c.setVisible(true);
			}
		});
		mntmUnitConvertor.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmUnitConvertor);
		
		JMenuItem mntmPolynomialEquations = new JMenuItem("Polynomial Equations");
		mntmPolynomialEquations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Equations eq=new Equations();
				eq.setVisible(true);
			}
		});
		mntmPolynomialEquations.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnNewMenu.add(mntmPolynomialEquations);
		
		res = new JTextField();
		res.setBounds(10, 43, 380, 37);
		res.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(res);
		res.setColumns(10);
		
		JButton seven = new JButton("7");
		seven.setBounds(10, 154, 73, 53);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+seven.getText();
				res.setText(num);
			}
		});
		seven.setForeground(SystemColor.inactiveCaptionBorder);
		seven.setBackground(new Color(0, 128, 128));
		seven.setFont(new Font("Sitka Display", Font.BOLD, 26));
		frame.getContentPane().add(seven);
		
		eight = new JButton("8");
		eight.setBounds(93, 154, 73, 53);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+eight.getText();
				res.setText(num);
			}
		});
		eight.setForeground(SystemColor.inactiveCaptionBorder);
		eight.setFont(new Font("Sitka Display", Font.BOLD, 26));
		eight.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(eight);
		
		JButton four = new JButton("4");
		four.setBounds(10, 218, 73, 53);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+four.getText();
				res.setText(num);
			}
		});
		four.setForeground(SystemColor.inactiveCaptionBorder);
		four.setFont(new Font("Sitka Display", Font.BOLD, 26));
		four.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(four);
		
		JButton one = new JButton("1");
		one.setBounds(10, 282, 73, 53);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+one.getText();
				res.setText(num);
			}
		});
		one.setForeground(SystemColor.inactiveCaptionBorder);
		one.setFont(new Font("Sitka Display", Font.BOLD, 26));
		one.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(one);
		
		JButton five = new JButton("5");
		five.setBounds(93, 218, 73, 53);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+five.getText();
				res.setText(num);
			}
		});
		five.setForeground(SystemColor.inactiveCaptionBorder);
		five.setFont(new Font("Sitka Display", Font.BOLD, 26));
		five.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(five);
		
		JButton zero = new JButton("0");
		zero.setBounds(10, 346, 73, 53);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+zero.getText();
				res.setText(num);
			}
		});
		zero.setForeground(SystemColor.inactiveCaptionBorder);
		zero.setFont(new Font("Sitka Display", Font.BOLD, 26));
		zero.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(zero);
		
		JButton nine = new JButton("9");
		nine.setBounds(176, 154, 73, 53);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+nine.getText();
				res.setText(num);
			}
		});
		nine.setForeground(SystemColor.inactiveCaptionBorder);
		nine.setFont(new Font("Sitka Display", Font.BOLD, 26));
		nine.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(nine);
		
		JButton del = new JButton("DEL");
		del.setBounds(259, 154, 73, 53);
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String del=null;
				if(res.getText().length()>0) {
					StringBuilder sb=new StringBuilder(res.getText());
					sb.deleteCharAt(res.getText().length()-1);
					del=sb.toString();
					res.setText(del);
				}
			}
		});
		del.setForeground(SystemColor.inactiveCaptionBorder);
		del.setFont(new Font("Sitka Display", Font.BOLD, 22));
		del.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(del);
		
		JButton on = new JButton("AC");
		on.setBounds(342, 154, 73, 53);
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText(null);
			}
		});
		on.setForeground(SystemColor.inactiveCaptionBorder);
		on.setFont(new Font("Sitka Display", Font.BOLD, 26));
		on.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(on);
		
		JButton six = new JButton("6");
		six.setBounds(176, 218, 73, 53);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+six.getText();
				res.setText(num);
			}
		});
		six.setForeground(SystemColor.inactiveCaptionBorder);
		six.setFont(new Font("Sitka Display", Font.BOLD, 26));
		six.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(six);
		
		JButton mul = new JButton("X");
		mul.setBounds(259, 218, 73, 53);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(res.getText());
				res.setText(null);
				ops="*";
			}
		});
		mul.setForeground(SystemColor.inactiveCaptionBorder);
		mul.setFont(new Font("Sitka Display", Font.BOLD, 26));
		mul.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(mul);
		
		JButton div = new JButton("%");
		div.setBounds(342, 218, 73, 53);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(res.getText());
				res.setText(null);
				ops="%";
			}
		});
		div.setForeground(SystemColor.inactiveCaptionBorder);
		div.setFont(new Font("Sitka Display", Font.BOLD, 26));
		div.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(div);
		
		JButton two = new JButton("2");
		two.setBounds(93, 282, 73, 53);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+two.getText();
				res.setText(num);
			}
		});
		two.setForeground(SystemColor.inactiveCaptionBorder);
		two.setFont(new Font("Sitka Display", Font.BOLD, 26));
		two.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setBounds(176, 282, 73, 53);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+three.getText();
				res.setText(num);
			}
		});
		three.setForeground(SystemColor.inactiveCaptionBorder);
		three.setFont(new Font("Sitka Display", Font.BOLD, 26));
		three.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(three);
		
		JButton add = new JButton("+");
		add.setBounds(259, 282, 73, 53);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(res.getText());
				res.setText(null);
				ops="+";
			}
		});
		add.setForeground(SystemColor.inactiveCaptionBorder);
		add.setFont(new Font("Sitka Display", Font.BOLD, 26));
		add.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(add);
		
		JButton minus = new JButton("-");
		minus.setBounds(342, 282, 73, 53);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(res.getText());
				res.setText(null);
				ops="-";
			}
		});
		minus.setForeground(SystemColor.inactiveCaptionBorder);
		minus.setFont(new Font("Sitka Display", Font.BOLD, 26));
		minus.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(minus);
		
		JButton point = new JButton(".");
		point.setBounds(93, 346, 73, 53);
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=res.getText()+point.getText();
				res.setText(num);
			}
		});
		point.setForeground(SystemColor.inactiveCaptionBorder);
		point.setFont(new Font("Sitka Display", Font.BOLD, 26));
		point.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(point);
		
		JButton btnx = new JButton("10^x");
		btnx.setBounds(176, 346, 73, 53);
		btnx.setForeground(SystemColor.inactiveCaptionBorder);
		btnx.setFont(new Font("Sitka Display", Font.PLAIN, 20));
		btnx.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnx);
		
		JButton fraction = new JButton("/");
		fraction.setBounds(259, 346, 73, 53);
		fraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(res.getText());
				res.setText(null);
				ops="/";
			}
		});
		fraction.setForeground(SystemColor.inactiveCaptionBorder);
		fraction.setFont(new Font("Sitka Display", Font.BOLD, 26));
		fraction.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(fraction);
		
		JButton equal = new JButton("=");
		equal.setBounds(342, 346, 73, 53);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String conv;
				num2=Double.parseDouble(res.getText());
				if(ops=="+") {
					ans=num1+num2;
					conv=String.format("%.2f",ans);
					res.setText(conv);
				}
				else if(ops=="-") {
					ans=num1-num2;
					conv=String.format("%.2f",ans);
					res.setText(conv);
				}
				else if(ops=="*") {
					ans=num1*num2;
					conv=String.format("%.2f",ans);
					res.setText(conv);
				}
				else if(ops=="/") {
					ans=num1/num2;
					conv=String.format("%.2f",ans);
					res.setText(conv);
				}
				else if(ops=="%") {
					ans=num1%num2;
					conv=String.format("%.2f",ans);
					res.setText(conv);
				}
			}
		});
		equal.setForeground(SystemColor.inactiveCaptionBorder);
		equal.setFont(new Font("Sitka Display", Font.BOLD, 26));
		equal.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(equal);
		
		JButton btnAsin = new JButton("asin");
		btnAsin.setBounds(425, 154, 73, 53);
		btnAsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.asin(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnAsin.setForeground(SystemColor.inactiveCaptionBorder);
		btnAsin.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnAsin.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnAsin);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(425, 282, 73, 53);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.sin(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnSin.setForeground(SystemColor.inactiveCaptionBorder);
		btnSin.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnSin.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnSin);
		
		JButton btnBin = new JButton("BIN");
		btnBin.setBounds(425, 346, 73, 53);
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int con=Integer.parseInt(res.getText());
				res.setText(Integer.toBinaryString(con));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnBin.setForeground(SystemColor.inactiveCaptionBorder);
		btnBin.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnBin.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnBin);
		
		JButton btnAcos = new JButton("acos");
		btnAcos.setBounds(508, 154, 73, 53);
		btnAcos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.acos(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnAcos.setForeground(SystemColor.inactiveCaptionBorder);
		btnAcos.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnAcos.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnAcos);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setBounds(425, 218, 73, 53);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.sinh(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnSinh.setForeground(SystemColor.inactiveCaptionBorder);
		btnSinh.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnSinh.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setBounds(508, 218, 73, 53);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.cosh(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnCosh.setForeground(SystemColor.inactiveCaptionBorder);
		btnCosh.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnCosh.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnCosh);
		
		JButton btnAtan = new JButton("atan");
		btnAtan.setBounds(591, 154, 73, 53);
		btnAtan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.atan(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnAtan.setForeground(SystemColor.inactiveCaptionBorder);
		btnAtan.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnAtan.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnAtan);
		
		JButton btnCbrt = new JButton("cbrt");
		btnCbrt.setBounds(672, 154, 73, 53);
		btnCbrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.cbrt(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnCbrt.setForeground(SystemColor.inactiveCaptionBorder);
		btnCbrt.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnCbrt.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnCbrt);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setBounds(591, 218, 73, 53);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.tanh(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnTanh.setForeground(SystemColor.inactiveCaptionBorder);
		btnTanh.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnTanh.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnTanh);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setBounds(672, 218, 73, 53);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.exp(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnEx.setForeground(SystemColor.inactiveCaptionBorder);
		btnEx.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnEx.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnEx);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(508, 282, 73, 53);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.cos(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnCos.setForeground(SystemColor.inactiveCaptionBorder);
		btnCos.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnCos.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(591, 282, 73, 53);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.tan(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnTan.setForeground(SystemColor.inactiveCaptionBorder);
		btnTan.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnTan.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnTan);
		
		JButton btnX_1 = new JButton("x^2");
		btnX_1.setBounds(672, 282, 73, 53);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.pow(ans,2);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnX_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnX_1.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnX_1.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnX_1);
		
		JButton btnOct = new JButton("OCT");
		btnOct.setBounds(508, 346, 73, 53);
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int con=Integer.parseInt(res.getText());
				res.setText(Integer.toOctalString(con));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnOct.setForeground(SystemColor.inactiveCaptionBorder);
		btnOct.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnOct.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnOct);
		
		JButton btnHex = new JButton("HEX");
		btnHex.setBounds(591, 346, 73, 53);
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int con=Integer.parseInt(res.getText());
				res.setText(Integer.toHexString(con));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnHex.setForeground(SystemColor.inactiveCaptionBorder);
		btnHex.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnHex.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnHex);
		
		JButton btnX_2 = new JButton("x^3");
		btnX_2.setBounds(672, 346, 73, 53);
		btnX_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.pow(ans,3);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnX_2.setForeground(SystemColor.inactiveCaptionBorder);
		btnX_2.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnX_2.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnX_2);
		
		JButton btnSqrt_1 = new JButton("sqrt");
		btnSqrt_1.setBounds(672, 90, 73, 53);
		btnSqrt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.sqrt(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnSqrt_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnSqrt_1.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnSqrt_1.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnSqrt_1);
		
		JButton btnNewButton_37 = new JButton(")");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=res.getText()+btnNewButton_37.getText();
				res.setText(set);
			}
		});
		btnNewButton_37.setBounds(591, 90, 73, 53);
		btnNewButton_37.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_37.setFont(new Font("Sitka Display", Font.BOLD, 26));
		btnNewButton_37.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("(");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String set=res.getText()+btnNewButton_38.getText();
				res.setText(set);
			}
		});
		btnNewButton_38.setBounds(508, 90, 73, 53);
		btnNewButton_38.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_38.setFont(new Font("Sitka Display", Font.BOLD, 26));
		btnNewButton_38.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(425, 90, 73, 53);
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.log(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnLn.setForeground(SystemColor.inactiveCaptionBorder);
		btnLn.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnLn.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnLn);
		
		JButton btnLog = new JButton("log");
		btnLog.setBounds(342, 90, 73, 53);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.log10(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnLog.setForeground(SystemColor.inactiveCaptionBorder);
		btnLog.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnLog.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnLog);
		
		JButton btnFact = new JButton("fact");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int num=Integer.parseInt(res.getText());
				long fact=num;
				for(int i=num;i>1;i--) {
					fact*=(i-1);
				}
				res.setText(Long.toString(fact));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Factorial doesn't exist for decimals...");		
				}
			}
		});
		btnFact.setBounds(259, 90, 73, 53);
		btnFact.setForeground(SystemColor.inactiveCaptionBorder);
		btnFact.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnFact.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnFact);
		
		JButton btnRound = new JButton("rund");
		btnRound.setBounds(93, 90, 73, 53);
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.round(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value....");
				}
			}
		});
		btnRound.setForeground(SystemColor.inactiveCaptionBorder);
		btnRound.setFont(new Font("Sitka Display", Font.PLAIN, 20));
		btnRound.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnRound);
		
		JButton btnAbs = new JButton("abs");
		btnAbs.setBounds(10, 90, 73, 53);
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=Math.abs(ans);
				 res.setText(String.valueOf(ans));
				}
				catch(Exception ea) {
					JOptionPane.showMessageDialog(null, "Enter a value...");
				}
			}
		});
		btnAbs.setForeground(SystemColor.inactiveCaptionBorder);
		btnAbs.setFont(new Font("Sitka Display", Font.BOLD, 20));
		btnAbs.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnAbs);
		
		JButton btnSqrt = new JButton("1/x");
		btnSqrt.setBounds(176, 91, 73, 52);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans=Double.parseDouble(String.valueOf(res.getText()));
				 ans=1/ans;
				 res.setText(String.valueOf(ans));
			}
		});
		btnSqrt.setForeground(SystemColor.inactiveCaptionBorder);
		btnSqrt.setFont(new Font("Sitka Display", Font.BOLD, 26));
		btnSqrt.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(btnSqrt);
	}
}
