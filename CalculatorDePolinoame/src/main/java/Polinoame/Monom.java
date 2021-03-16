package Polinoame;

public class Monom implements Comparable<Monom>{
	private int rang;
	private double coef;
	
	public Monom(int rang, double coef) {
		this.rang = rang;
		this.coef = coef;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}
	
	 public String toString() {
		    String s="";
	        if (rang ==  0) {
	        	if(coef>=0) s=s +"+"+(int)coef;
	        	
	        	else s=s+(int)coef;
	        	}
	        else if (rang ==  1) {

	            if(coef>=0) s=s +"+"+(int)coef+"x";
	        	
	        	else  s=s+(int)coef+"x";
	        	}
	        else {
	        	if(coef==0) s+="";
	            else if(coef>0)
	        	     s=s +"+"+(int)coef+"x^"+rang;  
	            else s=s+(int)coef+"x^"+rang;
	            }
	        return s;
	    }
	 
	 public String toStringReal() {
		    String s="";
	        if (rang ==  0) {
	        	if(coef>=0) s=s +"+"+String.format("%.2f", coef);
	        	
	        	else s=s+String.format("%.2f", coef);
	        	}
	        else if (rang ==  1) {

	            if(coef>=0) s=s +"+"+String.format("%.2f", coef)+"x";
	        	
	        	else  s=s+String.format("%.2f", coef)+"x";
	        	}
	        else {
	        	if(coef==0) s+="";
	            else if(coef>0)
	        	     s=s +"+"+String.format("%.2f", coef)+"x^"+rang;  
	            else s=s+String.format("%.2f", coef)+"x^"+rang;
	            }
	        return s;
	    }

	public int compareTo(Monom o) {
		if(this.rang>o.rang)
			return -1;
		else if(this.rang<o.rang)
			return 1;
		else return 0;
	}
	
	

}
