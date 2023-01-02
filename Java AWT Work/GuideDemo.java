import java.awt.*;

class GuideDemo extends Frame{
	   Frame fram = new Frame();
	   Frame fram1 = new Frame();
	   Frame fram2 = new Frame();
	   Frame fram3 = new Frame();
	   Frame fram4 = new Frame();
	   Frame fram5 = new Frame();
	   Frame fram6 = new Frame();
	   
	   GuideDemo() {
	            fram.setLayout(null);
				fram1.setLayout(null);
				fram2.setLayout(null);
				fram3.setLayout(null);
				fram4.setLayout(null);
				fram5.setLayout(null);
				fram6.setLayout(null);
				
			   fram.setBounds(0,0,100,100);
			   fram1.setBounds(125,100,100,100);
			   fram2.setBounds(250,200,100,100);
			   fram3.setBounds(375,300,100,100);
			   fram4.setBounds(500,400,100,100);
			   fram5.setBounds(625,500,100,100);
			   fram6.setBounds(750,600,100,100);
			   fram.setVisible(true);
			   fram1.setVisible(true);
			   fram2.setVisible(true);
			   fram3.setVisible(true);
			   fram4.setVisible(true);
			   fram5.setVisible(true);
			   fram6.setVisible(true);
		}
      public static void main(String arg[]) {
	  
	        new GuideDemo();
			
		}

}