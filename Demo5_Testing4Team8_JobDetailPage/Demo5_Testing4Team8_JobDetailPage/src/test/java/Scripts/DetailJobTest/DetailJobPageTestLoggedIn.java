package Scripts.DetailJobTest;

import Listener.ExtentReportListener;
import Listener.SimpleListener;
import Pages.DetailJobPage;
import Scripts.BaseTest.LoggedInBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SimpleListener.class, ExtentReportListener.class})
public class DetailJobPageTestLoggedIn extends LoggedInBaseTest {
//    @Test
//    public void testDefaultValue() {
//        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        detailJobPage.textareaDefaultValue();
//    }

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

    //    Test Job Detail Display
    public void testJobDetailDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageDisplayed();
    }

    //    Test Image
    @Test
    public void testImageDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageDisplayed();
    }

    @Test
    public void testImageHoverTransition() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageHoverTransition();
    }

    //    Test Package
    @Test
    public void testContinueButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testContinueButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testContinueButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testAlertCloseButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertCloseButton();
    }

    @Test
    public void testContinueAlertDisplayWhenClicking() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertDisplayWhenClicking();
    }

    @Test
    public void testHoverContinueAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyHoverContinueAlert();
    }

    @Test
    public void testMoveOutAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyMoveOutAlert();
    }

    @Test
    public void testCompareButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test
    public void testCompareButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test
    public void testCompareButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    //    Test About The Seller
    @Test
    public void testSellerAvatarDisplayedOrAlt() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAvatarDisplay();
    }

    @Test
    public void testContactModalDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyContactModalDisplay();
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
    @Test (description = "Check Comment Textarea Display & Default value")
    public void testDefaultValue() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.textareaDefaultValue();
    }

    @Test (description = "Check Comment Fail - Not Logged In - Input Comment")
    public void testCommentWithoutLoggedIn_InputComment() throws InterruptedException {
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
        System.out.println("Da OK");
//        detailJobPage.verifyTextareaRequired();
    }

    @Test
    public void testCommentWithRatingStar() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.hoverStar(4);
        detailJobPage.verifyHoverStartsHightlight();
        detailJobPage.selectRating(4);
        detailJobPage.clickCommentButton();
        detailJobPage.verifySelectedStar(4);
        detailJobPage.verifyLatestCommentText("test");
    }

    @Test
    public void testCommentWithoutRatingStar() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.clickCommentButton();
        detailJobPage.verifySelectedStar(5);
        detailJobPage.verifyLatestCommentText("test");
    }

}
