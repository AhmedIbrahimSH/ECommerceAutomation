package Testing;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
public class running {
    @CucumberOptions(
            features = "src\\main\\resources\\features",
            glue = {"org.example.stepdefinitions"},
            plugin = {"pretty", "html:target/cucumber.html" , "json: target/cucumber.json" , "junit : target/cukes.xml" , "rerun : target/rerun.txt"},
            tags = "@smoke"
    )
    public class TestRunner extends AbstractTestNGCucumberTests {
    }
}
