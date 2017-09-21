package LPS2IMa.Cadoret;
import LPS2IMa.Cadoret.Contact.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testFonctionnelContactService {


	private ContactService service ; 
	@Before
	public void setUp() {
		service = new ContactService() ;
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSupprimerContactOk() {
		service.supprimerContact(null);
	
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSupprimerContactWithError() {
		Contact c = new Contact("Cad","0");
		service.supprimerContact(c);
	
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameVide() {
		service.creerContact("", "0200220202");
	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameNull() {
		service.creerContact(null, "0200220202");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameBadLength() {
		service.creerContact("Ca", "0200220202");
	}
	
	@Test 
	public void testCreerContactWithNameValideLimite() {
		service.creerContact("Cad", "0200220202");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithTelNull() {
		service.creerContact("Cad", null);
	}
	@Test 
	public void testCreerContactWithNomCasLimite() {
		service.creerContact("azertyuiopmlkjhgfdsqwxcvbnbvcxwmlkjhgfds", "0200220202");
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNomCasToLong() {
		service.creerContact("azertyuiopmlkjhgfdsqwxcvbnbvcxwmlkjhgfdsa", "0200220202");
	}
	@Test (expected = IllegalStateException.class)
	public void testCreerContactWithDoublon() {
		service.creerContact("Cadoret", "0200220202");
		service.creerContact("Cadoret", "0200220202");
	}


}
