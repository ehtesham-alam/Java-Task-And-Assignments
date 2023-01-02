import javax.swing.*;

class GramToKg extends JFrame {
	public static void main(String arg[]) {
		String gram = JOptionPane.showInputDialog(null,"Enter Gram To covert into Kilo Gram");
		int Gram = Integer.parseInt(gram);
		int result = Gram / 1000;
		JOptionPane.showMessageDialog(null,result+" Kilo Gram");
	
	}

}
