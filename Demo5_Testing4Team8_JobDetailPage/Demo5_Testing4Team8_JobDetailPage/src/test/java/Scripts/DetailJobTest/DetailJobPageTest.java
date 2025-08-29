package Scripts.DetailJobTest;

import Listener.ExtentReportListener;
import Listener.SimpleListener;
import Pages.DetailJobPage;
import Scripts.BaseTest.NotLoggedInBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SimpleListener.class, ExtentReportListener.class})
public class DetailJobPageTest extends NotLoggedInBaseTest {

    //    Test Package
    @Test
    public void testContinueButtonTabBasicNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testContinueButtonTabStandardNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testContinueButtonTabPremiumNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabBasicNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabStandardNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabPremiumNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    //    Test About The Seller
    @Test
    public void testContactMeButtonNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyContactMeButtonNotLoggedIn();
    }

    //    Test FAQ Section
    @Test
    public void testFAQSectionDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyFAQSectionDisplay();
    }

    @Test
    public void testFAQDefaultDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyQuestionDefaultDisplay();
    }

    @Test
    public void testAnswerDisplayWhenCLickQuestion() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerDisplayWhenCLicking();
    }

    @Test
    public void testAnswerHiddenWhenClosing() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerHiddenWhenClosing();
    }

    //    Test Comment List
    @Test
    public void testCommentList_WhenCommentsExist() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyCommentListDisplay();
    }

    @Test
    public void testCommentList_WhenNoComment() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyNoCommentDisplayedWithMessage();
    }

    //  *****
    //  *****Test Comment Section*****

    @Test (description = "Check Comment Fail - Not Logged In - Input Comment")
    public void testCommentNotLoggedIn_InputComment() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.clickCommentButton();
        detailJobPage.verifyCommentFailBecauseNotLoggedIn();
    }

    @Test (description = "Check Comment Fail - Not Logged In - No Input Comment")
    public void testCommentWithoutLoggedIn_NoInput() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("");
        detailJobPage.clickCommentButton();
        detailJobPage.verifyCommentFailBecauseNotLoggedIn();
    }

}
