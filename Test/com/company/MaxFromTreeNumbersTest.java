package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxFromTreeNumbersTest {

    @Test
    public void MaxValue_FirstTest() {
        MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
        assertEquals(4,maxFromTreeNumbers.maxNumber(2,3,4));
    }
    @Test

    public void MaxValue_SecondTest() {
        MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
        assertEquals(4,maxFromTreeNumbers.maxNumber(1,3,4));
    }

}


