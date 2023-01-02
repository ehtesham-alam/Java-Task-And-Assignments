import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {
	JFrame jFrame = new JFrame();
	JButton jButton1 = new JButton("+");
	JButton jButton2 = new JButton("-");
	JButton jButton3 = new JButton("*");
	JButton jButton4 = new JButton("/");
	JButton jButton5 = new JButton("%");
	JButton jButton6 = new JButton("clear");
	JButton jButton7 = new JButton("Exit");
	JLabel jLabel1 = new JLabel("SIMPLE CALCULATOR!");
	JLabel jLabel2 = new JLabel("Enter First Value");
	JLabel jLabel3 = new JLabel("Enter Second Value");
	JLabel jLabel4 = new JLabel("Result");
	JTextField jTextField = new JTextField();
	JTextField jTextField2 = new JTextField();
	JLabel jLabel5 = new JLabel();
	
	Calculator() {
		jFrame.setLayout(null);
		Container c  = jFrame.getContentPane();
		c.setBackground(Color. green);
	    jFrame.setVisible(true);
		jFrame.setBounds(400,90,400,330);
		jLabel1.setBounds(120,30,210,20);
		jLabel2.setBounds(60,70,100,20);
		jLabel3.setBounds(60,100,120,20);
		jLabel4.setBounds(60,130,120,20);
		jTextField.setBounds(180,70,100,20);
		jTextField2.setBounds(180,100,100,20);
		jLabel5.setBounds(180,130,100,20);
		jButton1.setBounds(20,170,50,20);
		jButton2.setBounds(90,170,50,20);
		jButton3.setBounds(160,170,50,20);
		jButton4.setBounds(230,170,50,20);
		jButton5.setBounds(300,170,50,20);
		jButton6.setBounds(100,220,70,20);
		jButton7.setBounds(180,220,70,20);
		
		jFrame.add(jLabel1);
		jFrame.add(jLabel2);
		jFrame.add(jLabel3);
		jFrame.add(jLabel4);
		jFrame.add(jTextField);
		jFrame.add(jTextField2);
		jFrame.add(jLabel5);
		jFrame.add(jButton1);
		jFrame.add(jButton2);
		jFrame.add(jButton3);
		jFrame.add(jButton4);
		jFrame.add(jButton5);
		jFrame.add(jButton6);
		jFrame.add(jButton7);
			
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
		jButton4.addActionListener(this);
		jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton1) {
			String num1=jTextField.getText();
			String num2=jTextField2.getText();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int result=n1+n2;
			jLabel5.setText(""+result);
		}
		if(e.getSource() == jButton2) {
			String num1=jTextField.getText();
			String num2=jTextField2.getText();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int result=n1-n2;
			jLabel5.setText(""+result);
		}
		if(e.getSource() == jButton3) {
			String num1=jTextField.getText();
			String num2=jTextField2.getText();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int result=n1*n2;
			jLabel5.setText(""+result);
		}
		if(e.getSource() == jButton4) {
			String num1=jTextField.getText();
			String num2=jTextField2.getText();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int result=n1/n2;
			jLabel5.setText(""+result);
		}
		if(e.getSource() == jButton5) {
			String num1=jTextField.getText();
			String num2=jTextField2.getText();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int result=n1%n2;
			jLabel5.setText(""+result);
		}
		if(e.getSource() == jButton6) {
		
		jTextField.setText(" ");
		jTextField2.setText(" ");
	    jLabel5.setText(" ");
		
		  
	 }
		if(e.getSource() == jButton7){
		   System.exit(0);
	   }
	}
	
		public static void main(String arg[])
		{
			Calculator cl=new Calculator();
		}
}