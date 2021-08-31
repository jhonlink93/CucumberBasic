package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.util.List;

public class DatePickerPage {

    public DatePickerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Date Picker')]")
    public WebElement optionDatePicker;

    @FindBy(how = How.ID, using = "datePickerMonthYearInput")
    public WebElement inputDatePicker;

    @FindBy(how = How.ID, using = "dateAndTimePickerInput")
    public WebElement inputDateTimePicker;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__month-read-view--selected-month")
    public WebElement btnMonths;

    @FindAll(
    @FindBy(how = How.XPATH, using = "//*[@class,'react-datepicker__month-option')]"))
    public List<WebElement> listMonths;

    public void fillDatePicker(String fecha){
        while(!inputDatePicker.getAttribute ("value").equals("")){
            inputDatePicker.sendKeys(Keys.BACK_SPACE);
        }
        inputDatePicker.sendKeys(fecha);
        inputDatePicker.sendKeys(Keys.ENTER);
    }

    public void fillDateTimePicker(String fecha){
        while(!inputDateTimePicker.getAttribute ("value").equals("")){
            inputDateTimePicker.sendKeys(Keys.BACK_SPACE);
        }
        inputDateTimePicker.sendKeys(fecha);
        inputDatePicker.sendKeys(Keys.ENTER);
    }
    public void clickOptionDatePicker() {
        optionDatePicker.click();
    }

}
