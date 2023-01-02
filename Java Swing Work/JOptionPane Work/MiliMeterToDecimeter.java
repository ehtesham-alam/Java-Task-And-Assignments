import javax.swing.*;

class MiliMeterToDecimeter extends JFrame {
		public static void main(String arg[]) {
		String MiliMeter = JOptionPane.showInputDialog(null,"Enter Mili Meter To covert into Decimeter");
		int mm = Integer.parseInt(MiliMeter);
		double result = mm * 0.01;
		JOptionPane.showMessageDialog(null,result+" Decimeter");
	
	}

}
