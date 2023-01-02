import javax.swing.*;

class MiliGramToMicroGram extends JFrame {
	public static void main(String arg[]) {
		String Miligram = JOptionPane.showInputDialog(null,"Enter Mili Gram To covert into Micro Gram");
		int mg = Integer.parseInt(Miligram);
		int result = mg * 1000;
		JOptionPane.showMessageDialog(null,result+" Micro Grams");
	
	}

}
