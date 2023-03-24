package org.example.objects;

import java.util.List;

public class GenericType<K> {

    private List<K> genericList;

    private K generic;

    public K getGeneric() {
        return generic;
    }

    public void setGeneric(K generic) {
        this.generic = generic;
    }

    public List<K> getGenericList() {
        return genericList;
    }

    public void setGenericList(List<K> genericList) {
        this.genericList = genericList;
    }
}