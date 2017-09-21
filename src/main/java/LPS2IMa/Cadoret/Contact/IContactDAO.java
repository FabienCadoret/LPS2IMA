package LPS2IMa.Cadoret.Contact;

public interface IContactDAO {
	public boolean isContactExist(String nom);
	public Contact recupereContact(String nom);
	public void creerContact(Contact contact);
	public Contact supprimerContact(String nom);
}
