import objects.fill.core.ObjectFillWithRandomValue;
import org.example.objects.CollectionType;
import org.junit.jupiter.api.Test;

public class CollectionTypeTest {

    CollectionType collectionTypes = new CollectionType();
    @Test
    public void fillObject() {
        CollectionTypeTest collectionType = ObjectFillWithRandomValue.fill(this);

        assert collectionType.collectionTypes.getLongSet().size() == 5;
        assert collectionType.collectionTypes.getStringList().size() == 5;
        assert collectionType.collectionTypes.getIntegerCharacterMap().size() == 5;
        assert collectionType.collectionTypes.getIntArray().length == 5;
        assert collectionType.collectionTypes.getStringArray().length == 5;

    }

    @Test
    public void fillObjectThis() {
        CollectionType collectionType = ObjectFillWithRandomValue.fill(new CollectionType());

        assert collectionType.getLongSet() != null;

    }

}
