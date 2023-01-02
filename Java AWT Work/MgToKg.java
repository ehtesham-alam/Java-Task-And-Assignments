import java.awt.*;
import java.awt.event.*;

class MgToKg extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label = new Label("Enter MiliGram");
	Button Button = new Button("convert to KiloGram");
	Label Label2 = new Label("Result:");
	TextField Textfield = new TextField();
	Label Label3 = new Label();
	
	
	MgToKg() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Label.setBounds(20,70,100,20);
		Button.setBounds(70,120,150,30);
		Label2.setBounds(20,180,50,20);
		Textfield.setBounds(120,70,80,30);
		Label3.setBounds(80,175,80,30);
		
		
		Frame.add(Label);
		Frame.add(Button);
		Frame.add(Label2);
		Frame.add(Textfield);
		Frame.add(Label3);
		
		Frame.setVisible(true);
		
		Button.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Button) {
			String mg = Textfield.getText();
			int mgg = Integer.parseInt(mg);
			double result = mgg * 0.000001;
			Label3.setText(result+"");
		  }
	}
	
	public static void main(String arg[]) {
		new MgToKg();
		}

}