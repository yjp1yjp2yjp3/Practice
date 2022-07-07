package com.practice.Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * EhmWorkflowDwhControllerApiTest test
 */
public class DateUtilTest {

    @Test
    public void shoulReturnCorrectValue_WhenInvoke () {
        assertEquals(-1, DateUtil.dayOfYear(0, 1, 33));
        assertEquals(-1, DateUtil.dayOfYear(2022, 13, 1));
        assertEquals(-1, DateUtil.dayOfYear(2022, 1, 33));
        assertEquals(-1, DateUtil.dayOfYear(2022, 1, 0));
        assertEquals(-1, DateUtil.dayOfYear(2015, 2, 29));
        assertEquals(-1, DateUtil.dayOfYear(2016, 2, 30));
        assertEquals(3, DateUtil.dayOfYear(2016, 1, 3));
        assertEquals(32, DateUtil.dayOfYear(2016, 2, 1));
        assertEquals(60, DateUtil.dayOfYear(2016, 2, 29));
        assertEquals(59, DateUtil.dayOfYear(2000, 2, 28));
    }
}