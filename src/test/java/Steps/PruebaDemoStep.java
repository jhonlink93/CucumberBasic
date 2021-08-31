package Steps;

import Base.BaseUtil;
import Pages.AlertsPage;
import Pages.DatePickerPage;
import Pages.ElementsPage;
import Pages.InitialPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import io.cucumber.java8.El;


public class PruebaDemoStep extends BaseUtil {
    private BaseUtil baseUtil;

    public PruebaDemoStep(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("El usuario ingresa a la pagina demoqa")
    public void elUsuarioIngresaALaPaginaDemoqa() {
        baseUtil.webDriver.navigate().to("https://demoqa.com/");
    }

    @And("Selecciona el card con la opcion elements")
    public void seleccionaElCardConLaOpcionCard() {
        InitialPage page = new InitialPage(baseUtil.webDriver);
        page.clickCardElements();
    }

    @And("^Da click en la opcion WebTables$")
    public void daClickEnLaOpcionOpcion() {
        ElementsPage page = new ElementsPage(baseUtil.webDriver);
        page.clickOptionWebTables();
    }

    @And("^Elimina la columna numero ([^\"]*)$")
    public void eliminaLaColumnaConElNombreEliminarColumna(Integer columna) {
        ElementsPage pageElements = new ElementsPage(baseUtil.webDriver);
        pageElements.deleteRegister(columna);
    }

    @And("Da click en el boton Add")
    public void daClickEnElBotonAdd() {
        ElementsPage pageElements = new ElementsPage(baseUtil.webDriver);
        pageElements.clickBtnAdd();
    }

    @And("^Llena el formulario ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)$")
    public void llenaElFormulario(String firstName, String lastName,
                                  String email, String age, String salary, String department) {
        ElementsPage pageElements = new ElementsPage(baseUtil.webDriver);
        pageElements.fillRegistrationForm(firstName, lastName, email, age, salary, department);
    }

    @And("Selecciona el card con la opcion Widgets")
    public void seleccionaElCardConLaOpcionWidgets() {
        InitialPage page = new InitialPage(baseUtil.webDriver);
        page.clickCardWidgets();
    }

    @And("Da click en la opcion DatePicker")
    public void daClickEnLaOpcionDatePicker()  {
        try { Thread.sleep(3000);}
        catch (InterruptedException e) {}
        DatePickerPage page = new DatePickerPage(baseUtil.webDriver);
        page.clickOptionDatePicker();
    }

    @And("Da click en la opcion Date Picker")
    public void daClickEnLaOpcionDate_Picker()  {
        DatePickerPage datePickerPage = new DatePickerPage(baseUtil.webDriver);
        datePickerPage.clickOptionDatePicker();
    }

    @And("^Selecciona la fecha ([^\"]*)$")
    public void seleccionaLaFechaFecha(String fecha) {
        DatePickerPage page = new DatePickerPage(baseUtil.webDriver);
        page.fillDatePicker(fecha);
    }
    @And("^Selecciona fecha con hora ([^\"]*)$")
    public void seleccionaLaFechaConHoraFechaHora(String fechaHora) {
        DatePickerPage page = new DatePickerPage(baseUtil.webDriver);
        page.fillDateTimePicker(fechaHora);
    }

    @And("Selecciona el card con la opcion Alerts")
    public void seleccionaElCardConLaOpcionAlerts() {
        InitialPage initialPage = new InitialPage(baseUtil.webDriver);
        initialPage.clickCarAlerts();
    }

    @And("Da click en la opcion Alerts")
    public void daClickEnLaOpcionAlerts() {
        AlertsPage alertsPage = new AlertsPage(baseUtil.webDriver);
        alertsPage.clickOptAlerts();
    }

    @And("Maneja la primera alerta")
    public void manejaLaPrimeraAlerta() {
        AlertsPage alertsPage = new AlertsPage(baseUtil.webDriver);
        alertsPage.clickBtnAlerts();
        baseUtil.webDriver.switchTo().alert().accept();
    }

    @And("Maneja la alerta de cinco segundos")
    public void manejaLaAlertaDeSegundos() {
        AlertsPage alertsPage = new AlertsPage(baseUtil.webDriver);
        alertsPage.clickBtnAlertsTime();
        try { Thread.sleep(6000);}
        catch (InterruptedException e) {}
        baseUtil.webDriver.switchTo().alert().accept();
    }

    @And("Maneja la alerta confirm box")
    public void manejaLaAlertaConfirmBox() {
        AlertsPage alertsPage = new AlertsPage(baseUtil.webDriver);
        alertsPage.clickBtnAlertsConfirm();
        baseUtil.webDriver.switchTo().alert().accept();
    }

    @And("Maneja la alerta promt box")
    public void manejaLaAlertaPromtBox() {
        AlertsPage alertsPage = new AlertsPage(baseUtil.webDriver);
        alertsPage.clickBtnAlertsConfirm();
        baseUtil.webDriver.switchTo().alert().dismiss();
    }
}
