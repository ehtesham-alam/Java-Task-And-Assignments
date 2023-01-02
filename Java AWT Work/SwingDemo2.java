import java.awt.*;

class SwingDemo2 extends Frame {
	Frame  Frame = new Frame();
	Button Button = new Button("ADD");
	Label  Lable = new Label("Enter first value");
	Label  Lable2 = new Label("Enter second value");
	TextField Taxtfield = new TextField();
	TextField Taxtfield2 = new TextField();
	
	
	SwingDemo2() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,300,250);
		Lable.setBounds(20,40,100,20);
		Lable2.setBounds(20,80,120,20);
		Taxtfield.setBounds(120,35,100,30);
		Taxtfield2.setBounds(140,75,100,30);
		Button.setBounds(20,140,70,30);
		
		
		Frame.add(Lable);
		Frame.add(Lable2);
		Frame.add(Taxtfield);
		Frame.add(Taxtfield2);
		Frame.add(Button);
		
	    Frame.setVisible(true);
		
			
	}
	public static void main(String arg[]) {
		new SwingDemo2();
		}

}