package Scripts.ProfileTest;

import Listener.ExtentReportListener;
import Listener.SimpleListener;
import Pages.DetailJobPage;
import Pages.ProfilePage;
import Scripts.BaseTest.LoggedInBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SimpleListener.class, ExtentReportListener.class})
public class ProfileTest extends LoggedInBaseTest {

    @Test (priority = 1, description = "Check If Job List Is Empty or Not")
    public void testJobDisplayEmpty() {
        ProfilePage profilePage = new ProfilePage(driver);
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.verifyJobDisplayEmpty();
    }

    @Test (description = "Check Hired Job List Content Display")
    public void testJobDisplay() {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
        detailJobPage.clickTabBasic();
        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        Logs.log.info("Da truy cap trang Profile");
        profilePage.verifyJobDisplay();
        profilePage.verifyJobDetailContent();
    }

    @Test (description = "Check Hired Job List - View Detail Button")
    public void testViewDetailButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        Logs.log.info("Da truy cap trang Profile");
        profilePage.verifyViewDetailButton();
    }

    @Test (description = "Check Hired Job List - Delete Button & Alert")
    public void testDelButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyAlertDisplay();
    }

    @Test (description = "Check DEL Alert - Alert Auto Close")
    public void testAlertAutoClose() {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyAlertAutoClose();
    }

    @Test (description = "Check DEL Alert - X Button")
    public void testAlertCloseButton() {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyAlertCloseButton();
    }

    @Test (description = "Check DEL Alert - Click alert to close")
    public void testAlertDisplayWhenClicking() {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyAlertDisplayWhenClicking();
    }

    @Test (description = "Check DEL Alert - Hover")
    public void testHoverAlert() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyHoverAlert();
    }

    @Test (description = "Check DEL Alert - Move Out")
    public void testMoveOutAlert() {
        ProfilePage profilePage = new ProfilePage(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        Thực thi xử lý thuê Job trong trường hợp Job chưa được thuê
//        detailJobPage.clickTabBasic();
//        detailJobPage.clickContinueButton();
        driver.navigate().to("https://demo5.cybersoft.edu.vn/profile");
        profilePage.clickDelButton();
        profilePage.verifyMoveOutAlert();
    }
}
