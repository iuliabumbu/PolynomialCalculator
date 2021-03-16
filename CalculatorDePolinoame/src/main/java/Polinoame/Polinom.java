package Polinoame;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom {
	private ArrayList<Monom> sir= new ArrayList<Monom>();
	
	   public ArrayList<Monom> getSir() {
		return sir;
	}

	
	public String afiseazaPolinom(Polinom p) {
		String s="";
		for(Monom q: p.getSir())
		s=s+q.toString();
		System.out.println(s);
		return s;
		
	}
	
	public String afiseazaPolinomReal(Polinom p) {
		String s="";
		for(Monom q: p.getSir())
		s=s+q.toStringReal();
		System.out.println(s);
		return s;
		
	}
	
	public Polinom parsarePolinom(String s) {
		Polinom p=new Polinom();
	    Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
		Matcher matcher = pattern.matcher(s);
	    ArrayList<Integer> v= new ArrayList<Integer>();    
			while (matcher.find()) {
			     String x=matcher.group(1)+"", r="", c="";
			     if(x.contains("x")) {   
			         int index=x.indexOf("x");
			         if(x.contains("*")) {
			        	 if(index==0) c="1";
			        	 else c=x.substring(0, index-1);
			    	      if(x.contains("^")) 
			                   r=x.substring(index+2, x.length());  
			    	      else    r="1"; }
			         else {
			        	 if(index==0) c="1";
			        	 else c=x.substring(0, index);
			    	     if(x.contains("^")) 
			                 r=x.substring(index+2, x.length()); 
			    	     else  r="1";  }
			     }
			     else { c=x;  r="0"; }		     
		    v.add(Integer.valueOf(c));    //citim coeficientul ca si intreg, chiar daca a fost declarat double
			v.add(Integer.valueOf(r)); }	
		int i=0;
	   while(i<v.size()) {
			Monom m=new Monom(v.get(i+1), v.get(i));
			p.getSir().add(m);
			i+=2;} 	
	   return p;	}
	
	public Polinom parsarePolinomReal(String s) {
		Polinom p=new Polinom();
	    Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
		Matcher matcher = pattern.matcher(s);
	    ArrayList<Double> v= new ArrayList<Double>();    
			while (matcher.find()) {
			     String x=matcher.group(1)+"", r="", c="";
			     if(x.contains("x")) {   
			         int index=x.indexOf("x");
			         if(x.contains("*")) {
			        	 if(index==0) c="1";
			        	 else c=x.substring(0, index-1);
			    	      if(x.contains("^")) 
			                   r=x.substring(index+2, x.length());  
			    	      else    r="1"; }
			         else {
			        	 if(index==0) c="1";
			        	 else c=x.substring(0, index);
			    	     if(x.contains("^")) 
			                 r=x.substring(index+2, x.length()); 
			    	     else  r="1";  }
			     }
			     else { c=x;  r="0"; }	
			     
		    v.add(Double.valueOf(c));   
			v.add(Double.valueOf(r)); }		
	   	for(int i=0; i<v.size();i+=2) {
			Monom m=new Monom(v.get(i+1).intValue(), v.get(i));
			p.getSir().add(m); } 	
	   return p;	
	}
	
	public Polinom adunarePolinoame(Polinom a, Polinom b) {
		Polinom c=new Polinom();
		 ArrayList<Monom> lista= new ArrayList<Monom>();
		for(Monom x: a.getSir())
			for(Monom y: b.getSir())
				if(x.getRang()==y.getRang())
				{
					double sum=x.getCoef()+y.getCoef();
					Monom m=new Monom(x.getRang(), sum);
					c.getSir().add(m);
					lista.add(x);
					lista.add(y);
				}
		a.getSir().removeAll(lista);
		b.getSir().removeAll(lista);
		c.getSir().addAll(a.getSir());
		c.getSir().addAll(b.getSir());
	    c.getSir().sort(null);
		return c;
	}
	
	public Polinom scaderePolinoame(Polinom a, Polinom b) {
		Polinom c=new Polinom();
		 ArrayList<Monom> lista= new ArrayList<Monom>();
		for(Monom x: a.getSir())
			for(Monom y: b.getSir())
				if(x.getRang()==y.getRang())
				{
					double dif=x.getCoef()-y.getCoef();
					Monom m=new Monom(x.getRang(), dif);
					c.getSir().add(m);
					lista.add(x);
					lista.add(y);
				}
		a.getSir().removeAll(lista);
		b.getSir().removeAll(lista);
		for(Monom y: b.getSir())
			y.setCoef(-y.getCoef());
		c.getSir().addAll(a.getSir());
		c.getSir().addAll(b.getSir());
	    c.getSir().sort(null);
		return c;
	}
	
	public Polinom inmultirePolinoame(Polinom a, Polinom b) {
		Polinom c=new Polinom();
		int i=a.getSir().get(0).getRang()*b.getSir().get(0).getRang()+2;
		ArrayList<Double> sum= new ArrayList<Double>();
		
		while(i>=0)
			{
			Monom m=new Monom(i--,0);
			c.getSir().add(m);	
			sum.add(0.0);
			}
		for(Monom x: a.getSir())
			{ for(Monom y: b.getSir())
		             sum.set(x.getRang()+y.getRang(), sum.get(x.getRang()+y.getRang())+x.getCoef()*y.getCoef());
		
			}
		
		for(i=0;i<sum.size();i++)
			c.getSir().get(sum.size()-i-1).setCoef( sum.get(i));
			
		return c;
	}
	
	public Polinom derivarePolinoame(Polinom a) {
		Polinom c=new Polinom();
		for(Monom x: a.getSir())
	        if(x.getRang()>=1)
			    {
					double val=x.getCoef()*x.getRang();
					Monom m=new Monom(x.getRang()-1, val);
					c.getSir().add(m);			
				}
	        else {
	        	Monom m=new Monom(x.getRang()-1, 0);
				c.getSir().add(m);
	        	
	        }
		return c;
	}
	
	public Polinom integrarePolinoame(Polinom a) {
		Polinom c=new Polinom();
		for(Monom x: a.getSir())
			  if(x.getRang()>=1)
			    {
					double val=x.getCoef()/(x.getRang()+1);
					Monom m=new Monom(x.getRang()+1, val);
					c.getSir().add(m);			
				}
			  else 
			   {	
					Monom m=new Monom(x.getRang()+1, x.getCoef());
					c.getSir().add(m);			
				}
		return c;
	}
	
	public Polinom impartirePolinoame(Polinom a, Polinom b) throws Exception {
		Polinom c=new Polinom(), q=new Polinom(), r=new Polinom(), t=new Polinom(), t1=new Polinom(), b1=new Polinom();
		a.getSir().sort(null);
		b.getSir().sort(null);
		q=q.parsarePolinomReal("0");
		r=r.parsarePolinomReal(a.afiseazaPolinomReal(a));
		b1=b1.parsarePolinomReal(b.afiseazaPolinomReal(b));
	    ArrayList<Monom> lista= new ArrayList<Monom>();
	    String ts="";
	    if(r.getSir().get(0).getRang() < b1.getSir().get(0).getRang())
	    	throw new Exception();
		while (r.getSir().get(0).getRang() >= b1.getSir().get(0).getRang() && r.getSir().get(0).getRang()!=0.0 && r.getSir().get(0).getCoef()!=0.0) {
			int dif=r.getSir().get(0).getRang()-  b1.getSir().get(0).getRang();
			double coef=r.getSir().get(0).getCoef()/ b1.getSir().get(0).getCoef();
			t=t.parsarePolinomReal(coef+"x^"+dif);
			ts=ts+t.afiseazaPolinomReal(t);
			t=t.inmultirePolinoame(b1, t);
			r=r.scaderePolinoame(r, t);
			q=q.adunarePolinoame(q, t);
			for(Monom x: r.getSir())	
			if(x.getCoef()==0)
				lista.add(x);	
			r.getSir().removeAll(lista);
			Monom e= new Monom(0,0);
			if(r.getSir().size()==0)
				r.getSir().add(e);
		}
		t1=t1.parsarePolinomReal(ts);
		c=c.parsarePolinomReal(t1.afiseazaPolinomReal(t1)+r.afiseazaPolinomReal(r));
		return c;
	}

}
