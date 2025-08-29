package Scripts.DetailJobTest;

import Listener.ExtentReportListener;
import Listener.SimpleListener;
import Pages.DetailJobPage;
import Scripts.BaseTest.LoggedInBaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SimpleListener.class, ExtentReportListener.class})
public class DetailJobPageTestLoggedIn extends LoggedInBaseTest {


    @Test
    public void testCommentSuccess() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("hangtest");
    }


    //    Test Navigation
    @Test
    public void testNavigationLinkDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyNavigationLinkDisplayed();
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
        detailJobPage.inputSearchText("test");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyValidSearchResult("test");
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
        detailJobPage.verifyInvalidSearchResult();
        detailJobPage.verifySearchKeywordStillDisplayed("NonExistent");
    }

    //    Test Job Image
    @Test
    public void testJobImageDisplay() {
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

    @Test (description = "Check If can click Yes No Button")
    public void testYesNoButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyYesNoButton();
    }

    //  *****
    //  *****Test Comment Section*****
    @Test (description = "Check Comment Textarea Display & Default value")
    public void testDefaultValue() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.textareaDefaultValue();
    }

    @Test
    public void testCommentWithoutInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickCommentButton();
        detailJobPage.verifyTextareaRequired();
    }

    @Test (description = "Check Star Status when Hovering")
    public void testStarHighlightStatus() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.hoverStar(4);
        detailJobPage.isStarHighlighted(0);

//        detailJobPage.verifyHoverStartsHightlight(4);
    }

    @Test
    public void testAlertDisappearedWhenClickOutside() {
        Actions actions = new Actions(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickCommentButton();
        detailJobPage.verifyTextareaRequired();
        actions.moveByOffset(100, 100).click().perform();
        detailJobPage.verifyAlertDisappeared();
    }

    @Test
    public void testAlertDisappearedWhenInputComment() {
        Actions actions = new Actions(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickCommentButton();
        detailJobPage.verifyTextareaRequired();
        detailJobPage.inputComment("Test");
        detailJobPage.verifyAlertDisappeared();
    }


    @Test
    public void testCommentWithRatingStar() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.hoverStar(4);
        detailJobPage.verifyHoverStartsHightlight(4);
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
