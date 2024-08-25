import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AdvancedContactManager {
    private HashMap<String, String> contacts;

    public AdvancedContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        // Implementar
        contacts.put(name, phoneNumber);
    }

    public List<String> filterContactsByPrefix(String prefix) {
        // Implementar: Filtrar contactos por prefijo
        List<String> filteredContacts = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String name = entry.getKey();
            if (name.startsWith(prefix)) {
                filteredContacts.add(name);
            }
        }
        return filteredContacts;
    }

    public void printContactsSortedByName() {
        // Implementar: Mostrar contactos ordenados por nombre
        TreeMap<String, String> sortedContacts = new TreeMap<>(contacts);
        for (Map.Entry<String, String> entry : sortedContacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public String getContactWithLongestPhoneNumber() {
        // Implementar: Mostrar contacto con el número de teléfono más largo
        String longestPhoneNumber = "";
        String contactWithLongestPhoneNumber = "";
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String phoneNumber = entry.getValue();
            if (phoneNumber.length() > longestPhoneNumber.length()) {
                longestPhoneNumber = phoneNumber;
                contactWithLongestPhoneNumber = entry.getKey();
            }
        }
        return contactWithLongestPhoneNumber;
    }

    public static void main(String[] args) {
        AdvancedContactManager manager = new AdvancedContactManager();

        // Añadir algunos contactos para pruebas
        manager.addContact("Ana", "555-1234");
        manager.addContact("Luis", "555-567890");
        manager.addContact("Carlos", "555-8765");
        manager.addContact("Ana Maria", "555-4321");

        // Pruebas:
        System.out.println("Contactos que comienzan con 'Ana':");
        List<String> anaContacts = manager.filterContactsByPrefix("Ana");
        for (String contact : anaContacts) {
            System.out.println(contact);
        }

        System.out.println("\nContactos ordenados por nombre:");
        manager.printContactsSortedByName();

        System.out.println("\nContacto con el número de teléfono más largo:");
        System.out.println(manager.getContactWithLongestPhoneNumber());
    }
}
