package br.com.andrecc.textmetrics.domain;

public class TextMetricsCalculator {

    public TextMetrics calculate(String text) {
        if (text == null || text.isBlank()) {
            return new TextMetrics(0, 0, 0.0);
        }

        String trimmed = text.trim();
        int charCount = trimmed.length();

        String[] words = trimmed.split("\\s+");
        int wordCount = words.length;

        int totalChars = 0;
        for (String w : words) {
            totalChars += w.length();
        }

        double average = (double) totalChars / wordCount;

        return new TextMetrics(charCount, wordCount, average);
    }
}