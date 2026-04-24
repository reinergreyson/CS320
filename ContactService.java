import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate ID");
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    public boolean deleteContact(String contactId) {
        if (contacts.remove(contactId) == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        return true;
    }

    public boolean updateFirstName(String id, String firstName) {
        contacts.get(id).setFirstName(firstName);
        return true;
    }

    public boolean updateLastName(String id, String lastName) {
        contacts.get(id).setLastName(lastName);
        return true;
    }

    public boolean updatePhone(String id, String phone) {
        contacts.get(id).setPhone(phone);
        return true;
    }

    public boolean updateAddress(String id, String address) {
        contacts.get(id).setAddress(address);
        return true;
    }

    public Contact getContact(String id) {
        return contacts.get(id);
    }
}