package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import static org.testng.Assert.assertEquals;

public class ChangeLanguageFunc extends BasePage {

    public By btnEn = By.cssSelector("body > div.not_low_content.lang_nup_default > div.total_wrap_all > div.main_page_wrap > footer > div.footer_right.clear > div > ul.langs > li:nth-child(1) > a");
    public String currentUrl = driver.getCurrentUrl();
    public WebDriverWait wait = new WebDriverWait(driver, 20);


    public ChangeLanguageFunc(WebDriver driver) {
        super(driver);
    }

    public void changeLanguage() {
        if (!equals(baseEN)) {
            element(btnEn).click();
        }
        assertEquals(driver.getCurrentUrl(), baseEN);
    }
}