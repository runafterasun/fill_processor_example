import org.example.objects.SimpleBoxTypePrimitive;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Fill;

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
