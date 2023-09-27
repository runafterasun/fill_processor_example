import org.example.objects.RecordTest;
import org.example.objects.TestWithClosedConstruct;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;

public class RecordClassTest {

    @Test
    void fillRecord() {
        RecordTest simpleBoxTypeTestObj = RandomValue.fill(RecordTest.class);

        assert simpleBoxTypeTestObj.firstField() != null;
        assert simpleBoxTypeTestObj.secondField() != null;
    }

    @Test
    void fillClassWithTypedConstruct() {
        TestWithClosedConstruct simpleBoxTypeTestObj = RandomValue.fill(TestWithClosedConstruct.class);

        assert simpleBoxTypeTestObj.getFirst() != null;
        assert simpleBoxTypeTestObj.getSecond() != null;
        assert simpleBoxTypeTestObj.getThird() != null;
        assert simpleBoxTypeTestObj.getRecordTest() != null;
        assert simpleBoxTypeTestObj.getRecordTest().secondField() != null;
        assert simpleBoxTypeTestObj.getRecordTest().firstField() != null;
    }
}
