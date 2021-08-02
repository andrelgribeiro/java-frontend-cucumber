package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        tags = {"@hypeflame"},
        features = "src/test/resources/features/",
        glue = {"selenium.pages"}
)

public class Runner {
}
