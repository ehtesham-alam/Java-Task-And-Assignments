import javax.swing.*;
import java.awt.event.*;

class RadioAndCheckBoxDemo extends JFrame implements ActionListener {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter KiloMeter");
	JButton jButton = new JButton("convert to Meter");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	JRadioButton rbMale = new JRadioButton("Male");
	JRadioButton rbFemale = new JRadioButton("Female");
	JCheckBox chBox = new JCheckBox("sanjay");
	
	
	RadioAndCheckBoxDemo() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,140,30);
		chBox.setBounds(20,130,150,20);
		rbFemale.setBounds(130,15,80,30);
		rbMale.setBounds(80,125,80,30);
		
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(chBox);
		jFrame.add(rbMale);
		jFrame.add(rbFemale);
		
		jFrame.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			String km = jTextfield.getText();
			int kmm = Integer.parseInt(km);
			int result = kmm * 1000;
			jLabel3.setText(result+"");
		  }
	}
	public static void main(String arg[]) {
		new RadioAndCheckBoxDemo();
		}

}