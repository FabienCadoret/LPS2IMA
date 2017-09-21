package LPS2IMa.Cadoret.Contact;

public interface IContactDAO {
    boolean isContactExist(String nom);

    Contact recupereContact(String nom);

    void creerContact(Contact contact);

    Contact supprimerContact(String nom);
}
