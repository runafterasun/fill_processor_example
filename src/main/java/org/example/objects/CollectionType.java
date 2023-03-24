package org.example.objects;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionType {

    private List<String> stringList;
    private Set<Long> longSet;

    private Map<Integer, Character> integerCharacterMap;

    private Integer[] intArray;

    private String[] stringArray;

    public Integer[] getIntArray() {
        return intArray;
    }

    public void setIntArray(Integer[] intArray) {
        this.intArray = intArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<Long> getLongSet() {
        return longSet;
    }

    public void setLongSet(Set<Long> longSet) {
        this.longSet = longSet;
    }

    public Map<Integer, Character> getIntegerCharacterMap() {
        return integerCharacterMap;
    }

    public void setIntegerCharacterMap(Map<Integer, Character> integerCharacterMap) {
        this.integerCharacterMap = integerCharacterMap;
    }
}
