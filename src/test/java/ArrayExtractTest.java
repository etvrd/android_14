import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayExtractTest {

    @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void testGetNewArray(Integer[] a, ArrayList<Integer> result){
        ArrayExtract arrayExtract = new ArrayExtract(a);
        Assertions.assertEquals(result, arrayExtract.getNewArr());
    }

    public static Stream<Arguments> dataForAddOperation() {
        List<Arguments> out = new ArrayList<>();
        Integer[] a1 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> result1 = new ArrayList<>();
        result1.add(5);
        result1.add(6);
        out.add(Arguments.arguments(a1, result1));
        Integer[] a2 = {5, 6, 4, 2};
        ArrayList<Integer> result2 = new ArrayList<>();
        result2.add(2);
        out.add(Arguments.arguments(a2, result2));
        Integer[] a3 = {5, 6, 4};
        ArrayList<Integer> result3 = new ArrayList<>();
        out.add(Arguments.arguments(a3, result3));
        return out.stream();
    }


}
