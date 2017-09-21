package LPS2IMa.Cadoret.Contact;

import java.util.ArrayList;

public class ContactDAO implements IContactDAO {
    private ArrayList<Contact> contacts;

    public ContactDAO() {
        this.contacts = new ArrayList<Contact>();
    }

    public void creerContact(Contact contact) {
        if (contact != null && !isContactExist(contact.getNom())) {
            contacts.add(contact);
            System.out.println("Contact creer");
        } else {

            throw new IllegalStateException("Doublon");
        }

    }

    public boolean isContactExist(String nom) {
        boolean result = false;
        int i = 0;
        while (!result && contacts.size() > i) {
            if (contacts.get(i).getNom().equals(nom)) {
                result = true;
            }
            i++;
        }
        return result;
    }

    public Contact recupereContact(String nom) {
        Contact unContact = null;
        boolean result = false;
        int i = 0;
        while (!result && contacts.size() > i) {
            if (contacts.get(i).getNom() == nom) {
                unContact = contacts.get(i);

                result = true;
            }
            i++;
        }
        return unContact;

    }

    public Contact supprimerContact(String nom) {
        Contact unContact = null;
        boolean result = false;
        int i = 0;
        if (nom != null) {
            if (!isContactExist(nom)) {
                throw new IllegalArgumentException("Contact non existant");
            } else {
                while (!result && contacts.size() > i) {
                    if (contacts.get(i).getNom() == nom) {
                        unContact = contacts.remove(i);
                        System.out.println("Contact suprimer");
                        result = true;
                    }
                    i++;
                }
            }
        }
        return unContact;

    }
}
