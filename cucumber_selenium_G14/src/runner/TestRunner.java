package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features/MyHelp.feature", glue="stepDefinition")
public class TestRunner {

}
