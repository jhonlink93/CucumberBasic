package Runner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"} ,glue = {"Steps"}, publish = true,
        plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
