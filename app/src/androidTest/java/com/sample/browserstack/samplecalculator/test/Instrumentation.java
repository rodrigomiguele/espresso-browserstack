package com.sample.browserstack.samplecalculator.test;

import android.os.Bundle;
import android.support.test.runner.MonitoringInstrumentation;

import org.junit.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberInstrumentationCore;

@CucumberOptions(
        features = "features",
        glue = "com.sample.browserstack.samplecalculator.steps")
public class Instrumentation extends MonitoringInstrumentation {

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        instrumentationCore.create(arguments);

        start();
    }

    @Override
    public void onStart() {
        super.onStart();
        instrumentationCore.start();
    }

    @Test
    public void runAllTests(){

    }

}