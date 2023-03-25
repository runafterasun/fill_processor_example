import objects.fill.core.RandomValue;
import objects.fill.object_param.Fill;
import org.example.objects.GenericType;
import org.example.objects.SimpleBoxTypeTestObj;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class GenericTypeTest {

    GenericType<String> collectionTypes = new GenericType<>();

    @Test
    public void fillObject() {
        GenericTypeTest collectionType = RandomValue.fill(Fill.object(this).gen());

        assert collectionType.collectionTypes.getGeneric() != null;
        assert collectionType.collectionTypes.getGenericList().size() == 5;
    }

    @Test
    public void fillObjectThis() {
        GenericType<String> collectionType = new GenericType<>();

        collectionType = RandomValue.fill(Fill.object(collectionType).withGeneric(String.class).gen());

        assert collectionType.getGenericList() != null;
        assert collectionType.getGeneric() != null;

    }

    @Test
    public void fillObjectSetWithGeneric() {
        Set<GenericType<String>> genericTypeHashSet = new HashSet<>();
        RandomValue.fillCollection(genericTypeHashSet, Fill.object(GenericType.class)
                                                            .withGeneric(String.class).gen());

        assert genericTypeHashSet.size() == 5;
    }

}
