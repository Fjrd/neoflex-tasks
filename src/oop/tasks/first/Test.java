package oop.tasks.first;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Phonebook phonebook = new PhonebookImpl();
        phonebook.add("vasya", "123");
        phonebook.add("petya", "12323");
        phonebook.add("tanya", "123123");
        phonebook.add("kolya", "123324");
        phonebook.add("anya", "124353453");
        phonebook.add("galya", "165756785623");
        phonebook.add("galya", "12312321312312");
        phonebook.add("galya", "1657567856asdasdas23");

        String[] galyaPhones = phonebook.findPhoneByName("galya");
        Arrays.stream(galyaPhones).forEach(System.out::println);

        String[] contains = phonebook.getNamesThatContains("ly");
        Arrays.stream(contains).forEach(System.out::println);
    }
}
