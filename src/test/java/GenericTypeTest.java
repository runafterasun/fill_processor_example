import objects.fill.core.ObjectFillWithRandomValue;
import org.example.objects.GenericType;
import org.junit.jupiter.api.Test;

public class GenericTypeTest {

    GenericType<String> collectionTypes = new GenericType<>();

    @Test
    public void fillObject() {
        GenericTypeTest collectionType = ObjectFillWithRandomValue.fill(this);

        assert collectionType.collectionTypes.getGeneric() != null;
        assert collectionType.collectionTypes.getGenericList().size() == 5;


    }

    @Test
    public void fillObjectThis() {
        GenericType<String> collectionType = new GenericType<>();

        collectionType = ObjectFillWithRandomValue.fillWithGeneric(collectionType, String.class);

        assert collectionType.getGenericList() != null;
        assert collectionType.getGeneric() != null;

    }

}
