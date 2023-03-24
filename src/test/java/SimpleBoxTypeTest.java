import objects.fill.core.ObjectFillWithRandomValue;
import org.example.objects.SimpleBoxTypeTestObj;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleBoxTypeTest {

    @Test
    public void fillObject() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj = ObjectFillWithRandomValue.fill(new SimpleBoxTypeTestObj());

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
    public void fillClass() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj = ObjectFillWithRandomValue.fill(SimpleBoxTypeTestObj.class);

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
    public void fillClassExcludeField() {
        SimpleBoxTypeTestObj simpleBoxTypeTestObj = ObjectFillWithRandomValue.fill(SimpleBoxTypeTestObj.class, List.of("aBoolean", "aLong", "uuid"));

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
                ObjectFillWithRandomValue.fill(new SimpleBoxTypeTestObj(), List.of("aBoolean", "aLong", "uuid"));

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
        ObjectFillWithRandomValue.fillCollection(simpleBoxTypeTestObjs, SimpleBoxTypeTestObj.class);

        assert simpleBoxTypeTestObjs.size() == 5;
    }

    @Test
    public void fillObjectSet() {
        Set<SimpleBoxTypeTestObj> simpleBoxTypeTestObjs = new HashSet<>();
        ObjectFillWithRandomValue.fillCollection(simpleBoxTypeTestObjs, SimpleBoxTypeTestObj.class);

        assert simpleBoxTypeTestObjs.size() == 5;
    }
}
