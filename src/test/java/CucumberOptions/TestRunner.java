package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/FeatureFiles" ,  //Featurefile path
			glue="StepDefinitionFiles" //write same as the package name given
			
			)	
	public class TestRunner {

}
