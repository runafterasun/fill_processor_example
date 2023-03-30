package processor;

import objects.fill.annotations.BoxType;
import objects.fill.object_param.Fill;
import objects.fill.types.box_type.BoxTypeFill;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static objects.fill.utils.RandomGenerator.randomAlphabet;

@BoxType(clazz = String.class)
public class StringBoxTypeProc implements BoxTypeFill {

    @Override
    public Object generate(Fill fillObjectParams) {
        return "randomAlphabet()";
    }

    @Override
    public Stream<Object> fillStream(Fill fill) {
        return IntStream
                .range(0, fill.getCollectionSize())
                .mapToObj(i -> randomAlphabet(fill));
    }
}
