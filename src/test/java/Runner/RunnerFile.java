package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/feature/EditLead.feature"},glue= {"pages","Runner"}, monochrome=true)

public class RunnerFile {


}
