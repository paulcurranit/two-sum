import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class twoSumTest {

    @Test
    public void testTwoSumExecute() {
        Vector<Integer> result = TwoSum.execute(new int[]{2,7,11,15},9);
        assertTrue(result.get(0).equals(0) &&
            result.get(1).equals(1));
    }

    @Test
    public void testTwoSumExecuteTwo() {
        Vector<Integer> result = TwoSum.execute(new int[]{2,7,11,15},13);
        assertTrue(result.get(0).equals(0) &&
                result.get(1).equals(2));
    }

    @Test
    public void testTwoSumExecuteThree() {
        Vector<Integer> result = TwoSum.execute(new int[]{2,7,11,15},17);
        assertTrue(result.get(0).equals(0) &&
                result.get(1).equals(3));
    }

    @Test
    public void testTwoSumExecuteFour() {
        Vector<Integer> result = TwoSum.execute(new int[]{2,7,11,15},18);
        assertTrue(result.get(0).equals(1) &&
                result.get(1).equals(2));
    }

    @Test
    public void testTwoSumExecuteFive() {
        Vector<Integer> result = TwoSum.execute(new int[]{2,7,11,15},26);
        assertTrue(result.get(0).equals(2) &&
                result.get(1).equals(3));
    }

    @Test
    public void testTwoSumExecute2() {
        Vector<Integer> result = TwoSum.execute2(new int[]{2,7,11,15},9);
        assertTrue(result.get(0).equals(0) &&
                result.get(1).equals(1));
    }

    @Test
    public void testTwoSumExecute2Two() {
        Vector<Integer> result = TwoSum.execute2(new int[]{2,7,11,15},13);
        assertTrue(result.get(0).equals(0) &&
                result.get(1).equals(2));
    }

    @Test
    public void testTwoSumExecute2Three() {
        Vector<Integer> result = TwoSum.execute2(new int[]{2,7,11,15},17);
        assertTrue(result.get(0).equals(0) &&
                result.get(1).equals(3));
    }

    @Test
    public void testTwoSumExecute2Four() {
        Vector<Integer> result = TwoSum.execute2(new int[]{2,7,11,15},18);
        assertTrue(result.get(0).equals(1) &&
                result.get(1).equals(2));
    }

    @Test
    public void testTwoSumExecute2Five() {
        Vector<Integer> result = TwoSum.execute2(new int[]{2,7,11,15},26);
        assertTrue(result.get(0).equals(2) &&
                result.get(1).equals(3));
    }
}
