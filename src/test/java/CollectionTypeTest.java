import org.example.objects.CollectionType;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Extend;
import ru.objectsfill.object_param.Fill;

import java.util.List;
import java.util.stream.Stream;

public class CollectionTypeTest {

    CollectionType collectionTypes = new CollectionType();
    @Test
    public void fillObject() {
        CollectionTypeTest collectionType = RandomValue.fill(Fill.object(this).collectionSize(6).valueLength(7).gen());

        assert collectionType.collectionTypes.getStringList().size() == 6;
        assert collectionType.collectionTypes.getStringList().get(0).equals("randomAlphabet()");

        assert collectionType.collectionTypes.getLongSet().size() == 1;
        assert collectionType.collectionTypes.getIntegerCharacterMap().size() == 6;
        assert collectionType.collectionTypes.getIntArray().length == 6;
        assert collectionType.collectionTypes.getStringArray().length == 6;

    }

    @Test
    public void fillObjectThis() {
        CollectionType collectionType = RandomValue.fill(Fill.object(new CollectionType()).gen());

        assert collectionType.getLongSet() != null;
    }

    @Test
    public void fillStreamWithGeneric() {
        Stream<String> collectionType = RandomValue.fillStream(Fill.object(String.class)
                .fieldParams(
                        Extend.wrapByFunction(t -> "You Can do this")
                                .collectionSize(10)
                                .gen()
                )
                .gen());

        List<String> list = collectionType.toList();
        assert list.size() == 5;
        assert list.get(0).equals("You Can do this");
    }

    @Test
    public void fillObjectWithExtParam() {
        CollectionType collectionType = RandomValue.fill(Fill.object(CollectionType.class).collectionSize(6).valueLength(7)
                .fieldParams(
                        Extend.field("stringList")
                        .addMutationFunction(t -> "You Can do this")
                        .collectionSize(10)
                        .gen(),

                        Extend.field("intList")
                        .addMutationFunction(t -> 2)
                        .collectionSize(1)
                        .gen())
                .gen());

        assert collectionType.getStringList().size() == 10;
        assert collectionType.getStringList().get(0).equals("You Can do this");

        assert collectionType.getIntList().size() == 1;
        assert collectionType.getIntList().get(0).equals(2);
    }
}
