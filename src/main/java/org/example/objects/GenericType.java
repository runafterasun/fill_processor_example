package org.example.objects;

import java.util.List;

public class GenericType<T, K> {

    private List<T> genericList;

    private T generic;

    private K intGen;

    public K getIntGen() {
        return intGen;
    }

    public void setIntGen(K intGen) {
        this.intGen = intGen;
    }

    public T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }

    public List<T> getGenericList() {
        return genericList;
    }

    public void setGenericList(List<T> genericList) {
        this.genericList = genericList;
    }
}