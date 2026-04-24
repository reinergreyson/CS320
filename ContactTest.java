import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testValidContact() {
        Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        assertEquals("John", c.getFirstName());
    }

    @Test
    void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("123", "John", "Doe", "123", "123 Street");
        });
    }
}