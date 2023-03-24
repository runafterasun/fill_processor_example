import objects.fill.core.RandomValue;
import objects.fill.object_param.Fill;
import org.example.objects.GenericType;
import org.junit.jupiter.api.Test;

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

}
