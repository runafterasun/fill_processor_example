package org.example.processor;

public class TestBoxClass {


    public TestBoxClass(){}
    public TestBoxClass(String testField) {
        this.testField = testField;
    }

    private String testField;

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
