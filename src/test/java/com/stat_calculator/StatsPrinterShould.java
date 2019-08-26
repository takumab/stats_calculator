package com.stat_calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StatsPrinterShould {
    @Test
    void print_all_stats() {
        StatCalculator statsCalculator = mock(StatCalculator.class);
        StatsPrinter printer = new StatsPrinter(statsCalculator);

        printer.printStats();

        verify(statsCalculator).getStats();
    }
}
