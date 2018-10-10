import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Created by Vitalii Smokov in 04-Oct-18
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"steps"}
)
public class TestRunner {
}
