package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class GenericITPersonStorage<T extends ITPerson> {
    List<T> itcrowd = new ArrayList<>();
   public boolean storePerson(T object){
       return itcrowd.add(object);
   }
    public Object getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public Object getFirstStoredPerson() {
        return itcrowd.get(0);
    }

}
