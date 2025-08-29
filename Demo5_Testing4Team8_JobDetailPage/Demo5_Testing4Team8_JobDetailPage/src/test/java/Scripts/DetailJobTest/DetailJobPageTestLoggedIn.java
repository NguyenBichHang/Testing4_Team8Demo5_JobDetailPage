package Scripts.DetailJobTest;

import Listener.ExtentReportListener;
import Listener.SimpleListener;
import Pages.DetailJobPage;
import Scripts.BaseTest.LoggedInBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SimpleListener.class, ExtentReportListener.class})
public class DetailJobPageTestLoggedIn extends LoggedInBaseTest {
    @Test
    public void testDefaultValue() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.textareaDefaultValue();
    }

    @Test
    public void testCommentSuccess() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("hangtest");
    }

    @Test
    public void testCommentWithoutInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextareaRequired();
    }

    //    Test Seacrh Box
    @Test
    public void testTextboxSearchPlaceholder() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextboxSearchPlaceholder();
    }

    @Test
    public void testSearchWithValidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("hangtest");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyValidSearchResult("hangtest");
    }

    @Test
    public void testSearchWithEmptyInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyAllCommentsAreDisplayed();
    }

    @Test
    public void testSearchWithInvalidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("NonExistent");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyInvalidSearchResult("NonExistent");
    }

}
