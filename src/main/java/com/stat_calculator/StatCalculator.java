package com.stat_calculator;

import java.text.DecimalFormat;

public class StatCalculator {
    public int getMinimumValue(int[] integers) {
        int minValue = integers[0];
        for (int integer : integers) {
            if (integer < minValue) {
                minValue = integer;
            }
        }
        return minValue;
    }

    public int getMaximumValue(int[] integers) {
        int maxValue = integers[0];
        for (int integer : integers) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }
        return maxValue;
    }

    public int getLength(int[] integers) {
        return integers.length;
    }

    public double getAverage(int[] integers) {
        int sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        double average = sum / (double) integers.length;
        return  Math.round(average * 100) / 100.0;
    }

}
