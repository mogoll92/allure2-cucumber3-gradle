import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Created by Vitalii Smokov in 04-Oct-18
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"test/features/"},
        glue = {"test/steps/MyStepdefs"}
)
public class TestRunner {
}
