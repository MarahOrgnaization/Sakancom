package najah.edu.acceptance_tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
	
		features="MyFeatures",///testModifyInformation.feature",
		plugin="html:target/cucumber/report.html",
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue="najah.edu.acceptance_tests")


public class sakancom {

}