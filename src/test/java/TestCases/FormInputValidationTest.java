package TestCases;

import Listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.FormInputValidationFunc;
import utils.BaseTest;

@Listeners({Listener.class})
public class FormInputValidationTest extends BaseTest {

    @Test
    public void formInputValidation(){
        FormInputValidationFunc formInputValidationFunc = new FormInputValidationFunc(driver);
        formInputValidationFunc.formInputValidation();
    }

}
