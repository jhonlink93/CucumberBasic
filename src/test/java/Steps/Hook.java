package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void initialize(Scenario scenario) {
        System.out.println("opening browser chrome  and before: " + scenario.getName());
        System.setProperty("webdriver.chrome.driver", "/Users/dreamcode/Downloads/chromedriver");
        baseUtil.webDriver = new ChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        //System.out.println("closing browser  and after: " + scenario.getName());
        baseUtil.webDriver.close();
    }
}
