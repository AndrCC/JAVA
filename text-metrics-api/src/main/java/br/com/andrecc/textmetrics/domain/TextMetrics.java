package br.com.andrecc.textmetrics.domain;

public record TextMetrics(
        int charCount,
        int wordCount,
        double averageWordLength
) {}
