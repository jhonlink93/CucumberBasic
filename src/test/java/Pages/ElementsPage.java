package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class ElementsPage {

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "item-3")
    public WebElement optionWebTables;

    @FindBy(how = How.ID, using = "addNewRecordButton")
    public WebElement btnAdd;

    @FindBy(how = How.ID, using = "firstName")
    public WebElement txtFirstName;

    @FindBy(how = How.ID, using = "lastName")
    public WebElement txtLastName;

    @FindBy(how = How.ID, using = "userEmail")
    public WebElement txtUserEmail;

    @FindBy(how = How.ID, using = "age")
    public WebElement txtAge;

    @FindBy(how = How.ID, using = "salary")
    public WebElement txtSalary;

    @FindBy(how = How.ID, using = "department")
    public WebElement txtDepartment;

    @FindBy(how = How.ID, using = "submit")
    public WebElement btnSubmitRegistration;

    @FindAll
    (@FindBy(how = How.XPATH, using = "//*[@title='Delete']"))
    public List<WebElement> listBtnDelete;

    public void clickBtnAdd() {
        btnAdd.click();
    }

    public void clickOptionWebTables() {
        optionWebTables.click();
    }
    public void fillRegistrationForm(String firstName, String lastName,
                                     String email, String age, String salary,String department){
    txtFirstName.sendKeys(firstName);
    txtLastName.sendKeys(lastName);
    txtUserEmail.sendKeys(email);
    txtAge.sendKeys(age);
    txtSalary.sendKeys(salary);
    txtDepartment.sendKeys(department);
    btnSubmitRegistration.submit();
    }
    public void deleteRegister(Integer postion){
    listBtnDelete.get(postion).click();
    }

}
