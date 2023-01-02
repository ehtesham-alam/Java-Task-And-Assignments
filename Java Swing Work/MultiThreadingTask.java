import javax.swing.*;

class MultiThreadingTask extends JFrame {
	JFrame jFrame = new JFrame();

	MultiThreadingTask() {
		jFrame.setLayout(null);
		jFrame.setBounds(400,150,500,500);
		jFrame.setVisible(true);
	}
	
	public static void main(String arg[]) {
		MultiThreadingTask mth = new MultiThreadingTask();
	}
}