package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1; // Return -1 if "gold" fuzzy is not found
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int left = 0;
        int right = fuzzies.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = fuzzies.get(mid).color.compareTo("gold");

            if (comparison == 0) {
                return mid; // Found the "gold" fuzzy
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if "gold" fuzzy is not found
    }
    }
