package Listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult result) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("fail");
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void onFinish(ITestContext context) {
        driver.quit();
    }
}
