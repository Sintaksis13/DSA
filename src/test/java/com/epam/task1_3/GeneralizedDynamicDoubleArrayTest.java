package com.epam.task1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralizedDynamicDoubleArrayTest {
    private GeneralizedDynamicDoubleArray<Integer> array = new GeneralizedDynamicDoubleArray<>();

    @Test
    public void testGeneralizedArray() {
        assertEquals(0, array.size());
        array.add(13);
        array.add(23);
        assertEquals(2, array.size());
        try {
            array.remove(100);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("There is no such index in array!", e.getMessage());
        }

        array.remove(1);
        assertEquals(1, array.size());

        array.add(43);
        array.add(53);
        array.add(63);

        assertEquals((int) array.get(2), 53);

        array.remove(0);
        array.remove(0);
        array.remove(0);
        array.remove(0);

        assertEquals(0, array.size());


        try {
            array.remove(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("There is no such index in array!", e.getMessage());
        }
    }

}