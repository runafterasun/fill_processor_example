import objects.fill.core.RandomValue;
import objects.fill.object_param.Fill;
import org.example.objects.CollectionType;
import org.junit.jupiter.api.Test;

public class CollectionTypeTest {

    CollectionType collectionTypes = new CollectionType();
    @Test
    public void fillObject() {
        CollectionTypeTest collectionType = RandomValue.fill(Fill.object(this).collectionSize(6).gen());

        assert collectionType.collectionTypes.getLongSet().size() == 6;
        assert collectionType.collectionTypes.getStringList().size() == 6;
        assert collectionType.collectionTypes.getIntegerCharacterMap().size() == 6;
        assert collectionType.collectionTypes.getIntArray().length == 6;
        assert collectionType.collectionTypes.getStringArray().length == 6;

    }

    @Test
    public void fillObjectThis() {
        CollectionType collectionType = RandomValue.fill(Fill.object(new CollectionType()).gen());

        assert collectionType.getLongSet() != null;

    }

}
