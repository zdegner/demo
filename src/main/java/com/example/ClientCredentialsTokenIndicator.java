package com.example;

import io.micronaut.context.annotation.Requires;
import io.micronaut.management.health.indicator.AbstractHealthIndicator;
import io.micronaut.management.health.indicator.HealthIndicator;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
@Requires(classes = HealthIndicator.class)
public class ClientCredentialsTokenIndicator extends AbstractHealthIndicator<Map<String, Object>> {

    public static final String INDICATOR_NAME = "always-fails";

    @Override
    public String getName() {
        return INDICATOR_NAME;
    }

    @Override
    protected Map<String, Object> getHealthInformation() {
        throw new IllegalStateException("Expect this indicator to fail");
    }
}