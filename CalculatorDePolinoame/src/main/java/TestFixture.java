import Polinoame.Polinom;
import junit.framework.TestCase;

public class TestFixture extends TestCase {
	public Polinom p1,p2;
	
	public void setUp() {
		
		String s="x^3+3x^2-4x+7";
	    p1=new Polinom();
		p1=p1.parsarePolinom(s);
	   
	    String s2="5x^2+2x-5";
	    p2=new Polinom();
		p2=p2.parsarePolinom(s2);
 	    System.out.println("Incepem un nou test:\n");
 		
	}
	public void testAdunare() {
		   Polinom rez=new Polinom();
		   rez=rez.adunarePolinoame(p1, p2);
		   assertTrue(rez.afiseazaPolinom(rez).equals("+1x^3+8x^2-2x+2"));

			
	}
	public void testScadere() {
		 Polinom rez=new Polinom();
		 rez=rez.scaderePolinoame(p1, p2);
		 assertTrue(rez.afiseazaPolinom(rez).equals("+1x^3-2x^2-6x+12"));

	}
	
	public void testInmultire() {
		   Polinom rez=new Polinom();
		   rez=rez.inmultirePolinoame(p1, p2);
		   assertTrue(rez.afiseazaPolinom(rez).equals("+5x^5+17x^4-19x^3+12x^2+34x-35"));

			
	}
	public void testImpartire() {
		 Polinom rez=new Polinom();
		 try {
			rez=rez.impartirePolinoame(p1, p2);
		} catch (Exception e) {
			System.out.println("Eroare la gradul polinoamelor!");
		}
		 assertTrue(rez.afiseazaPolinomReal(rez).equals("+0.20x+0.52-4.04x+9.60"));

	}
	public void testDerivare() {
		   Polinom rez=new Polinom();
		   rez=rez.derivarePolinoame(p1);
		   assertTrue(rez.afiseazaPolinom(rez).equals("+3x^2+6x-4"));

			
	}
	public void testIntegrare() {
		   Polinom rez=new Polinom();
		   rez=rez.integrarePolinoame(p1);
		   assertTrue(rez.afiseazaPolinomReal(rez).equals("+0.25x^4+1.00x^3-2.00x^2+7.00x"));

			
	}
	
	 public void tearDown(){
		
		  System.out.println("S-a incheiat un test!\n");
		}

}

