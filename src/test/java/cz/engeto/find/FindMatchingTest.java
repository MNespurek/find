package cz.engeto.find;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindMatchingTest {
    @Test
    public void middle1Test() {
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        Double testResult = Find.findMatching(testList, 4.0, 9.0);
        Assertions.assertEquals(5.811, testResult);

    }
@Test
    public void middle2Test() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatching(testList, 11.0, 12.6);
        Assertions.assertEquals(12, testResult);

    }
@Test
    public void middle3Test() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double testResult = Find.findMatching(testList, 8.0, 10.0);
        Assertions.assertEquals(8.126, testResult);

    }

}
