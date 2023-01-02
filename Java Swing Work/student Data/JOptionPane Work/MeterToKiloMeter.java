import javax.swing.*;

class MeterToKiloMeter extends JFrame {
	public static void main(String arg[]) {
		String meter = JOptionPane.showInputDialog(null, "Enter meter to convert into Kilo meter");
	   //int meter2 = Integer.parseInt(meter);
		int result = meter / 1000;
		JOptionPane.showMessageDialog(null, result+" Kilo meters");
	}
}
