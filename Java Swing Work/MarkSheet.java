import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MarkSheet extends JFrame implements ActionListener {
	JFrame Frame = new JFrame();
	JLabel jLabel = new JLabel("/*#### M_A_R_K_S_H_E_E_T ####*/");
	JLabel jLabel2 = new JLabel("Enter Java Marks");
	JLabel jLabel3 = new JLabel("Enter C++ Marks");
	JLabel jLabel4 = new JLabel("Enter C# Marks");
	JLabel jLabel5 = new JLabel("Enter Dotnet Marks");
	JLabel jLabel6 = new JLabel("Enter C Marks");
	JLabel jLabel7 = new JLabel("Obtain Marks");
	JLabel jLabel8 = new JLabel("Total Marks");
	JLabel jLabel9 = new JLabel("Percentage");
	JLabel jLabel10 = new JLabel("Grade");
	JTextField Textfield2 = new JTextField();
	JTextField Textfield3 = new JTextField();
	JTextField Textfield4 = new JTextField();
	JTextField Textfield5 = new JTextField();
	JTextField Textfield6 = new JTextField();
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	JLabel jLabel13 = new JLabel();
	JLabel jLabel14 = new JLabel();
	JLabel colorLabel = new JLabel();
	JButton btncal = new JButton("Calculate");
	JButton btnclear = new JButton("Clear");
    JButton btnAbout = new JButton("About");
	JButton btnExit = new JButton("Exit");
	
	
	MarkSheet() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,1000,1000);
		jLabel.setBounds(370,70,200,20);
		jLabel2.setBounds(350,120,100,20);
		jLabel3.setBounds(350,160,100,20);
		jLabel4.setBounds(350,200,100,20);
		jLabel5.setBounds(350,240,100,20);
		jLabel6.setBounds(350,280,100,20);
		jLabel7.setBounds(350,320,100,20);
		jLabel8.setBounds(350,360,100,20);
		jLabel9.setBounds(350,400,100,20);
		jLabel10.setBounds(350,440,100,20);
		Textfield2.setBounds(500,120,100,20);
		Textfield3.setBounds(500,160,100,20);
		Textfield4.setBounds(500,200,100,20);
		Textfield5.setBounds(500,240,100,20);
		Textfield6.setBounds(500,280,100,20);
		jLabel11.setBounds(500,320,100,20);
		jLabel12.setBounds(500,360,100,20);
		jLabel13.setBounds(500,400,100,20);
		jLabel14.setBounds(500,440,100,20);
		colorLabel.setBounds(20,100,300,300);
	    btncal.setBounds(350,480,60,20);
	    btnclear.setBounds(430,480,50,20);
	    btnAbout.setBounds(500,480,45,20);
	    btnExit.setBounds(565,480,35,20);
		
		
		jLabel.setBackground(Color.blue);
	    jLabel2.setBackground(Color.blue);
	    jLabel3.setBackground(Color.blue);
		jLabel4.setBackground(Color.blue);
		jLabel5.setBackground(Color.blue);
		jLabel6.setBackground(Color.blue);
	    jLabel7.setBackground(Color.blue);
		jLabel8.setBackground(Color.blue);
		jLabel9.setBackground(Color.blue);
		jLabel10.setBackground(Color.blue);
		jLabel11.setBackground(Color.blue);
		jLabel12.setBackground(Color.blue);
		jLabel13.setBackground(Color.blue);
		jLabel14.setBackground(Color.blue);
		btncal.setBackground(Color.blue);
		btnclear.setBackground(Color.green);
		btnAbout.setBackground(Color.red);
		
		
		Frame.add(jLabel);
		Frame.add(jLabel2);
		Frame.add(jLabel3);
		Frame.add(jLabel4);
		Frame.add(jLabel5);
		Frame.add(jLabel6);
		Frame.add(jLabel7);
		Frame.add(jLabel8);
		Frame.add(jLabel9);
		Frame.add(jLabel10);
		Frame.add(Textfield2);
		Frame.add(Textfield3);
		Frame.add(Textfield4);
		Frame.add(Textfield5);
		Frame.add(Textfield6);
		Frame.add(jLabel11);
		Frame.add(jLabel12);
		Frame.add(jLabel13);
		Frame.add(jLabel14);
		Frame.add(btncal);
	    Frame.add(btnclear);
		Frame.add(btnAbout);
		Frame.add(btnExit);
		
		Frame.setVisible(true);
		
		btncal.addActionListener(this);
		btnclear.addActionListener(this);
		btnAbout.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	public static void main(String arg[]) {
		new MarkSheet();
		}

}