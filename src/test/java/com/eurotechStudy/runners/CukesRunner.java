package com.eurotechStudy.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue ="com/eurotechStudy/step_definitions",
        dryRun = false,
        tags="@123"
)



public class CukesRunner {
}
/*
Create a new feature file - name it "NavigationMenu.feature" - write scenarios inside it

Scenario 1:
Login as Teacher
At first get the text of welcome
Then go to Developers menu and get the text of Developers

Scenario 2:
Login as Teacher
Get the text of welcome
Then go to All Posts menu and get the text of Posts

Scenario 3:
Login as Teacher
Get the text of welcome
Then go to My Account menu and get the text of Dashboard

- Write scenarios
- Create step definitions
- Copy the undefined steps from console and paste to step definitions
- Implement step definitions by adding println

*/

