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
    @Test (description = "Check Navigation Link Display")
    public void testNavigationLinkDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyNavigationLinkDisplayed();
    }

    //    Test Seacrh Box
    @Test (description = "Check Placeholder of textbox Search")
    public void testTextboxSearchPlaceholder() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextboxSearchPlaceholder();
    }

    @Test (description = "Check Search Function _ Input Valid Keyword")
    public void testSearchWithValidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("test");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyValidSearchResult("test");
    }

    @Test (description = "Check Search Function _ No Input")
    public void testSearchWithEmptyInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyAllCommentsAreDisplayed();
    }

    @Test (description = "Check Search Function _ Input Invalid Keyword")
    public void testSearchWithInvalidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("NonExistent");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyInvalidSearchResult();
        detailJobPage.verifySearchKeywordStillDisplayed("NonExistent");
    }

    //    Test Job Image
    @Test (description = "Check Job Image Display")
    public void testJobImageDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageDisplayed();
    }

    @Test (description = "Check Hover Transition of Job Image")
    public void testImageHoverTransition() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageHoverTransition();
    }

    //    Test Package
    @Test (description = "Check Tab Basic _ Continue Button _ Logged In")
    public void testContinueButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test (description = "Check Tab Basic _ Continue Button _ Hired Job")
    public void testContinueButtonTabBasic_HiredStatus() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
        detailJobPage.verifyContinueButtonRegistered();
    }

    @Test (description = "Check Tab Standard _ Continue Button _ Hired Job")
    public void testContinueButtonTabStandard_HiredStatus() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyContinueButtonLoggedIn();
        detailJobPage.verifyContinueButtonRegistered();
    }

    @Test (description = "Check Tab Premium _ Continue Button _ Hired Job")
    public void testContinueButtonTabPremium_HiredStatus() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyContinueButtonLoggedIn();
        detailJobPage.verifyContinueButtonRegistered();
    }

    @Test (description = "Check Tab Standard _ Continue Button _ Logged In")
    public void testContinueButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test (description = "Check Tab Premium _ Continue Button _ Logged In")
    public void testContinueButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test (description = "Check Alert Of Continue Button _ Close")
    public void testAlertCloseButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertCloseButton();
    }

    @Test (description = "Check Alert Of Continue Button _ Close")
    public void testContinueAlertDisplayWhenClicking() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertDisplayWhenClicking();
    }

    @Test (description = "Check Alert Of Continue Button _ Hover")
    public void testHoverContinueAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyHoverContinueAlert();
    }

    @Test (description = "Check Alert Of Continue Button _ Move Out")
    public void testMoveOutAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyMoveOutAlert();
    }

    @Test (description = "Check Tab Basic _ Compare Button _ Logged In")
    public void testCompareButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test (description = "Check Tab Standard _ Compare Button _ Logged In")
    public void testCompareButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test (description = "Check Tab Premium _ Compare Button _ Logged In")
    public void testCompareButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    //    Test About The Seller
    @Test (description = "Check Seller Avatar")
    public void testSellerAvatarDisplayedOrAlt() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAvatarDisplay();
    }

    @Test (description = "Check Contact Me Modal")
    public void testContactModalDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyContactModalDisplay();
    }

    @Test (description = "Check FAQ Display _ Default value")
    public void testFAQDefaultDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyQuestionDefaultDisplay();
    }

    @Test (description = "Check FAQ Display _ Answer Is Displayed When Clicking Question")
    public void testAnswerDisplayWhenCLickQuestion() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerDisplayWhenCLicking();
    }

    @Test (description = "Check FAQ Display _ Answer Is Hidden When Clicking Question Twice")
    public void testAnswerHiddenWhenClosing() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerHiddenWhenClosing();
    }

    //    Test Comment List
    @Test (description = "Check Comment List Exists")
    public void testCommentList_WhenCommentsExist() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyCommentListDisplay();
    }

    @Test (description = "Check Comment List _ No Comment Exists")
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

    @Test (description = "Check Comment Textarea Display & Default value")
    public void testCommentWithoutInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickCommentButton();
        detailJobPage.verifyTextareaRequired();
    }

//    @Test (description = "Check Star Status when Hovering")
//    public void testStarHighlightStatus() {
//        DetailJobPage detailJobPage = new DetailJobPage(driver);
//        detailJobPage.hoverStar(4);
//        detailJobPage.isStarHighlighted(0);
//    }

    @Test (description = "Check Comment Textarea _ No Input Alert Disappears When Input Comment")
    public void testAlertDisappearedWhenInputComment() {
        Actions actions = new Actions(driver);
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickCommentButton();
        detailJobPage.verifyTextareaRequired();
        detailJobPage.inputComment("Test");
        detailJobPage.verifyAlertDisappeared();
    }


    @Test
    public void testHover() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.hoverStar(3);
        detailJobPage.verifyHoverStartsHightlight();
         }

    @Test
    public void testCommentWithRatingStar() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.hoverStar(4);
        detailJobPage.verifyHoverStartsHightlight();
        detailJobPage.selectRating(4);
        detailJobPage.clickCommentButton();
        detailJobPage.verifySelectedStar(4);
        detailJobPage.verifyLatestCommentText("test");
    }

    @Test (description = "Check Comment Textarea _ Alert Appears When Not Input Comment")
    public void testCommentWithoutRatingStar() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.clickCommentButton();
        detailJobPage.verifySelectedStar(5);
        detailJobPage.verifyLatestCommentText("test");
        detailJobPage.textareaEmpty();
    }

}
