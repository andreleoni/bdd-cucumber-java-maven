package olympus.domain.model.ticket;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import olympus.utils.AbstractDefs;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/olympus/domain/model/ticket")
public class TestExecution extends AbstractDefs {

}
