package processor;

import objects.fill.annotations.BoxType;
import objects.fill.object_param.Fill;
import objects.fill.types.box_type.BoxTypeFill;
import org.example.processor.TestBoxClass;

import java.util.stream.Stream;

@BoxType(clazz = TestBoxClass.class)
public class TestBoxProcessorCreateRandom implements BoxTypeFill {

    @Override
    public Object generate(Fill fillObjectParams) {
        return new TestBoxClass("SomeTestClass");
    }

    @Override
    public Stream<Object> fillStream(Fill fill) {
        return createStreamWithVal.apply(fill).apply(generate(fill));
    }

}
