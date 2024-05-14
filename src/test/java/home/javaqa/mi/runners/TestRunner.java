package home.javaqa.mi.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/cucumber-reports/output/report.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = { "home.javaqa.mi.steps" },
        monochrome = true
)
public class TestRunner {
}
