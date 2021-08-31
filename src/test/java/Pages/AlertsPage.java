package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertsPage {

    public AlertsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Alerts')]")
    public WebElement optAlerts;

    @FindBy(how = How.ID, using = "alertButton")
    public WebElement btnAlert;

    @FindBy(how = How.ID, using = "timerAlertButton")
    public WebElement btnTimerAlertButton;

    @FindBy(how = How.ID, using = "confirmButton")
    public WebElement btnAlertConfirmButton;

    @FindBy(how = How.ID, using = "promtButton")
    public WebElement btnPromtButtonn;


    public void clickOptAlerts(){
        optAlerts.click();

    }

    public void clickBtnAlerts(){
        btnAlert.click();
    }
    public void clickBtnAlertsTime(){
        btnTimerAlertButton.click();
    }
    public void clickBtnAlertsConfirm(){
        btnAlertConfirmButton.click();
    }
    public void clickPromtAlerts(){
        btnPromtButtonn.click();
    }

}
