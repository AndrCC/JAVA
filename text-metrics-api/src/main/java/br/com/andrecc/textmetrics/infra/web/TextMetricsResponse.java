package br.com.andrecc.textmetrics.infra.web;   

public record TextMetricsResponse(  
    int characterCount,  
    int wordCount,  
    double averageWordLength  
) {}    