import javax.swing.*;

class MiliMetersToFeet extends JFrame {
	public static void main(String arg[]) {
		String milimeters = JOptionPane.showInputDialog(null,"Enter Mili Meter To convert into Feet");
		int mili = Integer.parseInt(milimeters);
		double result = mili / 304.8;
		JOptionPane.showMessageDialog(null,result+" Feet");
	
	}

}
