import javax.swing.*;

class MeterToMiliMeter extends JFrame {
	public static void main(String arg[]) {
		String meter = JOptionPane.showInputDialog(null,"Enter Meter To covert into Mili Meter");
		int mt = Integer.parseInt(meter);
		int result = mt * 1000;
		JOptionPane.showMessageDialog(null,result+" Mili Meter");
	
	}

}
