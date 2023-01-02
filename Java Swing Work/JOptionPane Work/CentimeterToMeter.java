import javax.swing.*;

class CentimeterToMeter extends JFrame {
	public static void main(String arg[]) {
		String centimeter = JOptionPane.showInputDialog(null,"Enter Centimeter To covert into Meter");
		int cm = Integer.parseInt(centimeter);
		double result = cm * 0.01;
		JOptionPane.showMessageDialog(null,result+" Meter");
	
	}

}
