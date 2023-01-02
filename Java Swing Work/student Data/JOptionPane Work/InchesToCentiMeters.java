import javax.swing.*;

class InchesToCentiMeters extends JFrame {
	public static void main(String arg[]) {
		String inches = JOptionPane.showInputDialog(null,"Enter Miles To convert into Centi Meter");
		int in = Integer.parseInt(inches);
		double result = in * 1.609344;
		JOptionPane.showMessageDialog(null,result+" Centi Meter");
	
	}

}
