package TestCases;

import Listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.ChangeLanguageFunc;
import utils.BaseTest;

@Listeners({Listener.class})
public class ChangeLanguageTest extends BaseTest {

    @Test
    public void checkLanguage(){
        ChangeLanguageFunc changeLanguageFunc = new ChangeLanguageFunc(driver);
        changeLanguageFunc.changeLanguage();
    }

}
