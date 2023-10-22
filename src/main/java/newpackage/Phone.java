package newpackage;

import java.util.*;

//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.
public class Phone {

    Map<String, List<String>> contacts = new HashMap<>();
//добавить контакт
    public void addContact(String name, String number) {
        contacts.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }
//    вывод контакта по имени
    public List<String> getContact(String name) {
        return contacts.get(name);
    }
//    вывод списка контактов
    public void contactsPrint() {
        for (Map.Entry<String, List<String>> iter : contacts.entrySet()) {
            System.out.println(iter.getKey() + ": " + iter.getValue());
        }
    }
//    удаляет контакт
    public void delContact(String name){
        contacts.remove(name);
    }

}

