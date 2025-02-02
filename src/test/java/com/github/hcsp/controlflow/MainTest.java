package com.github.hcsp.controlflow;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int n = new java.util.Random().nextInt(50) + 50;
        String str =
                java.util.stream.IntStream.range(n, n + 10)
                        .mapToObj(i -> String.format("%c", i))
                        .collect(java.util.stream.Collectors.joining(""));
        assertTrue(Main.isSymmetric(str + new StringBuilder(str).reverse().toString()));
        assertFalse(Main.isSymmetric(str + new StringBuilder(str).reverse().toString() + "111"));
    }
}
