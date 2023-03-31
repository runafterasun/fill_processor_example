package processor;

import objects.fill.annotations.BoxType;
import objects.fill.object_param.Fill;
import objects.fill.types.box_type.BoxTypeFill;

import java.util.stream.Stream;


@BoxType(clazz = String.class)
public class StringBoxTypeProc implements BoxTypeFill {

    @Override
    public Object generate(Fill fillObjectParams) {
        return "randomAlphabet()";
    }

    @Override
    public Stream<Object> fillStream(Fill fill) {
        return createStreamWithVal.apply(fill).apply(generate(fill));
    }
}
