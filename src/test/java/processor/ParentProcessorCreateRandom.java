package processor;

import objects.fill.annotations.BoxType;
import objects.fill.object_param.Fill;
import objects.fill.types.box_type.BoxTypeFill;
import org.example.objects.Parent;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@BoxType(clazz = Parent.class)
public class ParentProcessorCreateRandom implements BoxTypeFill {

    @Override
    public Object generate(Fill fillObjectParams) {
        Parent parent = new Parent();
        parent.setTen(10);
        return parent;
    }

    @Override
    public Stream<Object> fillStream(Fill fill) {
        return IntStream
                .range(0, fill.getCollectionSize())
                .mapToObj(i -> generate(fill));
    }

}
