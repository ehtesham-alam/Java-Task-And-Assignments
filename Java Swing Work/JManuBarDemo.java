import javax.swing.*;

class JManuBarDemo extends JFrame {
	JFrame f = new JFrame();
	JMenuBar mbar = new JMenuBar();
	JMenu jManu = new JMenu("File");
	JMenu subManu = new JMenu("More");
	JMenuItem newItem = new JMenuItem("New");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	JMenuItem paintItem = new JMenuItem("Paint");
	JMenuItem notepadItem = new JMenuItem("Notepad");
	
	JManuBarDemo() {
		f.setLayout(null);
		f.setSize(500,500);
		
		mbar.add(jManu);
		f.setJMenuBar(mbar);
		jManu.add(newItem);
		jManu.add(saveItem);
		subManu.add(paintItem);
		subManu.add(notepadItem);
		jManu.add(subManu);
		jManu.addSeparator();
		jManu.add(exitItem);
		f.show();
	}
	public static void main(String []akash) {
		new JManuBarDemo();
	}
}