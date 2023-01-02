import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;
import java.io.*;
import java.net.*;
import java.applet.*;


class Alphabates extends JFrame implements ActionListener {
	  JFrame fram = new JFrame("");
	  ImageIcon iconA = new ImageIcon("A.jpg");
	  JButton btnA = new JButton(iconA);
	  ImageIcon iconB = new ImageIcon("B.jpg");
	  JButton btnB = new JButton(iconB);
	  ImageIcon iconC = new ImageIcon("C.jpg");
	  JButton btnC = new JButton(iconC);
	  ImageIcon iconD = new ImageIcon("D.jpg");
	  JButton btnD = new JButton(iconD);
	  ImageIcon iconE = new ImageIcon("E.jpg");
	  JButton btnE = new JButton(iconE);
	  ImageIcon iconF = new ImageIcon("F.jpg");
	  JButton btnF = new JButton(iconF);
	  ImageIcon iconG = new ImageIcon("G.jpg");
	  JButton btnG = new JButton(iconG);
	  ImageIcon iconH = new ImageIcon("H.jpg");
	  JButton btnH = new JButton(iconH);
	  ImageIcon iconI = new ImageIcon("I.jpg");
	  JButton btnI = new JButton(iconI);
	  ImageIcon iconJ = new ImageIcon("J.jpg");
	  JButton btnJ = new JButton(iconJ);
	  ImageIcon iconK = new ImageIcon("K.jpg");
	  JButton btnK = new JButton(iconK);
	  ImageIcon iconL = new ImageIcon("L.jpg");
	  JButton btnL = new JButton(iconL);
	  ImageIcon iconM = new ImageIcon("M.jpg");
	  JButton btnM = new JButton(iconM);
	  ImageIcon iconN = new ImageIcon("N.jpg");
	  JButton btnN = new JButton(iconN);
	  ImageIcon iconO = new ImageIcon("O.jpg");
	  JButton btnO = new JButton(iconO);
	  ImageIcon iconP = new ImageIcon("P.jpg");
	  JButton btnP = new JButton(iconP);
	  ImageIcon iconQ = new ImageIcon("Q.jpg");
	  JButton btnQ = new JButton(iconQ);
	  ImageIcon iconR = new ImageIcon("R.jpg");
	  JButton btnR = new JButton(iconR);
	  ImageIcon iconS = new ImageIcon("S.jpg");
	  JButton btnS = new JButton(iconS);
	  ImageIcon iconT = new ImageIcon("T.jpg");
	  JButton btnT = new JButton(iconT);
	  ImageIcon iconU = new ImageIcon("U.jpg");
	  JButton btnU = new JButton(iconU);
	  ImageIcon iconV = new ImageIcon("V.jpg");
	  JButton btnV = new JButton(iconV);
	  ImageIcon iconW = new ImageIcon("W.jpg");
	  JButton btnW = new JButton(iconW);
	  ImageIcon iconX = new ImageIcon("X.jpg");
	  JButton btnX = new JButton(iconX);
	  ImageIcon iconY = new ImageIcon("Y.jpg");
	  JButton btnY = new JButton(iconY);
	  ImageIcon iconZ = new ImageIcon("Z.jpg");
	  JButton btnZ = new JButton(iconZ);
	  
