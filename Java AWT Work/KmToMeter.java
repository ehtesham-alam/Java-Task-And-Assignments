import java.awt.*;
import java.awt.event.*;

class KmToMeter extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label = new Label("Enter KiloMeter");
	Button Button = new Button("convert to Meter");
	Label Label2 = new Label("Result:");
	TextField Textfield = new TextField();
	Label Label3 = new Label();
	
	KmToMeter() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Label.setBounds(20,60,100,20);
		Button.setBounds(60,110,140,30);
		Label2.setBounds(20,180,50,20);
		Textfield.setBounds(120,55,80,30);
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
			String km = Textfield.getText();
			int kmm = Integer.parseInt(km);
			int result = kmm * 1000;
			Label3.setText(result+"");
		}
	}
	public static void main(String arg[]){
        new KmToMeter();		
	}
}