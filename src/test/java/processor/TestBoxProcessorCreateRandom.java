package processor;

import objects.fill.annotations.BoxType;
import objects.fill.object_param.Fill;
import objects.fill.types.box_type.BoxTypeFill;
import org.example.processor.TestBoxClass;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@BoxType
public class TestBoxProcessorCreateRandom implements BoxTypeFill {

    @Override
    public Object generate(Fill fillObjectParams) {
        return new TestBoxClass("SomeTestClass");
    }

    @Override
    public Stream<Object> fillStream(Fill fill) {
        return IntStream
                .range(0, fill.getCollectionSize())
                .mapToObj(i -> i + "SomeTestClass");
    }

    @Override
    public Class<?> getClazz() {
        return TestBoxClass.class;
    }
}
