import javax.swing.*;

class NotepadFrame extends JFrame {
	JFrame fram = new JFrame();
	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("File");
	JMenuItem newItem = new JMenuItem("New");
	JMenuItem openItem = new JMenuItem("Open");
	JMenu oCFMenu = new JMenu("Open Containing Folder");
	JMenuItem explorerItem = new JMenuItem("Explorer");
	JMenuItem cmdItem = new JMenuItem("Cmd");
	JMenuItem oIDVItem = new JMenuItem("Open in Default Viewer");
	JMenuItem oFWItem = new JMenuItem("Open Folder as Workspace...");
	JMenuItem rfDItem = new JMenuItem("Reload from Disk");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem saveAsItem = new JMenuItem("Save As...");
	JMenuItem sCAItem = new JMenuItem("Save a Copy As...");
	JMenuItem saveAllItem = new JMenuItem("Save All");
	JMenuItem renameItem = new JMenuItem("Rename...");
	JMenuItem closeItem = new JMenuItem("Close");
	JMenuItem closeAllItem = new JMenuItem("Close All");
	JMenu cMMenu = new JMenu("Close More");
	JMenuItem cAbADItem = new JMenuItem("Close All but Active Document");
	JMenuItem cALItem = new JMenuItem("Close All to the Left");
	JMenuItem cARItem = new JMenuItem("Close All to the Right");
	JMenuItem mtRBItem = new JMenuItem("Move to Recycle Bin");
	JMenu loadSessionItem = new JMenu("Load Session...");
	JMenu saveSessionItem = new JMenu("Save Session...");
	
    NotepadFrame() {
		fram.setLayout(null);
		fram.setSize(500,500);
		
		menubar.add(menu);
		fram.setJMenuBar(menubar);
		menu.add(newItem);
		menu.add(openItem);
		menu.add(oCFMenu);
		oCFMenu.add(explorerItem);
		oCFMenu.add(cmdItem);
		menu.add(oIDVItem);
		menu.add(oFWItem);
		menu.add(rfDItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		menu.add(sCAItem);
		menu.add(saveAllItem);
		menu.add(renameItem);
		menu.add(closeItem);
		menu.add(closeAllItem);
		menu.add(cMMenu);
		cMMenu.add(cAbADItem);
		cMMenu.add(cALItem);
		cMMenu.add(cARItem);
		menu.add(mtRBItem);
		menu.addSeparator();
		menu.add(loadSessionItem);
		menu.add(saveSessionItem);
	    fram.show();
	}
	public static void main(String []akash) {
		new NotepadFrame();
	}
}