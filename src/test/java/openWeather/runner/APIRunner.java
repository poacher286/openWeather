package openWeather.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"openWeather.stepDef"},
        tags = "not @Ignore",
        publish = true,
        plugin = {"pretty"})
public class APIRunner {
}
