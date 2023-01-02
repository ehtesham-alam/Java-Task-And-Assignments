import javax.swing.*;
import java.awt.event.*;

class DaysToMinute extends JFrame {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter Days");
	JButton jButton = new JButton("convert to Minute");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	
	
	DaysToMinute() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,140,30);
		jLabel2.setBounds(20,130,150,20);
		jTextfield.setBounds(100,15,80,30);
		jLabel3.setBounds(80,125,90,30);
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jTextfield);
		jFrame.add(jLabel3);
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = jTextfield.getText();
				int days = Integer.parseInt(day);
				int result = days * 1440;
				jLabel3.setText(result+" minute");
			}
		});
		
		jFrame.setVisible(true);
		
		
	}
	
	
		
	public static void main(String arg[]) {
		new DaysToMinute();
		}

}