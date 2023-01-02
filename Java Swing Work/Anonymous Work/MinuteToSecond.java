import javax.swing.*;
import java.awt.event.*;

class MinuteToSecond extends JFrame {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter Minute");
	JButton jButton = new JButton("convert to Second");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	
	
	MinuteToSecond() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,140,30);
		jLabel2.setBounds(20,130,150,20);
		jTextfield.setBounds(100,15,80,30);
		jLabel3.setBounds(80,125,80,30);
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jTextfield);
		jFrame.add(jLabel3);
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String min = jTextfield.getText();
				int mint = Integer.parseInt(min);
				int result = mint * 60;
				jLabel3.setText(result+" second");
			}
		});
		
		jFrame.setVisible(true);
		
		//jButton.addActionListener(this);
		
	}
	
	
		
	public static void main(String arg[]) {
		new MinuteToSecond();
		}

}