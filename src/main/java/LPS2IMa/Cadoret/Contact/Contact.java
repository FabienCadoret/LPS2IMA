package LPS2IMa.Cadoret.Contact;

public class Contact {
	private String nom;
	private String tel;
	
	public Contact(String nom, String tel) {
		this.setNom(nom);
		this.setTel(tel);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
