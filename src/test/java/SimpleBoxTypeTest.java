import org.example.objects.First;
import org.example.objects.SimpleBoxTypeTestObj;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Fill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleBoxTypeTest {

    @Test
    public void fillObject() {

        long startTime = System.nanoTime();

        SimpleBoxTypeTestObj simpleBoxTypeTestObj = RandomValue.fill(Fill.object(new SimpleBoxTypeTestObj()).valueLength(7).gen());

        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("in millis = " + elapsedTime/1000000);

        assert simpleBoxTypeTestObj.getaBoolean() != null;
        assert simpleBoxTypeTestObj.getaDouble() != null;
        assert simpleBoxTypeTestObj.getaLong() != null;
        assert simpleBoxTypeTestObj.getDate() != null;
        assert simpleBoxTypeTestObj.getString() != null;
        assert simpleBoxTypeTestObj.getInteger() != null;
        assert simpleBoxTypeTestObj.getUuid() != null;
        assert simpleBoxTypeTestObj.getaChar() != null;
        assert simpleBoxTypeTestObj.getTestEnum() != null;

    }

    @Test
    public void fillClass() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj = RandomValue.fill(Fill.object(SimpleBoxTypeTestObj.class).gen());

        assert simpleBoxTypeTestObj.getaBoolean() != null;
        assert simpleBoxTypeTestObj.getaDouble() != null;
        assert simpleBoxTypeTestObj.getaLong() != null;
        assert simpleBoxTypeTestObj.getDate() != null;
        assert simpleBoxTypeTestObj.getString() != null;
        assert simpleBoxTypeTestObj.getInteger() != null;
        assert simpleBoxTypeTestObj.getUuid() != null;
        assert simpleBoxTypeTestObj.getaChar() != null;
    }

    @Test
    public void fillSingleClassFromList() {
        Integer testInt = RandomValue.fillSingleVal(Fill.object(Integer.class).gen());

        assert testInt != null;
    }

    @Test
    public void fillClassExcludeField() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj = RandomValue.fill(Fill.object(SimpleBoxTypeTestObj.class)
                .excludeField(List.of("aBoolean", "aLong", "uuid")).gen());

        assert simpleBoxTypeTestObj.getaBoolean() == null;
        assert simpleBoxTypeTestObj.getaDouble() != null;
        assert simpleBoxTypeTestObj.getaLong() == null;
        assert simpleBoxTypeTestObj.getDate() != null;
        assert simpleBoxTypeTestObj.getString() != null;
        assert simpleBoxTypeTestObj.getInteger() != null;
        assert simpleBoxTypeTestObj.getUuid() == null;
        assert simpleBoxTypeTestObj.getaChar() != null;
    }


    @Test
    public void fillObjectExcludeField() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj =
                RandomValue.fill(Fill.object(new SimpleBoxTypeTestObj()).excludeField(List.of("aBoolean", "aLong", "uuid")).gen());

        assert simpleBoxTypeTestObj.getaBoolean() == null;
        assert simpleBoxTypeTestObj.getaDouble() != null;
        assert simpleBoxTypeTestObj.getaLong() == null;
        assert simpleBoxTypeTestObj.getDate() != null;
        assert simpleBoxTypeTestObj.getString() != null;
        assert simpleBoxTypeTestObj.getInteger() != null;
        assert simpleBoxTypeTestObj.getUuid() == null;
        assert simpleBoxTypeTestObj.getaChar() != null;
    }

    @Test
    public void fillObjectList() {
        List<SimpleBoxTypeTestObj> simpleBoxTypeTestObjs = new ArrayList<>();
        RandomValue.fillCollection(simpleBoxTypeTestObjs, Fill.object(SimpleBoxTypeTestObj.class).gen());

        assert simpleBoxTypeTestObjs.size() == 5;
    }

    @Test
    public void fillObjectSet() {
        Set<SimpleBoxTypeTestObj> simpleBoxTypeTestObjs = new HashSet<>();
        RandomValue.fillCollection(simpleBoxTypeTestObjs, Fill.object(SimpleBoxTypeTestObj.class).gen());

        assert simpleBoxTypeTestObjs.size() == 5;
    }

    @Test
    public void fillObjectSetString() {
        Set<String> simpleBoxTypeTestObjs = new HashSet<>();
        RandomValue.fillCollection(simpleBoxTypeTestObjs, Fill.object(String.class).gen());

        assert simpleBoxTypeTestObjs.size() == 1;
    }


    @Test
    public void fillObjectArray() {
        SimpleBoxTypeTestObj[] simpleBoxTypeTestObjs = RandomValue.fillArray(Fill.object(SimpleBoxTypeTestObj.class).gen());

        assert simpleBoxTypeTestObjs.length == 5;
    }

    @Test
    public void testDeep() {
        First first =  RandomValue.fill(Fill.object(First.class).setDeep(2).gen());

        assert first.getSecond().getThird() == null;
    }
}
