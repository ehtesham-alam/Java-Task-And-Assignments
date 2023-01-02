import java.awt.*;
import java.awt.event.*;

class MeterToKm extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label = new Label("Enter Meter");
	Button Button = new Button("convert to KiloMeter");
	Label Label2 = new Label("Result:");
	TextField Textfield = new TextField();
	Label Label3 = new Label();
	
	
	MeterToKm() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Label.setBounds(20,60,80,20);
		Button.setBounds(60,110,160,30);
		Label2.setBounds(20,180,50,20);
		Textfield.setBounds(100,55,80,30);
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
			String meter = Textfield.getText();
			int mt = Integer.parseInt(meter);
			double result = mt * 0.001;
			Label3.setText(result+"");
		  }
	}
	public static void main(String arg[]) {
		new MeterToKm();
		}

}