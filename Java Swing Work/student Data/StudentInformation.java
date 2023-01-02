 //importa.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudentInformation extends JFrame implements ActionListener {
	JFrame Frame = new JFrame();
	JButton btnShow = new JButton("Show Info");
	JLabel lbPhoto = new  JLabel("");
	JComboBox combo = new JComboBox();
	JLabel lbName = new JLabel("Name");
	JLabel  lbSurname = new JLabel("Surname");
	JLabel  lbDepart =  new JLabel("Department");
	JLabel  lbContect = new JLabel("Contect");
	JTextField textName = new JTextField();
	JTextField textSurname = new JTextField();
	JTextField textDepart  = new JTextField();
	JTextField textContect = new JTextField();
	JLabel lbGender = new JLabel("Gender");
	JLabel lbFname = new JLabel("Father Name");
	JLabel lbRoll = new JLabel("Roll No");
	JLabel lbUni = new JLabel("University");
	JLabel lbEmail = new JLabel("Email");
	JTextField textFname = new JTextField();
	JTextField textRoll = new JTextField();
	JTextField textUni = new JTextField();
	JTextField textEmail = new JTextField();
	JLabel lbFavColor = new JLabel("Favourite color");
	JRadioButton rbMale = new JRadioButton("Male");
	JRadioButton rbFemale = new JRadioButton("Female");
	ButtonGroup bgroup = new ButtonGroup();
	JCheckBox chBoxRed = new JCheckBox(" Red");
	JCheckBox chBoxYellow = new JCheckBox(" Yellow");
	JCheckBox chBoxBlack = new JCheckBox(" Black");
	JCheckBox chBoxOrange = new JCheckBox(" Orange");
	ImageIcon kumar = new ImageIcon("kumar.jpg");
	ImageIcon akash = new ImageIcon("Akash.jpg");
	ImageIcon rajesh = new ImageIcon("Rajesh.jpg");
	ImageIcon sanjay = new ImageIcon("Sanjay.jpg");
    String str1 = "Sanjai Kumar";
	String str2 = "Hotchand";
	String str3 = "Khatri";
	String str4 = "2K18/CSE/106";
	String str5 = "Computer Science";
	String str6 = "Sindh University";
	String str7 = "03320328447";
	String str8 = "skkhatri948@gmail.com";
	
	StudentInformation() {
		Frame.setLayout(null);
		Frame.setBounds(0,0,820,500);
		combo.setBounds(50,30,100,20);
		btnShow.setBounds(200,30,100,30);
		lbPhoto.setBounds(600,30,200,200);
		lbName.setBounds(50,80,200,20);
		lbSurname.setBounds(50,120,200,20);
		lbDepart.setBounds(50,160,200,20);
		lbContect.setBounds(50,200,200,20);
		lbGender.setBounds(50,240,100,20);
		textName.setBounds(120,80,100,20);
		textSurname.setBounds(120,120,100,20);
		textDepart.setBounds(120,160,110,20);
		textContect.setBounds(120,200,100,20);
		lbFname.setBounds(350,80,200,20);
		lbRoll.setBounds(350,120,200,20);
		lbUni.setBounds(350,160,200,20);
		lbEmail.setBounds(350,200,200,20);
		textFname.setBounds(430,80,100,20);
		textRoll.setBounds(430,120,100,20);
		textUni.setBounds(430,160,100,20);
		textEmail.setBounds(430,200,155,20);
		lbFavColor.setBounds(350,240,100,20);
		rbMale.setBounds(110,240,80,20);
		rbFemale.setBounds(190,240,100,20);
		chBoxRed.setBounds(450,240,50,20);
		chBoxYellow.setBounds(500,240,70,20);
		chBoxBlack.setBounds(568,240,60,20);
		chBoxOrange.setBounds(630,240,110,20);
		
		
		combo.addItem("Sanjai");
		combo.addItem("Akash");
		combo.addItem("Rajesh");
		combo.addItem("Sanjay");
		combo.addItem("Kavita");
		
		bgroup.add(rbFemale);
		bgroup.add(rbMale);
		
		
		Frame.add(btnShow);
		Frame.add(combo);
		Frame.add(lbName);
		Frame.add(lbSurname);
		Frame.add(lbDepart);
		Frame.add(lbContect);
		Frame.add(lbGender);
		Frame.add(textName);
		Frame.add(textSurname);
		Frame.add(textDepart);
		Frame.add(textContect);
		Frame.add(lbFname);
		Frame.add(lbRoll);
		Frame.add(lbUni);
		Frame.add(lbEmail);
		Frame.add(textFname);
		Frame.add(textRoll);
		Frame.add(textUni);
		Frame.add(textEmail);
		Frame.add(lbFavColor);
		Frame.add(rbMale);
		Frame.add(rbFemale);
		Frame.add(chBoxRed);
		Frame.add(chBoxYellow);
		Frame.add(chBoxBlack);
		Frame.add(chBoxOrange);
		Frame.add(lbPhoto);
	
	   Frame.setVisible(true);
	   
	   btnShow.addActionListener(this);
	   combo.addActionListener(this);
	 }
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnShow || e.getSource() == combo) {
			String item = combo.getSelectedItem().toString();
			if(item.equals("Sanjai"))  {
                textName.setText("Sanjai kumar");
				textFname.setText("Hotchand");
				textSurname.setText("Khatri");
				textRoll.setText("2k18/CSE/106");
				textDepart.setText("Computer Science");
				textUni.setText("Sindh University");
				textContect.setText("03320328447");
				textEmail.setText("skkhatri948gmail.com");
				lbPhoto.setIcon(kumar);
				rbMale.setSelected(true);
				chBoxRed.setSelected(true);
			}
			 if(item.equals("Akash")) {
				textName.setText("Akash Kumar");
				textFname.setText("Kanaya Lal");
				textSurname.setText("Khatri");
				textRoll.setText("2k15/CSE/11");
				textDepart.setText("Computer Science");
				textUni.setText("Sindh University");
				textContect.setText("03360231273");
				textEmail.setText("akaskkhatri34@gmail.com");
				lbPhoto.setIcon(akash);
				rbMale.setSelected(true);
				chBoxOrange.setSelected(true);
				chBoxRed.setSelected(false);
				chBoxYellow.setSelected(true);
			}
			 if(item.equals("Rajesh")) {
				textName.setText("Rajesh Kumar");
				textFname.setText("Govrishanker");
				textSurname.setText("Khatri");
				textRoll.setText("2k14/pha/136");
				textDepart.setText("Pharmacy");
				textUni.setText("Sindh University");
				textContect.setText("03337132331");
				textEmail.setText("rajeshshanker2012@gmail.com");
				lbPhoto.setIcon(rajesh);
				rbMale.setSelected(true);
				chBoxYellow.setSelected(true);
				chBoxBlack.setSelected(true);
			}
			 if(item.equals("Sanjay")) {
				textName.setText("Sanjay kumar");
				textFname.setText("Tanu Mal");
				textSurname.setText("Mahli");
				textRoll.setText("2k17/eco/93");
				textDepart.setText("Ecnomic");
				textUni.setText("Sindh University");
				textContect.setText("0333263537");
				textEmail.setText("sk8201980@gmail.com");
				lbPhoto.setIcon(sanjay);
				rbMale.setSelected(true);
				chBoxOrange.setSelected(false);
				chBoxBlack.setSelected(true);
				chBoxYellow.setSelected(false);
			}
		     if(item.equals("Kavita")) {
				textName.setText("Kavita Bai");
				textFname.setText("Hotchand");
				textSurname.setText("Khatri");
				textRoll.setText("2k18/CSE/51");
				textDepart.setText("Computer Science");
				textUni.setText("Sindh University");
				textContect.setText("03378054702");
				textEmail.setText("2k18csm51@gmail.com");
				lbPhoto.setIcon(null);
				rbFemale.setSelected(true);
				chBoxYellow.setSelected(false);
				chBoxOrange.setSelected(true);
				chBoxRed.setSelected(true);
			}
		}
	}
		
	public static void main(String arg[]) {
		new StudentInformation();
		}

}
		
	