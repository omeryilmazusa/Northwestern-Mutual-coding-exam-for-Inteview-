package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"pretty",
                "html:target\\cucumber-html-report",
                "json:target\\cucumber.json",
                "junit:target\\cucumber.xml",
                "rerun:target\\rerun.txt" },

        features = "src/test/resources/Features/TypicodeAPI/TypicodeAPI.feature",
        strict = true,
        glue = "StepDefinitions",
        dryRun = true,
         tags = ""


//        features = "src/test/resources/Features",
//        glue = "StepDefinitions",
//        dryRun = false,
//        tags = ""
)
public class CukesRunner  {
}
