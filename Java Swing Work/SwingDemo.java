import javax.swing.*;

class SwingDemo extends JFrame {
	JFrame jFrame = new JFrame();

	SwingDemo() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,500,500);
		jFrame.setVisible(true);
	}
	
	public static void main(String arg[]) {
		SwingDemo j = new SwingDemo();
	}
}