package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;


public class SubsortTest {
    public ISubsort subsort;

    @BeforeEach
    public void init() {
        // ===== ARRANGE =====
        subsort = new Subsort();
    }

    @Test
    public void test_2_9() {
        // ===== ACT =====
        int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int[] result = this.subsort.subsort(array);

        // ===== ASSERT =====
        int[] expected = {2,9};
            assertArrayEquals(result, expected);
    }

    @Test
    public void test_3_9() {
        // ===== ACT =====
        int[] array = {1, 2, 3, 7, 10, 11, 7, 12, 6, 4, 16, 18, 19};
        int[] result = this.subsort.subsort(array);

        // ===== ASSERT =====
        int[] expected = {3,9};
        assertArrayEquals(result, expected);
    }

    @Test
    public void test() {
        // ===== ACT =====
        int[] array = {1, 2, 3, 5, 10, 11, 7, 12, 6, 15, 16, 18, 19};
        int[] result = this.subsort.subsort(array);

        // ===== ASSERT =====
        int[] expected = {6,8};
        assertArrayEquals(result, expected);
    }


}