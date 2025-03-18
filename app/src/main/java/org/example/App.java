package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

    int testOne = finder.linearSearch(sortedFuzzies);
    int testTwo = finder.binarySearch(sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);
    int testFour = finder.binarySearch(randomFuzzies);

    System.out.println((testOne == -1) ? ("\ngold was not found in the arraylist") : ("\nTest One: gold was found at index " + testOne));
    System.out.println((testTwo == -1) ? ("\ngold was not found in the arraylist") : ("\nTest Two: gold was found at index " + testTwo));
    System.out.println((testThree == -1) ? ("\ngold was not found in the arraylist") : ("\nTest Three: gold was found at index " + testThree));
    System.out.println((testFour == -1)?("\ngold was not found in the arraylist"):("\nTest Four: gold was found at index" + testFour));
  }
}
