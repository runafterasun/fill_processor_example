package org.example.objects;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionType {

    private Stream<String> stringStream;

    private List<String> stringList;

    private List<Integer> intList;
    private Set<String> stringSet;

    private Map<Integer, Character> integerCharacterMap;

    private Integer[] intArray;

    private String[] stringArray;

    public Stream<String> getStringStream() {
        return stringStream;
    }

    public void setStringStream(Stream<String> stringStream) {
        this.stringStream = stringStream;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

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

    public Set<String> getLongSet() {
        return stringSet;
    }

    public void setLongSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<Integer, Character> getIntegerCharacterMap() {
        return integerCharacterMap;
    }

    public void setIntegerCharacterMap(Map<Integer, Character> integerCharacterMap) {
        this.integerCharacterMap = integerCharacterMap;
    }
}
