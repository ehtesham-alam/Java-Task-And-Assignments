import java.awt.*;

class DemoPage extends Frame {
	Frame fram = new Frame();
	Frame fram1 = new Frame();
	   Frame fram2 = new Frame();
	   Frame fram3 = new Frame();
	   Frame fram4 = new Frame();
	
	DemoPage() {
		// Frame Layout 
		fram.setLayout(null);
		fram1.setLayout(null);
		fram2.setLayout(null);
		fram3.setLayout(null);
		fram3.setLayout(null);
			  
			  // Component Bounds set
			 fram.setBounds(0,0,250,250);
			 fram1.setBounds(0,520,250,250);
			 fram2.setBounds(1165,0,250,250);
			 fram3.setBounds(550,300,250,250);
			 fram4.setBounds(1165,520,250,250);
			 fram.setVisible(true);
			 fram1.setVisible(true);
			 fram2.setVisible(true);
			 fram3.setVisible(true);
			 fram4.setVisible(true);
			  
		
		}
		public static void main(String arg[]){
			   new DemoPage();
		 }
}
