import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayCheckTest {

    @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void testGetArrCheck(Integer[] a, boolean result){
        ArrayCheck arrayCheck = new ArrayCheck(a);
        Assertions.assertEquals(result, arrayCheck.getArrCheck());
    }

    public static Stream<Arguments> dataForAddOperation() {
        List<Arguments> out = new ArrayList<>();
        Integer[] a1 = {1, 1, 1, 4, 4, 4};
        out.add(Arguments.arguments(a1, true));
        Integer[] a2 = {5, 1, 1, 4};
        out.add(Arguments.arguments(a2, false));
        Integer[] a3 = {1, 1, 1};
        out.add(Arguments.arguments(a3, false));
        return out.stream();
    }


}