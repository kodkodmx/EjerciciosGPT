import java.util.HashMap;
import java.util.Iterator;

public class ContactManager {
    private HashMap<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        // Implementar
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        // Implementar
        contacts.remove(name);
    }

    public String getPhoneNumber(String name) {
        // Implementar
        return contacts.get(name);
    }

    public boolean hasContact(String name) {
        // Implementar
        return contacts.containsKey(name);
    }

    public void printContacts() {
        // Implementar
        for (String key : contacts.keySet()) {
            System.out.println("Nombre: " + key + ", Teléfono: " + contacts.get(key));
        }
    }

    public void clearContacts() {
        // Implementar
        contacts.clear();
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Pruebas
        manager.addContact("Ana", "555-1234");
        manager.addContact("Luis", "555-5678");
        manager.addContact("Carlos", "555-8765");
        manager.addContact("Ana", "555-0000"); // Actualiza el número para Ana

        System.out.println("Contactos:");
        manager.printContacts();

        System.out.println("\nNúmero de teléfono de Luis:");
        System.out.println(manager.getPhoneNumber("Luis"));

        System.out.println("\n¿Tiene el contacto Carlos?");
        System.out.println(manager.hasContact("Carlos"));

        System.out.println("\nEliminar contacto de Carlos.");
        manager.removeContact("Carlos");

        System.out.println("\nContactos después de eliminar:");
        manager.printContacts();

        System.out.println("\nVaciar el registro.");
        manager.clearContacts();

        System.out.println("\nContactos después de vaciar:");
        manager.printContacts();
    }
}
