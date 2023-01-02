import javax.swing.*;
import java.awt.event.*;

class ComboBoxDemo extends JFrame implements ActionListener {
	JFrame jFrame = new JFrame();
	JLabel flagLabel = new JLabel("");
	JButton btnShow = new JButton("Show");
	JComboBox combo = new JComboBox();
	ImageIcon pakistan = new ImageIcon("pakistan.jpg");
	ImageIcon india = new ImageIcon("india.jpg");
	ImageIcon newzland = new ImageIcon("Newzland.png");
	ImageIcon austria = new ImageIcon("austria.png");
	ImageIcon bangladesh = new ImageIcon("bangladesh.png");
	ImageIcon afghanistan = new ImageIcon("afghanistan.png");
	ImageIcon germen = new ImageIcon("germen.png");
	ImageIcon usa = new ImageIcon("USA.png");
	ImageIcon uae = new ImageIcon("uae.png");
	ImageIcon southafrica = new ImageIcon("south africa.png");
	
	 ComboBoxDemo() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,500,500);
		combo.setBounds(50,30,100,20);
		flagLabel.setBounds(100,100,300,300);
		btnShow.setBounds(180,30,70,30);
		
		combo.addItem("Pakistan");
		combo.addItem("India");
		combo.addItem("Newzland");
		combo.addItem("austria");
		combo.addItem("bangladesh");
		combo.addItem("afghanistan");
		combo.addItem("germen");
		combo.addItem("USA");
		combo.addItem("uae");
		combo.addItem("southafrica");
		
		
		jFrame.add(flagLabel);
		jFrame.add(combo);
		jFrame.add(btnShow);
		
		jFrame.setVisible(true);
		
		btnShow.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnShow) {
			String item = combo.getSelectedItem().toString();
			if(item.equals("Pakistan"))  {
				flagLabel.setIcon(pakistan);
			}
			if(item.equals("India")) { 				
				flagLabel.setIcon(india);
				System.out.println("I am Extra Line to Check Logic in INDIA");
			}
			if(item.equals("Newzland")) 
				flagLabel.setIcon(newzland);
				System.out.println("I am Extra Line to Check Logic");
				
				
			if(item.equals("austria")) 
				flagLabel.setIcon(austria);
				
				
			if(item.equals("bangladesh")) 
				flagLabel.setIcon(bangladesh);
				
				
			if(item.equals("afghanistan")) 
				flagLabel.setIcon(afghanistan);
				
				
			if(item.equals("germen")) 
				flagLabel.setIcon(germen);
				
				
			if(item.equals("USA")) 
				flagLabel.setIcon(usa);
				
				
			if(item.equals("uae")) 
				flagLabel.setIcon(uae);
				
				
			if(item.equals("southafrica")) 
				flagLabel.setIcon(southafrica);
				
			}
		}
 
	
	public static void main(String arg[]) {
		new ComboBoxDemo();
		}

}