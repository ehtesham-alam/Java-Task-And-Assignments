import javax.swing.*;

class FeetToCentiMeters extends JFrame {
	public static void main(String arg[]) {
		String feet = JOptionPane.showInputDialog(null,"Enter Feet To convert into Centi Meter");
		int ft = Integer.parseInt(feet);
		double result = ft * 30.48;
		JOptionPane.showMessageDialog(null,result+" Centi Meter");
	
	}

}
