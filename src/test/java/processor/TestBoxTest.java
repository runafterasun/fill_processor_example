package processor;

import org.example.objects.Child;
import org.example.objects.Parent;
import org.example.processor.BoxClassContainer;
import org.example.processor.TestBoxClass;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Fill;

public class TestBoxTest {

    @Test
    public void fillObject() {
        BoxClassContainer testBoxClass = RandomValue.fill(Fill.object(BoxClassContainer.class).gen());
        assert testBoxClass.getTestBoxClass().getTestField().equals("SomeTestClass");
    }

    @Test
    public void fillObjectOverrideStringProc() {
        TestBoxClass testBoxClass = RandomValue.fill(Fill.object(TestBoxClass.class).gen());
        System.out.println(testBoxClass.getTestField());
        assert testBoxClass.getTestField().equals("randomAlphabet()");
    }

    @Test
    public void fillObjectTest() {
        TestBoxClass testBoxClass = new TestBoxClass();
        RandomValue.fill(Fill.object(testBoxClass).gen());
        System.out.println(testBoxClass.getTestField());
        assert testBoxClass.getTestField().equals("randomAlphabet()");
    }


    @Test
    public void fillObjectParent() {
        Parent parent = new Child();
        RandomValue.fill(Fill.object(parent).gen());

        Parent parentTrue = RandomValue.fill(Fill.object(new Parent()).gen());

        assert !parent.getTen().equals(10);
        assert !parentTrue.getTen().equals(10);
    }
}
