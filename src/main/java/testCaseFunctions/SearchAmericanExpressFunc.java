package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;

import static org.testng.Assert.assertEquals;

public class SearchAmericanExpressFunc extends BasePage {
    public SearchAmericanExpressFunc(WebDriver driver) {
        super(driver);
    }

    public By search = By.cssSelector("body > div.not_low_content.lang_nup_en > div.total_wrap_all > div.main_page_wrap > div > div > div > div > div.search_input > div > input");
    public String searchText1 = "American";
    public String searchText2 = "Express";
    public By banner = By.className("flickity-slider");
    public By card = By.className("card_left");
    public By listedCard = By.xpath("//*[@class='col card_block pull']");

    public void searchAmericanExpress() {
        driver.get(baseEN);
        element(search).click();
        sendKeys(search, searchText1);
        wait.until(ExpectedConditions.presenceOfElementLocated(card));
        sendKeys(search, String.valueOf(Keys.SPACE));
        sendKeys(search, searchText2);

        list(listedCard);
        int size = list(listedCard).size();
        assertEquals(size, 2);
    }
}
