import objects.fill.core.RandomValue;
import objects.fill.object_param.Fill;
import org.example.objects.SimpleBoxTypePrimitive;
import org.junit.jupiter.api.Test;

public class SimpleBoxTypePrimitiveTest {

    @Test
    public void fillObjectWithPrimitive() {
        SimpleBoxTypePrimitive simpleBoxTypeTestObj = RandomValue.fill(Fill.object(new SimpleBoxTypePrimitive()).gen());

        assert simpleBoxTypeTestObj.getPrimDouble() != 0.0d;
        assert simpleBoxTypeTestObj.getPrimInt() != 0;
        assert simpleBoxTypeTestObj.getPrimLong() != 0L;
        assert simpleBoxTypeTestObj.getPrimChar() != 0;
    }
}
