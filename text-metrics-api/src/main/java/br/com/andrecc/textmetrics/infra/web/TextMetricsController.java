package br.com.andrecc.textmetrics.infra.web;

import br.com.andrecc.textmetrics.application.TextMetricsService;
import br.com.andrecc.textmetrics.domain.TextMetrics;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metrics")
public class TextMetricsController {

    private final TextMetricsService service;

    public TextMetricsController(TextMetricsService service) {
        this.service = service;
    }

    @PostMapping
    public TextMetricsResponse calculate(@RequestBody TextMetricsRequest request) {
        TextMetrics metrics = service.calculateMetrics(request.text());

        return new TextMetricsResponse(
                metrics.charCount(),
                metrics.wordCount(),
                metrics.averageWordLength()
        );
    }
}
