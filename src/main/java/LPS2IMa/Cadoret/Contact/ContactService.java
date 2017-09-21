package LPS2IMa.Cadoret.Contact;

public class ContactService {
    private IContactDAO contactDAO = new ContactDAO();

    public void creerContact(String nom, String tel) throws IllegalArgumentException {
        if (nom != null && tel != null && nom.length() > 2 && nom.length() < 41) {
            if (contactDAO.isContactExist(nom)) {
                throw new IllegalStateException("Doublon");
            }
            Contact contact = new Contact(nom, tel);
            contactDAO.creerContact(contact);
        } else {
            throw new IllegalArgumentException("Nom ou tel invalide");
        }
    }

    public void supprimerContact(Contact c) {
        String nom = c.getNom();
        contactDAO.supprimerContact(nom);
    }
}
