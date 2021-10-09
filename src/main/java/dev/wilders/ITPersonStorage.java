package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class ITPersonStorage {

    List persons = new ArrayList();

    public boolean storePerson(Object person) {
        return persons.add(person);
    }

    public Object getLastStoredPerson() {
        return persons.get(persons.size()-1);
    }

    public Object getFirstStoredPerson() {
        return persons.get(0);
    }

}
