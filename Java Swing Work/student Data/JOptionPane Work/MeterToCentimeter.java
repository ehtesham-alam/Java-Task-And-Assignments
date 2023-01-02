import javax.swing.*;

class MeterToCentimeter extends JFrame {
	public static void main(String arg[])
	{
		String meter = JOptionPane.showInputDialog(null,"Enter Meter to convert into Centimeter");
		int mt = Integer.parseInt(meter);
		int result = mt * 100;
		JOptionPane.showMessageDialog(null,result+" centimeter");
	}

}