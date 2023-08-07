import org.example.objects.GenericType;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Fill;

import java.util.HashSet;
import java.util.Set;

public class GenericTypeTest {


    @Test
    public void fillObjectThis() {
        GenericType<String, Integer> collectionType = new GenericType<>();

        collectionType = RandomValue.fill(Fill.object(collectionType).withGeneric("T", String.class)
                .withGeneric("K", Integer.class).gen());

        assert collectionType.getGenericList() != null;
        assert collectionType.getGeneric() != null;
        assert collectionType.getIntGen() != null;

    }

    @Test
    public void fillObjectSetWithGeneric() {
        Set<GenericType<String, Integer>> genericTypeHashSet = new HashSet<>();
        RandomValue.fillCollection(genericTypeHashSet, Fill.object(GenericType.class)
                                                            .withGeneric("T", String.class)
                .withGeneric("K", Integer.class).gen());

        assert genericTypeHashSet.size() == 5;
    }

}
