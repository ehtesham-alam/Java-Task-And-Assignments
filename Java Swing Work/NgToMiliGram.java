import javax.swing.*;
import java.awt.event.*;

class NgToMiligram extends JFrame implements ActionListener {
	JFrame jFrame = new JFrame();
	JLabel jLabel = new JLabel("Enter NenoGram");
	JButton jButton = new JButton("convert to Miligram");
	JLabel jLabel2 = new JLabel("Result:");
	JTextField jTextfield = new JTextField();
	JLabel jLabel3 = new JLabel();
	
	
	NgToMiligram() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,300,250);
		jLabel.setBounds(20,20,140,20);
		jButton.setBounds(70,70,150,30);
		jLabel2.setBounds(20,130,150,20);
		jTextfield.setBounds(120,15,80,30);
		jLabel3.setBounds(80,125,80,30);
		
		
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jTextfield);
		jFrame.add(jLabel3);
		
		jFrame.setVisible(true);
		
		jButton.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton) {
			String ng = jTextfield.getText();
			int neno = Integer.parseInt(ng);
			double result = neno * 0.000001;
			jLabel3.setText(result+"");
		  }
	}
	public static void main(String arg[]) {
		new NgToMiligram();
		}

}