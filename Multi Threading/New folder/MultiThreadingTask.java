import javax.swing.*;
import java.awt.*;

class MultiThreadingTask extends JFrame {
	static JFrame jFrame = new JFrame();
	static ImageIcon iconlbPhoto1 = new ImageIcon("foward-arrow.png");
	static JLabel lbPhoto1 = new JLabel(iconlbPhoto1);
	static ImageIcon iconlbPhoto3 = new ImageIcon("backward-arrow.png");
	static JLabel lbPhoto3 = new JLabel(iconlbPhoto3);
	static ImageIcon iconlbPhoto2 = new ImageIcon("point.png");
	static JLabel lbPhoto2 = new JLabel(iconlbPhoto2);
	
	MultiThreadingTask() {
		jFrame.setLayout(null);
		Container c  = jFrame.getContentPane();
		c.setBackground(Color. white);
		jFrame.setBounds(500,200,500,500);
		lbPhoto1.setBounds(0,200,48,48);
		lbPhoto3.setBounds(430,200,48,48);
		lbPhoto2.setBounds(210,170,96,96);
		
		jFrame.add(lbPhoto1);
		jFrame.add(lbPhoto2);
		jFrame.add(lbPhoto3);
		jFrame.setVisible(true);
	}
	public static void main(String arg[]) {
		
		MultiThreadingTask mth = new MultiThreadingTask();
		LeftArrow la = new LeftArrow(lbPhoto1, jFrame, lbPhoto2);
		RightArrow rl = new RightArrow(lbPhoto3, jFrame, lbPhoto2);
		la.start();
		rl.start();
	}
}
class LeftArrow extends Thread {
	
	private JLabel lb;
	private JFrame frame;
	private JLabel point;
	
	LeftArrow(JLabel lb, JFrame frame, JLabel point) {
		this.lb = lb;
		this.frame = frame;
		this.point = point;
		//System.out.println(point.getX());
	}
	
	public void run() {
		for (int i = lb.getX(); i <= (point.getX())/2-12; i++) {
			if(i==point.getX()) { 
			JOptionPane.showMessageDialog(null,"Left Arrow  won the game");
			break;
			}
			else {
			lb.setLocation(lb.getX()+2, lb.getY());
			try {
				Thread.sleep(120);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//frame.setTitle("X-axis : "+lb.getX()+" || Y-axis : "+lb.getY());
		 }
		}
	}
}
class RightArrow extends Thread {
	
	private JLabel lb;
	private JFrame frame;
	public JLabel point;
	
	RightArrow(JLabel lb, JFrame frame, JLabel point) {
		this.lb = lb;
		this.frame = frame;
		this.point = point;
		System.out.println("I am Active");
	}
	
	public void run() {
		
		
		for (int i = 450; i >=(point.getX()-5); i--) {
			if(i==point.getX()+72){ 
			JOptionPane.showMessageDialog(null," Right Arrow won the game");
			break;
			}
			else{
			lb.setLocation(i-2, lb.getY());
			try {
				Thread.sleep(60);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			frame.setTitle("X-axis : "+lb.getX()+" || Y-axis : "+lb.getY());
			}
		}
	}
}