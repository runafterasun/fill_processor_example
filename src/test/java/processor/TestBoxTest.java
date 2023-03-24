package processor;

import objects.fill.core.RandomValue;
import objects.fill.object_param.Fill;
import org.example.processor.BoxClassContainer;
import org.example.processor.TestBoxClass;
import org.junit.jupiter.api.Test;

public class TestBoxTest {

    @Test
    public void fillObject() {
        BoxClassContainer testBoxClass = RandomValue.fill(Fill.clazz(BoxClassContainer.class).gen());
        assert testBoxClass.getTestBoxClass().getTestField().equals("SomeTestClass");
    }

    @Test
    public void fillObjectOverrideStringProc() {
        TestBoxClass testBoxClass = RandomValue.fill(Fill.clazz(TestBoxClass.class).gen());
        assert testBoxClass.getTestField().equals("randomAlphabet()");
    }
}
