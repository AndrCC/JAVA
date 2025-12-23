package br.com.andrecc.textmetrics.application;

import br.com.andrecc.textmetrics.domain.TextMetrics;
import br.com.andrecc.textmetrics.domain.TextMetricsCalculator;
import org.springframework.stereotype.Service;

@Service
public class TextMetricsService {

    private final TextMetricsCalculator calculator = new TextMetricsCalculator();   

    public TextMetrics calculateMetrics(String text) {
        return calculator.calculate(text);
    }
}   