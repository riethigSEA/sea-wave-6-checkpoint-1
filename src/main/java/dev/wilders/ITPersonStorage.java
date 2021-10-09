package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class ITPersonStorage {

    List persons = new ArrayList();

    public boolean storeITPerson(Object person) {
        return persons.add(person);
    }

    public Object getLastStoredITPerson() {
        return persons.get(persons.size()-1);
    }

    public Object getFirstStoredITPerson() {
        return persons.get(0);
    }

}
