package com.rw.dip.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber/reports/report.html",
                "json:target/cucumber/reports/cucumber.json",
                "junit:target/cucumber/reports/cucumber.xml",
                "timeline:target/cucumber/reports/timeline",
                "rerun:target/cucumber/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = { "com.rw.dip.steps" },
        monochrome = true
)
public class TestRunner {
}
