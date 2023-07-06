package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = {"src/test/resources/features/base.feature"},
        tags = "@base",
        glue = {"stepdefinitions", "project.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class Runner {
}
