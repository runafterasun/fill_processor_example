package org.example.objects;

public class TestWithClosedConstruct {

    private String first;
    private String second;
    private String third;

    private RecordTest recordTest;



    public TestWithClosedConstruct(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public RecordTest getRecordTest() {
        return recordTest;
    }
}
