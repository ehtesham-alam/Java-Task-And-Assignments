import javax.swing.*;

class KiloMeterToMeter extends JFrame {
	public static void main(String arg[]) {
		String kilometer = JOptionPane.showInputDialog(null, "Enter Kilo meter to convert into meter");
	    int km = Integer.parseInt(kilometer);
		int result = km * 1000;
		JOptionPane.showMessageDialog(null, result+" meters");
	}
}
