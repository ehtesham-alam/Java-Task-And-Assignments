import javax.swing.*;

class KiloGramToGram extends JFrame {
	public static void main(String arg[]) {
		String kilogram = JOptionPane.showInputDialog(null,"Enter Kilo Gram To covert into Gram");
		int kg = Integer.parseInt(kilogram);
		int result = kg * 1000;
		JOptionPane.showMessageDialog(null,result+" Gram");
	
	}

}
