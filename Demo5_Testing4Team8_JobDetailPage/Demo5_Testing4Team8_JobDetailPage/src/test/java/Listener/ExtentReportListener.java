package Listener;

import Scripts.BaseTest.LoggedInBaseTest;
import Scripts.BaseTest.NotLoggedInBaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ExtentManager;
import utilities.ScreenshotManager;

public class ExtentReportListener implements ITestListener {
    public static ExtentReports extent = ExtentManager.createInstance();
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test result: PASS " +getTestDescription(result));
    }

    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, getTestDescription(result));
        try {
//            Object currentClass = result.getInstance();
//            WebDriver driver = ((LoggedInBaseTest) currentClass).getDriver();
            Object currentClass = result.getInstance();
            WebDriver driver = null;

            if (currentClass instanceof LoggedInBaseTest) {
                driver = ((LoggedInBaseTest) currentClass).getDriver();
            } else if (currentClass instanceof NotLoggedInBaseTest) {
                driver = ((NotLoggedInBaseTest) currentClass).getDriver();
            }
            if (driver != null) {
                String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
                String customName = "Error_Screenshot_" + result.getMethod().getMethodName();
                test.get().log(Status.FAIL, "Test result: " + result.getThrowable().getMessage());
                test.get().log(Status.INFO, "📸 Screenshot Evidence: " , MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                ScreenshotManager.addDownloadableScreenshot(test.get(), driver, result.getMethod().getMethodName());
            }}
         catch (Exception e) {
            e.printStackTrace();}

//            }
//            if (driver != null) {
//            if (currentClass instanceof LoggedInBaseTest) {
//                driver = ((LoggedInBaseTest) currentClass).getDriver();
//            } else if (currentClass instanceof NotLoggedInBaseTest) {
//                driver = ((NotLoggedInBaseTest) currentClass).getDriver();
//            }
////      Dùng Base64 thay vì file path
//            String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//            String customName = "Error_Screenshot_" + result.getMethod().getMethodName();
//            test.get().log(Status.FAIL, "Test result: " + result.getThrowable().getMessage());
//            test.get().log(Status.INFO, "📸 Screenshot Evidence: " , MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//            ScreenshotManager.addDownloadableScreenshot(test.get(), driver, result.getMethod().getMethodName());
//
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        }

    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    public void onFinish(ITestContext result) {
//        log.info("End testing " + result.getName());
        //Kết thúc và thực thi Extents Report
        extent.flush();
    }

    public static ExtentTest getTest() {
        return test.get();
    }
}
