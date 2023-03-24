import objects.fill.core.ObjectFillWithRandomValue;
import org.example.objects.SimpleBoxTypePrimitive;
import org.junit.jupiter.api.Test;

public class SimpleBoxTypePrimitiveTest {

    @Test
    public void fillObjectWithPrimitive() {
        SimpleBoxTypePrimitive simpleBoxTypeTestObj = ObjectFillWithRandomValue.fill(new SimpleBoxTypePrimitive());

        assert simpleBoxTypeTestObj.getPrimDouble() != 0.0d;
        assert simpleBoxTypeTestObj.getPrimInt() != 0;
        assert simpleBoxTypeTestObj.getPrimLong() != 0L;
        assert simpleBoxTypeTestObj.getPrimChar() != 0;
    }
}
