import java.util.*;

public class PhoneBook {
    private HashMap<String, TreeSet<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        TreeSet<String> phoneNumbers = contacts.getOrDefault(name, new TreeSet<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void displayPhoneBook() {
        List<Map.Entry<String, TreeSet<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());

        Collections.sort(sortedEntries, (entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, TreeSet<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Олег", "123456789");
        phoneBook.addContact("Олег", "987654321");
        phoneBook.addContact("Алиса", "987654321");
        phoneBook.addContact("Артур", "111111111");
        phoneBook.addContact("Артур", "222222222");

        phoneBook.displayPhoneBook();
    }
}
