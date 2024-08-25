import java.util.HashMap;
import java.util.Map;

public class MapEntryDemo {
    public static void main(String[] args) {
        // Crear un HashMap y agregar algunas entradas
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Ana", "555-1234");
        contacts.put("Luis", "555-5678");
        contacts.put("Carlos", "555-8765");
        System.out.println(contacts);
        System.out.println(contacts.entrySet());
    }
}
