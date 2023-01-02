import javax.swing.*;

class MiliMeterToCentimeter extends JFrame {
		public static void main(String arg[]) {
		String MiliMeter = JOptionPane.showInputDialog(null,"Enter Mili Meter To covert into Centimeter");
		int mm = Integer.parseInt(MiliMeter);
		double result = mm * 0.1;
		JOptionPane.showMessageDialog(null,result+" Centimeter");
	
	}

}
