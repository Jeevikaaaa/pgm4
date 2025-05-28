package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSum() {
        // Since sum is static, call it on the class directly
        assertEquals(5, App.sum(2, 3), "2 + 3 should equal 5");
    }
}
