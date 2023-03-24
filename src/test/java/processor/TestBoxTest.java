package processor;

import objects.fill.core.ObjectFillWithRandomValue;
import org.example.processor.BoxClassContainer;
import org.example.processor.TestBoxClass;
import org.junit.jupiter.api.Test;

public class TestBoxTest {

    @Test
    public void fillObject() {
        BoxClassContainer testBoxClass = ObjectFillWithRandomValue.fill(BoxClassContainer.class);
        assert testBoxClass.getTestBoxClass().getTestField().equals("SomeTestClass");
    }

    @Test
    public void fillObjectOverrideStringProc() {
        TestBoxClass testBoxClass = ObjectFillWithRandomValue.fill(TestBoxClass.class);
        assert testBoxClass.getTestField().equals("randomAlphabet()");
    }
}
