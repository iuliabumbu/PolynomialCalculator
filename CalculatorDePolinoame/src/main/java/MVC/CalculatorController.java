package MVC;

import Polinoame.Polinom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalculatorController {
	private CalculatorView theView;
	public CalculatorController(CalculatorView theView) {
			this.theView = theView;
			this.theView.addB1Listener(new B1Listener());
			this.theView.addB2Listener(new B2Listener());
			this.theView.addB3Listener(new B3Listener());
			this.theView.addB4Listener(new B4Listener());
			this.theView.addB5Listener(new B5Listener());
			this.theView.addB6Listener(new B6Listener());
		
			}
	public class B1Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

				try {
				String t=theView.getTf().getText();
				String t2=theView.getTf2().getText();
				Polinom p=new Polinom();
				Polinom q=new Polinom();
				Polinom rez=new Polinom();
				p=p.parsarePolinom(t);
				q=q.parsarePolinom(t2);
				rez=rez.adunarePolinoame(p,q);
				theView.getText().setText(rez.afiseazaPolinom(rez));
				} catch (Exception ex) {
				  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
					
				}
		}
	}

		public class B2Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

					try {
					String t=theView.getTf().getText();
					String t2=theView.getTf2().getText();
					Polinom p=new Polinom();
					Polinom q=new Polinom();
					Polinom rez=new Polinom();
					p=p.parsarePolinom(t);
					q=q.parsarePolinom(t2);
					rez=rez.scaderePolinoame(p,q);
					theView.getText().setText(rez.afiseazaPolinom(rez));
					} catch (Exception ex) {
					  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
						
					}
			}
		}
		
		public class B3Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

					try {
					String t=theView.getTf().getText();
					String t2=theView.getTf2().getText();
					Polinom p=new Polinom();
					Polinom q=new Polinom();
					Polinom rez=new Polinom();
					p=p.parsarePolinom(t);
					q=q.parsarePolinom(t2);
					rez=rez.inmultirePolinoame(p,q);
					theView.getText().setText(rez.afiseazaPolinom(rez));
					} catch (Exception ex) {
					  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
						
					}
			}
		}
		
		public class B4Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

					try {
					String t=theView.getTf().getText();
					String t2=theView.getTf2().getText();
					Polinom p=new Polinom();
					Polinom q=new Polinom();
					Polinom rez=new Polinom();
					p=p.parsarePolinom(t);
					q=q.parsarePolinom(t2);
					rez=rez.impartirePolinoame(p,q);
					theView.getText().setText(rez.afiseazaPolinomReal(rez));
					} catch (Exception ex) {
					  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
						
					}
			}
		}
		
		public class B5Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				try {
	   				String t="";
	   				if(theView.getP1().isSelected()) {
	   				    t=theView.getTf().getText();
	   				
	   				}
	   				else if(theView.getP2().isSelected()) {
	   				    t=theView.getTf2().getText();
	   				 	   				}
	   				
	   				Polinom p=new Polinom();
	   				Polinom rez=new Polinom();
	   				p=p.parsarePolinom(t);
	   				rez=rez.derivarePolinoame(p);
	   				theView.getText().setText(rez.afiseazaPolinom(rez));
	   			} catch (Exception ex) {
					  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
						
					}
	   			
			}
		}
		
		public class B6Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				try {
					String t="";
	   				if(theView.getP1().isSelected()) {
	   				    t=theView.getTf().getText();
	   			
	   				}
	   				else if(theView.getP2().isSelected()) {
	   				    t=theView.getTf2().getText();
	   				 
	   				}
	   				Polinom p=new Polinom();
	   				Polinom rez=new Polinom();
	   				p=p.parsarePolinom(t);
	   				rez=rez.integrarePolinoame(p);
	   				theView.getText().setText(rez.afiseazaPolinomReal(rez));
	   			} catch (Exception ex) {
					  	JOptionPane.showMessageDialog(null, "Eroare! Verifica daca ai introdus corect polinoamele");
						
					}
	   			
			}
		}
		
}
