package com.example.limitsservice.controller;

import com.example.limitsservice.config.Configuration;
import com.example.limitsservice.config.LimitConfiguration;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    //localhost:9090/limits
    @GetMapping("limits")
    public LimitConfiguration retrieveLimitConfig ( ) {
        LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMax(), configuration.getMin());
        log.info(limitConfiguration);
        return limitConfiguration;
    }
}
