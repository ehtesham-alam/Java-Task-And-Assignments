import javax.swing.*;

class SwingDemo2 extends JFrame {
	JFrame  jFrame = new JFrame();
	JButton jButton = new JButton("ADD");
	JLabel  jLable = new JLabel("Enter first value");
	JLabel  jLable2 = new JLabel("Enter second value");
	JTextField jTaxtfield = new JTextField();
	JTextField jTaxtfield2 = new JTextField();
	
	
	SwingDemo2() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLable.setBounds(20,20,100,20);
		jLable2.setBounds(20,60,120,20);
		jTaxtfield.setBounds(150,15,100,30);
		jTaxtfield2.setBounds(150,55,100,30);
		jButton.setBounds(20,120,70,30);
		
		
		jFrame.add(jLable);
		jFrame.add(jLable2);
		jFrame.add(jTaxtfield);
		jFrame.add(jTaxtfield2);
		jFrame.add(jButton);
		
	    jFrame.setVisible(true);
		
			
	}
	public static void main(String arg[]) {
		new SwingDemo2();
		}

}