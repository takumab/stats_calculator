package com.stat_calculator;

/*
    Your task is to process a sequence of integer numbers to determine the following statistics:
        • minimum value
        • maximum value
        • number of elements in the sequence
        • average value
    For example: [6, 9, 15, -2, 92, 11]
        • minimum value = -2
        • maximum value = 92
        • number of elements in the sequence = 6
        • average value = 21.83
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatCalculatorShould {

    @Test
    void determine_minimum_value() {
        StatCalculator stats = new StatCalculator();
        int[] integers = {6, 9, 15, -2, 92, 11};

        assertEquals(-2, stats.getMinimumValue(integers));
    }

    @Test
    void determine_maximum_value() {
        StatCalculator stats = new StatCalculator();
        int[] integers = {6, 9, 15, -2, 92, 11};

        assertEquals(92, stats.getMaximumValue(integers));
    }

    @Test
    void determine_number_of_elements_in_sequence() {
        StatCalculator stats = new StatCalculator();
        int[] integers = {6, 9, 15, -2, 92, 11};

        assertEquals(6, stats.getLength(integers));
    }

    @Test
    void determine_average_value() {
        StatCalculator stats = new StatCalculator();
        int[] integers = {6, 9, 15, -2, 92, 11};

        assertEquals(21.83, stats.getAverage(integers));
    }


}
