package br.com.andrecc.textmetrics.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextMetricsCalculatorTest {

    @Test
    void shouldReturnZeroMetricsWhenTextIsBlank() {
        TextMetricsCalculator calc = new TextMetricsCalculator();

        TextMetrics result = calc.calculate("   ");

        assertEquals(0, result.charCount());
        assertEquals(0, result.wordCount());
        assertEquals(0.0, result.averageWordLength());
    }

    @Test
    void shouldCalculateMetricsCorrectly() {
        TextMetricsCalculator calc = new TextMetricsCalculator();

        TextMetrics result = calc.calculate("hello world");

        assertEquals(11, result.charCount());
        assertEquals(2, result.wordCount());
        assertEquals(5.0, result.averageWordLength());
    }
}
