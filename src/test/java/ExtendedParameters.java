import org.example.objects.CollectionType;
import org.junit.jupiter.api.Test;
import ru.objectsfill.core.RandomValue;
import ru.objectsfill.object_param.Extend;
import ru.objectsfill.object_param.Fill;

public class ExtendedParameters {

    @Test
    public void fillWithOneExtParam() {
        CollectionType simpleBoxTypeObj = RandomValue
                .fill(Fill.object(CollectionType.class)
                        .fieldParams(Extend.field("stringArray")
                                .collectionSize(4)
                                .gen())
                .gen());

        assert simpleBoxTypeObj.getStringArray().length == 4;
    }

    @Test
    public void fillWithFewExtParam() {
        CollectionType simpleBoxTypeObj = RandomValue
                .fill(Fill.object(CollectionType.class)
                        .fieldParams(Extend.field("stringArray")
                                .collectionSize(4)
                                .gen())
                        .gen());

        assert simpleBoxTypeObj.getStringArray().length == 4;

        simpleBoxTypeObj = RandomValue
                .fill(Fill.object(CollectionType.class)
                        .fieldParams(Extend.field("intArray")
                                .collectionSize(30)
                                .valueLength(7)
                                .gen())
                        .gen());

        assert simpleBoxTypeObj.getIntArray().length == 30;
        assert simpleBoxTypeObj.getIntArray()[1] >= 1_000_000;

        simpleBoxTypeObj = RandomValue
                .fill(Fill.object(CollectionType.class)
                        .fieldParams(Extend.field("intArray")
                                .collectionSize(30)
                                .valueLength(7)
                                .addMutationFunction(t -> 100)
                                .gen())
                        .gen());

        assert simpleBoxTypeObj.getIntArray().length == 30;
        assert simpleBoxTypeObj.getIntArray()[1] >= 100;

    }
}
