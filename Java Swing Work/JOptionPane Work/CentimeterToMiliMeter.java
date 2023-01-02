import javax.swing.*;

class CentimeterToMiliMeter extends JFrame {
	public static void main(String arg[]) {
		String centimeter = JOptionPane.showInputDialog(null,"Enter Centimeter To covert into Mili Meter");
		int cm = Integer.parseInt(centimeter);
		int result = cm * 10;
		JOptionPane.showMessageDialog(null,result+" Mili Meter");
	
	}

}
