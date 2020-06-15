package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FormInputValidationFunc extends BasePage {
    public FormInputValidationFunc(WebDriver driver) {
        super(driver);
    }


    public By orderCreditOnline = By.className("br_col_before");
    public By submitButton = By.id("submitButton");
    public By name = By.name("name");
    public By surname = By.name("surname");
    public By phone = By.xpath("//input[@placeholder='Enter phone number']");
    public By card = By.xpath("//input[@placeholder='Salary or pension card number']");

    public void formInputValidation() {

        driver.get(baseEN);
        element(orderCreditOnline).click();
    /*    element(name).click();
        sendKeys(name, "asdsadasd");
        element(surname).click();
        sendKeys(surname, "asdsadasd");
        element(phone).click();
        sendKeys(phone, "123456789");
        element(card).click();
        sendKeys(card, "1234123456789807");*/
        element(submitButton).click();
        List<WebElement> list = driver.findElements(By.className("error"));
        assertTrue(list.size() > 0);
    }
}
