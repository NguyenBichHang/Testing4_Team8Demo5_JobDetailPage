package Scripts.BaseTest;

import Pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LoggedInBaseTest {
    public WebDriver driver;
    static Logger log = LogManager.getLogger("Logged In Base Test");

    public WebDriver getDriver() {
        return driver;
    }
    @BeforeMethod
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://demo5.cybersoft.edu.vn/login");
        loginPage.login("bichhanghbn@gmail.com","bichhang777#");
        log.info("Da login thanh cong");
        driver.navigate().to("https://demo5.cybersoft.edu.vn/jobDetail/5");
        log.info("Da truy cap trang Job Detail");
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
//        driver.close();
    }
}
