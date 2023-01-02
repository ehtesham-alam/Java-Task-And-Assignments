import java.awt.*;
import java.awt.event.*;

class CmToMilimeter extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label = new Label("Enter Centimeter");
	Button Button = new Button("convert to Milimeter");
	Label Label2 = new Label("Result:");
	TextField Textfield = new TextField();
	Label Label3 = new Label();
	
	
	CmToMilimeter() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Label.setBounds(20,70,100,20);
		Button.setBounds(70,120,140,30);
		Label2.setBounds(20,180,50,20);
		Textfield.setBounds(120,70,80,30);
		Label3.setBounds(80,175,85,30);
		
		
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
			String cm = Textfield.getText();
			int cmm = Integer.parseInt(cm);
			int result = cmm / 1000;
			Label3.setText(result+"");
		  }
	}
	public static void main(String arg[]) {
		new CmToMilimeter();
		}

}