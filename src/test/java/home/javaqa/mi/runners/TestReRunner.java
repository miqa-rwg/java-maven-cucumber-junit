package home.javaqa.mi.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber-rerun.json",
                "junit:target/cucumber-reports/cucumber-rerun.xml",
                "html:target/cucumber-reports/output/report-rerun.html",
        },
//        features = "@target/rerun.txt",
        glue = { "home.javaqa.mi.steps" },
        monochrome = true
)
public class TestReRunner {
}
