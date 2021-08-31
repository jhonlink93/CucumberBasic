package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class InitialPage {
    public InitialPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Elements')]")
    public WebElement cardElements;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Widgets')]")
    public WebElement cardWidgets;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Alerts')]")
    public WebElement cardAlerts;

    public void clickCardElements(){
        cardElements.click();
    }
    public void clickCardWidgets(){
        cardWidgets.click();
    }
    public void clickCarAlerts(){
        cardAlerts.click();
    }

}
