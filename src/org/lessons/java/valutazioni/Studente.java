package org.lessons.java.valutazioni;

public class Studente {
	public int id;
	public int assenze;
	public double avg;
	
	Studente(int id, int assenze, double avg) {
		this.id = id;
		this.assenze = assenze;
		this.avg = avg;
		
	}
	
	public void getStudente() {
		System.out.println(this.id + " | " 
						   + this.assenze + " | "
						   + String.format("%.02f", this.avg)
						   + getBocciato()
						   + "\n-------------------");
	}
	
	public String getBocciato() {
		boolean promosso;
		
		if(this.assenze > 50) {
			promosso = false;
		}else if(this.assenze > 25 && this.assenze < 50 && this.avg > 2) {
			promosso = true;
		}else if(this.assenze < 25 && this.avg >= 2) {
			promosso = true;
		}else {
			promosso = true;
		}
		
		return promosso ? " promosso" : " bocciato";
	}

}
