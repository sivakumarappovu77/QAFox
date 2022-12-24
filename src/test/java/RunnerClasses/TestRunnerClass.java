package RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\sivakumar\\eclipse-workspace\\QAFox\\FeatureFiles1\\QAFoxFeature.feature",
		glue="testDefinitions"
//		dryRun=true
		)
public class TestRunnerClass {

}
