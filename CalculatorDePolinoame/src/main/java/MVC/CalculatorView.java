package MVC;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame {
	
private	JLabel l = new JLabel ("Polinom1: ");
private	JTextField tf = new JTextField("?Introduceti p1?");
private	JLabel l2 = new JLabel ("Polinom2: ");
private	JTextField tf2 = new JTextField("?Introduceti p2?");
private	JLabel l3 = new JLabel ("Rezultat: ");
private	JTextArea text = new JTextArea(1, 10);
private	JButton b1 = new JButton("Adunare");
private	JButton b2 = new JButton("Scadere");
private	JButton b3 = new JButton("Inmultire");
private	JButton b4 = new JButton("Impartire");
private	JButton b5 = new JButton("Derivare");
private	JButton b6 = new JButton("Integrare");
private JRadioButton p1 = new JRadioButton("P1");
private JRadioButton p2 = new JRadioButton("P2");
private ButtonGroup p = new ButtonGroup();

 CalculatorView(){
	 JFrame frame = new JFrame ("Calculator Polinoame:");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
 
        JPanel panel1 = new JPanel(); 
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		panel1.add(l);
		panel1.add(tf);
		panel2.add(l2);
		panel2.add(tf2);
		panel3.add(l3);
		panel3.add(text);
		panel4.add(b1);
		panel4.add(b2);
		panel5.add(b3);
		panel5.add(b4);
		panel6.add(b5);
		panel6.add(b6);
		panel6.add(p1);
		panel6.add(p2);
		
		p.add(p1);
		p.add(p2);
		l.setOpaque(true);
		l.setBackground(new Color(202,242,255));
		l2.setOpaque(true);	
		l2.setBackground(new Color(202,242,255));
		l3.setOpaque(true);
		l3.setBackground(new Color(202,242,255));
		b1.setBackground(new Color(202,242,255));
		b2.setBackground(new Color(202,242,255));
		b3.setBackground(new Color(202,242,255));
		b4.setBackground(new Color(202,242,255));
		b5.setBackground(new Color(202,242,255));
		b6.setBackground(new Color(202,242,255));
		p1.setBackground(new Color(191, 210, 255));
		p2.setBackground(new Color(191, 210, 255));
	
		
		JPanel panou = new JPanel();
   		panou.add(panel1);
   		panou.add(panel2);
   		panou.add(panel3);
   		panou.add(panel4);
   		panou.add(panel5);
   		panou.add(panel6);
   		panou.setLayout(new BoxLayout(panou, BoxLayout.Y_AXIS));
   		panel1.setBackground(new Color(191, 210, 255));
   		panel2.setBackground(new Color(191, 210, 255));
   		panel3.setBackground(new Color(191, 210, 255));
   		panel4.setBackground(new Color(191, 210, 255));
   		panel5.setBackground(new Color(191, 210, 255));
   		panel6.setBackground(new Color(191, 210, 255));
   		
   		frame.setContentPane(panou);
   		frame.setVisible(true); 
 }
 
 public JLabel getL() {
	return l;
}

public void setL(JLabel l) {
	this.l = l;
}

public JTextField getTf() {
	return tf;
}

public void setTf(JTextField tf) {
	this.tf = tf;
}

public JLabel getL2() {
	return l2;
}

public void setL2(JLabel l2) {
	this.l2 = l2;
}

public JTextField getTf2() {
	return tf2;
}

public void setTf2(JTextField tf2) {
	this.tf2 = tf2;
}

public JLabel getL3() {
	return l3;
}

public void setL3(JLabel l3) {
	this.l3 = l3;
}

public JTextArea getText() {
	return text;
}

public void setText(JTextArea text) {
	this.text = text;
}

public JButton getB1() {
	return b1;
}

public void setB1(JButton b1) {
	this.b1 = b1;
}

public JButton getB2() {
	return b2;
}

public void setB2(JButton b2) {
	this.b2 = b2;
}

public JButton getB3() {
	return b3;
}

public void setB3(JButton b3) {
	this.b3 = b3;
}

public JButton getB4() {
	return b4;
}

public void setB4(JButton b4) {
	this.b4 = b4;
}

public JButton getB5() {
	return b5;
}

public void setB5(JButton b5) {
	this.b5 = b5;
}

public JButton getB6() {
	return b6;
}

public void setB6(JButton b6) {
	this.b6 = b6;
}

public JRadioButton getP1() {
	return p1;
}

public void setP1(JRadioButton p1) {
	this.p1 = p1;
}

public JRadioButton getP2() {
	return p2;
}

public void setP2(JRadioButton p2) {
	this.p2 = p2;
}

public ButtonGroup getP() {
	return p;
}

public void setP(ButtonGroup p) {
	this.p = p;
}

void addB1Listener(ActionListener listenForB1){
	 b1.addActionListener( listenForB1);
	 }

void addB2Listener(ActionListener listenForB2){
b2.addActionListener( listenForB2);
}
void addB3Listener(ActionListener listenForB3){
b3.addActionListener( listenForB3);
}

void addB4Listener(ActionListener listenForB4){
	 b4.addActionListener( listenForB4);
	 }
 void addB5Listener(ActionListener listenForB5){
	 b5.addActionListener( listenForB5);
	 }
 void addB6Listener(ActionListener listenForB6){
	 b6.addActionListener( listenForB6);
	 }

}