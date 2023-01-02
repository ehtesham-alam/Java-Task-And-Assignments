import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MarkSheet2 extends Frame implements ActionListener {
	Frame Frame = new Frame();
	Label Label1 = new Label("#### M_A_R_K_S_H_E_E_T ####");
	Label Label2 = new Label("Enter Java Marks");
	Label Label3 = new Label("Enter Pythan Marks");
	Label Label4 = new Label("Enter HTML Marks");
	Label Label5 = new Label("Enter Dotnet Marks");
	Label Label6 = new Label("Enter C Marks");
	Label Label7 = new Label("Obtain Marks");
	Label Label8 = new Label("Total Marks");
	Label Label9 = new Label("Percentage");
	Label Label10 = new Label("Grade");
	TextField Textfield2 = new TextField();
	TextField Textfield3 = new TextField();
	TextField Textfield4 = new TextField();
	TextField Textfield5 = new TextField();
	TextField Textfield6 = new TextField();
	Label Label11 = new Label();
	Label Label12 = new Label();
	Label Label13 = new Label();
	Label Label14 = new Label();
	Label colorLabel = new Label();
	Button btncal = new Button("Calculate");
	Button btnclear = new Button("Clear");
    Button btnAbout = new Button("About");
	Button btnExit = new Button("Exit");
	
	
	MarkSheet2() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,1000,1000);
		Label1.setBounds(370,70,200,20);
		Label2.setBounds(350,120,100,20);
		Label3.setBounds(350,160,100,20);
		Label4.setBounds(350,200,100,20);
		Label5.setBounds(350,240,100,20);
		Label6.setBounds(350,280,100,20);
		Label7.setBounds(350,320,100,20);
		Label8.setBounds(350,360,100,20);
		Label9.setBounds(350,400,100,20);
		Label10.setBounds(350,440,100,20);
		Textfield2.setBounds(500,120,100,20);
		Textfield3.setBounds(500,160,100,20);
		Textfield4.setBounds(500,200,100,20);
		Textfield5.setBounds(500,240,100,20);
		Textfield6.setBounds(500,280,100,20);
		Label11.setBounds(500,320,100,20);
		Label12.setBounds(500,360,100,20);
		Label13.setBounds(500,400,100,20);
		Label14.setBounds(500,440,100,20);
		colorLabel.setBounds(20,100,300,300);
	    btncal.setBounds(350,480,60,20);
	    btnclear.setBounds(430,480,50,20);
	    btnAbout.setBounds(500,480,45,20);
	    btnExit.setBounds(565,480,35,20);
		
		Frame.setBackground(Color.black);
		Label1.setBackground(Color.orange);
	    Label2.setBackground(Color.yellow);
	    Label3.setBackground(Color.yellow);
		Label4.setBackground(Color.yellow);
		Label5.setBackground(Color.yellow);
		Label6.setBackground(Color.yellow);
		Label7.setBackground(Color.yellow);
		Label8.setBackground(Color.yellow);
		Label9.setBackground(Color.yellow);
		Label10.setBackground(Color.yellow);
		Label11.setBackground(Color.pink);
		Label12.setBackground(Color.pink);
		Label13.setBackground(Color.pink);
		Label14.setBackground(Color.pink);
		btncal.setBackground(Color.blue);
		btnclear.setBackground(Color.green);
		btnAbout.setBackground(Color.red);
		
		
		Frame.add(Label1);
		Frame.add(Label2);
		Frame.add(Label3);
		Frame.add(Label4);
		Frame.add(Label5);
		Frame.add(Label6);
		Frame.add(Label7);
		Frame.add(Label8);
		Frame.add(Label9);
		Frame.add(Label10);
		Frame.add(Textfield2);
		Frame.add(Textfield3);
		Frame.add(Textfield4);
		Frame.add(Textfield5);
		Frame.add(Textfield6);
		Frame.add(Label11);
		Frame.add(Label12);
		Frame.add(Label13);
		Frame.add(Label14);
		Frame.add(btncal);
	    Frame.add(btnclear);
		Frame.add(btnAbout);
		Frame.add(btnExit);
		
		Frame.setVisible(true);
		
		btncal.addActionListener(this);
		btnclear.addActionListener(this);
		btnAbout.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	
	

	public void actionPerformed(ActionEvent e) {

	if(e.getSource() == btncal) {
		int Total=500;
		int Grade;
		int percentage;
		int java = Integer.parseInt(Textfield2.getText());
		int  pythan = Integer.parseInt(Textfield3.getText());
		int html = Integer.parseInt(Textfield4.getText());
		int dotnet = Integer.parseInt(Textfield5.getText());
		int c = Integer.parseInt(Textfield6.getText());
		int sum =(java+pythan+dotnet+html+c);
		int Percentage = (sum*100)/Total;
		Label11.setText(sum+" ");
		Label12.setText(Total+" ");
		Label13.setText(Percentage+"%");
	
		if(Percentage>=80 && Percentage<=100) {
			
			 Label14.setText("A");
		  }
		else if(Percentage>=60 && Percentage<=79) {
			
			 Label4.setText("B");
		 }
		else if(Percentage>=50 && Percentage<=59) {
			
			 Label14.setText("C");
		}
		else if(Percentage>=40 && Percentage<=49) {
			
			 Label14.setText("D");
		}
		else if(Percentage>=10 && Percentage<=39){
			
			 Label14.setText("F");
		}
		try {
			FileWriter fw = new FileWriter("MarkSheetResult.txt", true);
			fw.write("Java Marks : "+java);
			fw.write('\n');
			fw.write("Pythan Marks : "+pythan);
			fw.write('\n');
			fw.write("HTML Marks : "+html);
			fw.write('\n');
			fw.write("Dotnet Marks : "+dotnet);
			fw.write('\n');
			fw.write("C Marks : "+c);
			fw.write('\n');
			fw.write("Total : "+Total);
			fw.write('\n');
			fw.write("Obtain :"+sum);
			fw.write('\n');
			fw.write("Percentage :"+Percentage+"%");
			fw.write('\n');
			//fw.write("Grade :"+A);
			fw.write('\n');
			fw.flush();
			fw.close();
		} catch (IOException ex)
		{
			System.out.println(ex);
			
		}
		
		
     }
     if(e.getSource() == btnclear) {
		
		Textfield2.setText(" ");
		Textfield3.setText(" ");
		Textfield2.setText(" ");
		Textfield4.setText(" ");
		Textfield5.setText(" ");
		Textfield6.setText(" ");
		Label11.setText(" ");
		Label12.setText(" ");
		Label13.setText(" ");
		Label14.setText(" ");
		  
		  
	 }
	  
	
	  if(e.getSource() == btnExit){
		   System.exit(0);
	   }
	   if(e.getSource() == btnAbout){
	   JOptionPane.showMessageDialog(null,"create by Jai");
	   }
	}
	public static void main(String arg[]) {
		new MarkSheet2();
		}

}