package vjezbe;

public class Zaposleni{
	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;
	
	public Zaposleni(String ime,String prezime,int godineStaza,double plata){
	
		this.ime=ime;
		this.prezime=prezime;
		this.godineStaza=godineStaza;
		this.plata=plata;
		
	}
	

	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public int getGodineStaza() {
		return godineStaza;
	}


	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}


	public double getPlata() {
		return plata;
	}


	public void setPlata(double plata) {
		this.plata = plata;
	}
public void ispisi() {
	System.out.println("Ime;"+ime);
	System.out.println("Prezime:"+prezime);
	System.out.println("Godine staza:"+godineStaza);
	
}
public void povecajPlatu() {
	if (plata<800 && godineStaza>10) {
		plata = plata * 1.06;
	}
}
	public static void main(String[] args) {
        Zaposleni z1 = new Zaposleni("Sara", "Demic", 12, 750);
        Zaposleni z2 = new Zaposleni("Sumeja", "Murić", 8, 700);
        Zaposleni z3 = new Zaposleni("Damir", "Petrovic", 15, 900);

        
        z1.ispisi();
        z2.ispisi();
        z3.ispisi();

       
        System.out.println("Plata z1: " + z1.getPlata());

     
        z1.setPlata(780);

        System.out.println("Nova plata z1: " + z1.getPlata());

      
        z1.povecajPlatu();

        System.out.println("Plata nakon povecanja: " + z1.getPlata());
	}
}  
