package oop.tasks.first;

public interface Phonebook {

    void add(String name, String phoneNumber);
    String[] findPhoneByName(String name);
    String[] getNamesThatContains(String partOfName);

}
