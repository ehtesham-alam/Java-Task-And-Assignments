import javax.swing.*;

class SwingDemo1 extends JFrame {
	JFrame jFrame = new JFrame();
	JButton jButton = new JButton("ADD");
	JLabel jLabel = new JLabel("Enter First Value");
	JLabel jLabel2 = new JLabel("Enter Second Value");
	JTextField jTextField = new JTextField();
	JTextField jTextField2 = new JTextField();
	
	SwingDemo1() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,500,500);
		jLabel.setBounds(20,20,100,20);
		jLabel2.setBounds(20,60,120,20);
		jTextField.setBounds(150,20,100,20);
		jTextField2.setBounds(150,60,100,20);
		jButton.setBounds(20,140,80,20);
		//jLabel.setBackground(red);
		
		jFrame.add(jLabel);
		jFrame.add(jLabel2);
		jFrame.add(jTextField);
		jFrame.add(jTextField2);
		jFrame.add(jButton);
		
		jFrame.setVisible(true);
	}
	
	public static void main(String arg[]) {
		SwingDemo1 j = new SwingDemo1();
	}
}