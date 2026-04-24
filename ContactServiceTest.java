import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    void testAddAndDeleteContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Street");

        assertTrue(service.addContact(c));
        assertTrue(service.deleteContact("1"));
    }

    @Test
    void testDuplicateContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Street");

        service.addContact(c);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(c));
    }
}