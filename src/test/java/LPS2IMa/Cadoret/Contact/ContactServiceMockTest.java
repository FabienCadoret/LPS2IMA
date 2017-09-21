package LPS2IMa.Cadoret.Contact;
import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

import junit.framework.Assert;

public class ContactServiceMockTest extends MockTest{
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDAO dao;
	
	@Test
	public void testCreerContact() {
		
		//Phase d'enregistrment des comportements
		String nom = "ContactOk";
		EasyMock.expect(dao.isContactExist(nom)).andReturn(false);
		Capture<Contact> capture = EasyMock.newCapture();
		
		dao.creerContact(EasyMock.capture(capture));
		//Fin de l'enregistrment
		replayAll();
		
		service.creerContact(nom, "00");
		//verificatio
		verifyAll();
		
		Contact contact = capture.getValue();
		Assert.assertEquals(nom, contact.getNom());
	}

	
}
