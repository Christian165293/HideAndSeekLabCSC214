package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FuzzyFinderTest {
    @Test
    void testLinearSearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = finder.linearSearch(sortedFuzzies);

        assertNotEquals(-1, index, "Linear search should find the 'gold' fuzzy in the sorted list");
        assertEquals("gold", sortedFuzzies.get(index).color, "The found fuzzy should be 'gold'");
    }

    @Test
    void testBinarySearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = finder.binarySearch(sortedFuzzies);

        assertNotEquals(-1, index, "Binary search should find the 'gold' fuzzy in the sorted list");
        assertEquals("gold", sortedFuzzies.get(index).color, "The found fuzzy should be 'gold'");
    }

    @Test
    void testLinearSearchOnRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.linearSearch(randomFuzzies);

        assertNotEquals(-1, index, "Linear search should find the 'gold' fuzzy in the randomized list");
        assertEquals("gold", randomFuzzies.get(index).color, "The found fuzzy should be 'gold'");
    }

    @Test
    void testBinarySearchOnRandomizedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.binarySearch(randomFuzzies);

        // Binary search may not work on a randomized list, so we expect it to fail
        assertEquals(-1, index, "Binary search should not find the 'gold' fuzzy in the randomized list");
    }
}