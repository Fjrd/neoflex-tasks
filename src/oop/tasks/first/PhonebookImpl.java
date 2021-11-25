package oop.tasks.first;

import java.util.*;
import java.util.stream.Collectors;

public class PhonebookImpl implements Phonebook{

    private Map<String, ArrayList<String>> collection = new HashMap<>();

    @Override
    public void add(String name, String phoneNumber) {
        ArrayList<String> phoneNumbers;

        if (collection.containsKey(name))
            phoneNumbers = collection.get(name);
        else
            phoneNumbers = new ArrayList<String>();

        phoneNumbers.add(phoneNumber);
        collection.put(name, phoneNumbers);
    }

    @Override
    public String[] findPhoneByName(String name) {
        ArrayList<String> phoneNumbers = collection.get(name);
        return phoneNumbers.toArray(new String[phoneNumbers.size()]);
    }

    @Override
    public String[] getNamesThatContains(String partOfName) {
        List<String> allMatches = collection.keySet().stream()
                .filter(s -> s.contains(partOfName))
                .collect(Collectors.toList());
        return allMatches.toArray(new String[allMatches.size()]);
    }
}