	  Alphabates(){
	        fram.setLayout(null);
			fram.setBounds(0,0,1340,1400);
			btnA.setBounds(0,0,170,130);
			btnB.setBounds(190,0,170,130);
			btnC.setBounds(380,0,170,130);
			btnD.setBounds(570,0,170,130);
			btnE.setBounds(760,0,170,130);
			btnF.setBounds(950,0,170,130);
			btnG.setBounds(1140,0,170,130);
			btnH.setBounds(0,145,170,130);
			btnI.setBounds(190,145,170,130);
			btnJ.setBounds(380,145,170,130);
			btnK.setBounds(570,145,170,130);
			btnL.setBounds(760,145,170,130);
			btnM.setBounds(950,145,170,130);
			btnN.setBounds(1140,145,170,130);
			btnO.setBounds(0,290,170,130);
			btnP.setBounds(190,290,170,130);
			btnQ.setBounds(380,290,170,130);
			btnR.setBounds(570,290,170,130);
			btnS.setBounds(760,290,170,130);
			btnT.setBounds(950,290,170,130);
			btnU.setBounds(1140,290,170,130);
			btnV.setBounds(190,440,170,130);
			btnW.setBounds(380,440,170,130);
			btnX.setBounds(570,440,170,130);
			btnY.setBounds(760,440,170,130);
			btnZ.setBounds(950,440,170,130);
			   
			   fram.add(btnA);
			   fram.add(btnB);
			   fram.add(btnC);
			   fram.add(btnD);
			   fram.add(btnE);
			   fram.add(btnF);
			   fram.add(btnG);
			   fram.add(btnH);
			   fram.add(btnI);
			   fram.add(btnJ);
			   fram.add(btnK);
			   fram.add(btnL);
			   fram.add(btnM);
			   fram.add(btnN);
			   fram.add(btnO);
			   fram.add(btnP);
			   fram.add(btnQ);
			   fram.add(btnR);
			   fram.add(btnS);
			   fram.add(btnT);
			   fram.add(btnU);
			   fram.add(btnV);
			   fram.add(btnW);
			   fram.add(btnX);
			   fram.add(btnY);
			   fram.add(btnZ);
			   
			   fram.setVisible(true);
			   
			   //btnA.addActionListener(this);
		       btnB.addActionListener(this);
		       btnC.addActionListener(this);
		       btnD.addActionListener(this);
		       btnE.addActionListener(this);
		       btnF.addActionListener(this);
		       btnG.addActionListener(this);
			   btnH.addActionListener(this);
			   btnI.addActionListener(this);
			   btnJ.addActionListener(this);
			   btnK.addActionListener(this);
			   btnL.addActionListener(this);
	           btnM.addActionListener(this);
			   btnN.addActionListener(this);
			   btnO.addActionListener(this);
               btnP.addActionListener(this);
			   btnQ.addActionListener(this);
			   btnR.addActionListener(this);
			   btnS.addActionListener(this);
			   btnT.addActionListener(this);
			   btnU.addActionListener(this);
			   btnV.addActionListener(this);
			   btnW.addActionListener(this);
			   btnX.addActionListener(this);
			   btnY.addActionListener(this);
			   btnZ.addActionListener(this);
			}
			
