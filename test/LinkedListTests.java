import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTests {
    @Test
    void anEmptyListHasLengthZero() {
        LinkedList listToTest = new LinkedList();
        assertEquals(0, listToTest.length());
    }

    @Test
    void aListHasLengthOneAfterAddingANumber() {
        LinkedList listToTest = new LinkedList();

        listToTest.add(5);

        assertEquals(1, listToTest.length());
    }
}
