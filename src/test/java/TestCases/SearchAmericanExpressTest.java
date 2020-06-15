package TestCases;

import Listener.Listener;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.ChangeLanguageFunc;
import testCaseFunctions.SearchAmericanExpressFunc;
import utils.BaseTest;

@Listeners(Listener.class)
public class SearchAmericanExpressTest extends BaseTest {

    @Test
    public void searchAmericanExpress(){

        SearchAmericanExpressFunc searchAmericanExpressFunc = new SearchAmericanExpressFunc(driver);
        searchAmericanExpressFunc.searchAmericanExpress();

    }


}
