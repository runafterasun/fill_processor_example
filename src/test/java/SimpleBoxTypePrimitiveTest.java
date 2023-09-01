import org.example.objects.SimpleBoxTypePrimitive;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Fill;

class SimpleBoxTypePrimitiveTest {

    @Test
    void fillObjectWithPrimitive() {
        SimpleBoxTypePrimitive simpleBoxTypeTestObj = RandomValue.fill(Fill.object(new SimpleBoxTypePrimitive()).gen());

        assert simpleBoxTypeTestObj.getPrimDouble() != 0.0d;
        assert simpleBoxTypeTestObj.getPrimInt() != 0;
        assert simpleBoxTypeTestObj.getPrimLong() != 0L;
        assert simpleBoxTypeTestObj.getPrimChar() != 0;
    }

    @Test
    void fillPrimitiveArrayInClass() {
        SimpleBoxTypePrimitive fill = RandomValue.fill(Fill.object(new SimpleBoxTypePrimitive()).gen());

        assert fill.getPrimLongArray().length == 5;
        assert fill.getPrimIntArray().length == 5;
        assert fill.getPrimBooleanArray().length == 5;
        assert fill.getPrimCharArray().length == 5;
        assert fill.getPrimDoubleArray().length == 5;
    }

    @Test
     void fillPrimitiveArray() {
        Object[] fillInt = RandomValue.fillArray(Fill.object(int[].class).gen());
        assert fillInt.length == 5;

        Object[] fillLong = RandomValue.fillArray(Fill.object(long[].class).gen());
        assert fillLong.length == 5;

        Object[] fillChar = RandomValue.fillArray(Fill.object(char[].class).gen());
        assert fillChar.length == 5;

        Object[] fillBool = RandomValue.fillArray(Fill.object(boolean[].class).gen());
        assert fillBool.length == 5;

        Object[] fillDouble = RandomValue.fillArray(Fill.object(double[].class).gen());
        assert fillDouble.length == 5;
    }
}
