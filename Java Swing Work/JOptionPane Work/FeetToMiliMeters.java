import javax.swing.*;

class FeetToMiliMeters extends JFrame {
	public static void main(String arg[]) {
		String feet = JOptionPane.showInputDialog(null,"Enter Feet To convert into Mili Meter");
		int ft = Integer.parseInt(feet);
		double result = ft * 304.8;
		JOptionPane.showMessageDialog(null,result+" Mili Meter");
	
	}

}
