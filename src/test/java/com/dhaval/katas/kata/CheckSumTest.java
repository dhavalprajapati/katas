package com.dhaval.katas.kata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckSumTest {

    @Test
    public void isValidCheckSum() {
        assertTrue(CheckSum.validCheckSum("107073"));
        assertTrue(CheckSum.validCheckSum("50000"));
        assertTrue(!CheckSum.validCheckSum("111111"));
    }
}
