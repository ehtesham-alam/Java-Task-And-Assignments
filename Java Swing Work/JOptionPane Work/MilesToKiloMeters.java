import javax.swing.*;

class MilesToKiloMeters extends JFrame {
	public static void main(String arg[]) {
		String miles = JOptionPane.showInputDialog(null,"Enter Miles To convert into Kilo Meter");
		int mi = Integer.parseInt(miles);
		double result = mi * 1.609344;
		JOptionPane.showMessageDialog(null,result+" Kilo Meter");
	
	}

}
