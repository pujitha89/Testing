package cucumberOptions;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/req1.feature",glue="stepDefinition",tags="@RegressionTest")
public class TestRunner1 {


}
