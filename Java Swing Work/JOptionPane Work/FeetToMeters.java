import javax.swing.*;

class FeetToMeters extends JFrame {
	public static void main(String arg[]) {
		String feet = JOptionPane.showInputDialog(null,"Enter Feet To convert into Meters");
		int ft = Integer.parseInt(feet);
		double result = ft * 0.3048;
		JOptionPane.showMessageDialog(null,result+" Meter");
	
	}

}
