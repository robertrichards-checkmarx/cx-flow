package com.checkmarx.flow.cucumber.integration.jira.load;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@CucumberOptions(plugin = { "pretty", "summary", "html:build/cucumber/component/api", "json:build/cucumber/component/api/cucumber.json" },
        features = "classpath:cucumber/features/integrationTests/jira/jira-load.feature",
        glue = { "com.checkmarx.flow.cucumber.integration.jira" },
        tags = "@Integration and not @Skip")
public class JiraLoadTestRunner {
}
