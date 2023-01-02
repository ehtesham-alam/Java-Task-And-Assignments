import java.awt.*;
import java.awt.event.*;

class Celsius extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label = new Label("Enter Celsius");
	Button Button = new Button("convert to kelvin");
	Label Label2 = new Label("Result:");
	TextField Textfield = new TextField();
	Label Label3 = new Label();
	
	
	Celsius() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Label.setBounds(20,70,100,20);
		Button.setBounds(70,120,140,30);
		Label2.setBounds(20,180,50,20);
		Textfield.setBounds(120,70,80,30);
		Label3.setBounds(80,175,85,30);
		Label3.setBackground(Color.blue);
		Label2.setBackground(Color.red);
		
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
			String cl = Textfield.getText();
			int cls = Integer.parseInt(cl);
			double result = cls + 273.15;
			Label3.setText(result+"");
			Label3.setBackground(Color.red);
		}
	}
	public static void main(String arg[]) {
		new Celsius();
		}

}