			public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnA) {
				A a = new A();
				a.start();
				//btnA.setIcon(null);
				//btnA.setEnabled(false);
			}
			if(e.getSource() == btnB) {
				B b = new B();
				b.start();
				//btnB.setIcon(null);
				//btnB.setEnabled(false);
				
			}
			if(e.getSource() == btnC) {
				C c = new C();
				c.start();
				//btnB.setIcon(null);
				//btnB.setEnabled(false);
				
			}
			if(e.getSource() == btnD) {
				D d = new D();
				d.start();
				//btnD.setIcon(null);
				//btnD.setEnabled(false);
			 
			}
			if(e.getSource() == btnE) {
				E ea = new E();
				ea.start();
				//btnE.setIcon(null);
				//btnE.setEnabled(false);
			}
			if(e.getSource() == btnF) {
				F f = new F();
				f.start();
				//btnF.setIcon(null);
				//btnF.setEnabled(false);
			}
			if(e.getSource() == btnG) {
				G g = new G();
				g.start();
				//btnG.setIcon(null);
				//btnG.setEnabled(false);
			}
			if(e.getSource() == btnH) {
			    H h = new H();
				h.start();
				//btnH.setIcon(null);
				//btnH.setEnabled(false);	
			}
			if(e.getSource() == btnI) {
				I i = new I();
				i.start();
				//btnI.setIcon(null);
				//btnI.setEnabled(false);A a = new A();
			}
			if(e.getSource() == btnJ) {
				J j = new J();
				j.start();
				//btnJ.setIcon(null);
				//btnJ.setEnabled(false);
			}
			if(e.getSource() == btnK) {
				K k = new K();
				k.start();
				//btnK.setIcon(null);
				//btnK.setEnabled(false);
				
			}
			if(e.getSource() == btnL) {
				L l = new L();
				l.start();
				//btnL.setIcon(null);
				//btnL.setEnabled(false);
			}
			if(e.getSource() == btnM) {
				M m = new M();
				m.start();
				//btnM.setIcon(null);
				//btnM.setEnabled(false);
			}
			if(e.getSource() == btnN) {
				N n = new N();
				n.start();
				//btnN.setIcon(null);
				//btnN.setEnabled(false);
			}
			if(e.getSource() == btnO) {
				O o = new O();
				o.start();
				//btnO.setIcon(null);
				//btnO.setEnabled(false);
			}
			if(e.getSource() == btnP) {
				P p = new P();
				p.start();
				//btnP.setIcon(null);
				//btnP.setEnabled(false);
			}
			if(e.getSource() == btnQ) {
				Q q = new Q();
				q.start();
				//btnQ.setIcon(null);
				//btnQ.setEnabled(false);
			}
			if(e.getSource() == btnR) {
				R r = new R();
				r.start();
				//btnR.setIcon(null);
				//btnR.setEnabled(false);
			}
			if(e.getSource() == btnS) {
				S s = new S();
				s.start();
				//btnS.setIcon(null);
				//btnS.setEnabled(false);
			}
			if(e.getSource() == btnT) {
				T t = new T();
				t.start();
				//btnT.setIcon(null);
				//btnT.setEnabled(false);
			}
			if(e.getSource() == btnU) {
				U u = new U();
				u.start();
				//btnU.setIcon(null);
				//btnU.setEnabled(false);
			}
			if(e.getSource() == btnV) {
				V v = new V();
				v.start();
				//btnV.setIcon(null);
				//btnV.setEnabled(false);
			}
			if(e.getSource() == btnW) {
				W w = new W();
				w.start();
				//btnW.setIcon(null);
				//btnW.setEnabled(false);
			}
			if(e.getSource() == btnX) {
				X x = new X();
				x.start();
				//btnX.setIcon(null);
				//btnX.setEnabled(false);
			}
			if(e.getSource() == btnY) {
				Y y = new Y();
				y.start();
				//btnY.setIcon(null);
				//btnY.setEnabled(false);
			}
			if(e.getSource() == btnZ) {
				Z z = new Z();
				z.start();
				//btnZ.setIcon(null);
				//btnZ.setEnabled(false);
			}
		}
			
	    public static void main(String arg[]) {
	  
	          new Alphabates();
		}
}

class A extends Thread {
	public void run() {
		try {
			File file = new File("A.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class B extends Thread {
	public void run() {
		try {
			File file = new File("B.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class C extends Thread {
	public void run() {
		try {
			File file = new File("C.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class D extends Thread {
	public void run() {
		try {
			File file = new File("D.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class E extends Thread {
	public void run() {
		try {
			File file = new File("E.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class F extends Thread {
	public void run() {
		try {
			File file = new File("F.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class G extends Thread {
	public void run() {
		try {
			File file = new File("G.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class H extends Thread {
	public void run() {
		try {
			File file = new File("H.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class I extends Thread {
	public void run() {
		try {
			File file = new File("I.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class J extends Thread {
	public void run() {
		try {
			File file = new File("J.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class K extends Thread {
	public void run() {
		try {
			File file = new File("K.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class L extends Thread {
	public void run() {
		try {
			File file = new File("L.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class M extends Thread {
	public void run() {
		try {
			File file = new File("M.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class N extends Thread {
	public void run() {
		try {
			File file = new File("N.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class O extends Thread {
	public void run() {
		try {
			File file = new File("O.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class P extends Thread {
	public void run() {
		try {
			File file = new File("P.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class Q extends Thread {
	public void run() {
		try {
			File file = new File("Q.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class R extends Thread {
	public void run() {
		try {
			File file = new File("R.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class S extends Thread {
	public void run() {
		try {
			File file = new File("S.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class T extends Thread {
	public void run() {
		try {
			File file = new File("T.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class U extends Thread {
	public void run() {
		try {
			File file = new File("U.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class V extends Thread {
	public void run() {
		try {
			File file = new File("V.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class W extends Thread {
	public void run() {
		try {
			File file = new File("W.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class X extends Thread {
	public void run() {
		try {
			File file = new File("X.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class Y extends Thread {
	public void run() {
		try {
			File file = new File("Y.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
class Z extends Thread {
	public void run() {
		try {
			File file = new File("Z.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}
