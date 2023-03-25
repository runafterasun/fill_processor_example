package processor;

import objects.fill.annotations.CollectionType;
import objects.fill.object_param.Fill;
import objects.fill.service.ElementCreationService;
import objects.fill.types.collection_type.CollectionTypeFill;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Collectors;

@CollectionType
public class FillSetCollection implements CollectionTypeFill {

    @Override
    public Object generate(Field field, Fill fill) {
        return new ElementCreationService().fillCollectionStream(field, fill)
                .filter(ss -> ss instanceof String)
                .map(dd -> ((String) dd).toUpperCase())
                .collect(Collectors.toSet());
    }

    @Override
    public Class<?> getClazz() {
        return Set.class;
    }

}
