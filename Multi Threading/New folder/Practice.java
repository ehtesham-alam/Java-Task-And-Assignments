import javax.swing.*;

class Practice extends JFrame {
	static JFrame jFrame = new JFrame();
	static ImageIcon iconlbPhoto1 = new ImageIcon("foward-arrow.png");
	static JLabel lbPhoto1 = new JLabel(iconlbPhoto1);
		
	Practice() {
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,1500,1000);
		lbPhoto1.setBounds(0,200,48,48);
		
		jFrame.add(lbPhoto1);
		jFrame.setVisible(true);
	}
	public static void main(String arg[]) {
		Practice mth = new Practice();
		// LeftArrow la = new LeftArrow(lbPhoto1, jFrame);
		// la.start();
		
	}
}

/* class LeftArrow extends Thread {
	
	private JLabel lb;
	private JFrame frame;
	
	LeftArrow(JLabel lb, JFrame frame) {
		this.lb = lb;
		this.frame = frame;
		//System.out.println(lb.getX());
	}
	
	public void run() {
		for (int i = lb.getX(); i <= 100; i++) {
			lb.setLocation(lb.getX()+2, lb.getY());
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			frame.setTitle("X-axis : "+lb.getX()+" || Y-axis : "+lb.getY());
		}
	}
} */