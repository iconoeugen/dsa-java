package eu.vlad.digitalstack.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {

    @Test
    public void testEmpty() {
        int[] empty =  {};
        int result = ContainsDuplicates.countPairs(empty);
        assertEquals(0, result);
    }

    @Test
    public void testNoDuplicates() {
        int[] noDuplicates =  {1, 2, 3};
        int result = ContainsDuplicates.countPairs(noDuplicates);
        assertEquals(0, result);
    }

    @Test
    public void testOneDuplicates() {
        int[] noDuplicates =  {1, 2, 3, 1};
        int result = ContainsDuplicates.countPairs(noDuplicates);
        assertEquals(1, result);
    }

    @Test
    public void testMultipleDuplicates() {
        int[] noDuplicates =  {1, 2, 3, 1, 2};
        int result = ContainsDuplicates.countPairs(noDuplicates);
        assertEquals(2, result);
    }

    @Test
    public void testOneMatchedAndOneUnmatchedDuplicates() {
        int[] noDuplicates =  {1, 2, 3, 1, 1};
        int result = ContainsDuplicates.countPairs(noDuplicates);
        assertEquals(1, result);
    }

    @Test
    public void testHasDuplicates() {
        int[] noDuplicates =  {1, 2, 3, 1, 1};
        boolean result = ContainsDuplicates.hasDuplicates(noDuplicates);
        assertTrue(result);
    }

    @Test
    public void testHasNoDuplicates() {
        int[] noDuplicates =  {1, 2, 3};
        boolean result = ContainsDuplicates.hasDuplicates(noDuplicates);
        assertFalse(result);
    }
}
