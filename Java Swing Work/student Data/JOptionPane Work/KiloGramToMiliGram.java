import javax.swing.*;

class KiloGramToMiliGram extends JFrame {
	public static void main(String arg[]) {
		String kilogram = JOptionPane.showInputDialog(null,"Enter Kilo Gram To covert into Mili Gram");
		int kg = Integer.parseInt(kilogram);
		int result = kg * 1000000;
		JOptionPane.showMessageDialog(null,result+" Mili Grams");
	
	}

}
