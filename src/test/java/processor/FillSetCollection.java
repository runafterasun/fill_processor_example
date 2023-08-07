package processor;

import ru.objectsfill.annotations.CollectionType;
import ru.objectsfill.object_param.Fill;
import ru.objectsfill.service.ElementCreationService;
import ru.objectsfill.types.collection_type.CollectionTypeFill;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Collectors;

@CollectionType(clazz = Set.class)
public class FillSetCollection implements CollectionTypeFill {

    @Override
    public Object generate(Field field, Fill fill) {
        return new ElementCreationService().fillCollectionStream(field, fill)
                .filter(ss -> ss instanceof String)
                .map(dd -> ((String) dd).toUpperCase())
                .collect(Collectors.toSet());
    }

}
