package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DetailJobPage {
    WebDriver driver;
    private JavascriptExecutor js;
    private Actions actions;
    private WebDriverWait wait;

    public DetailJobPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //  *****
    //  *****Locator - Navigation*****
    @FindBy(xpath ="//a[@class='active'][normalize-space()='Digital Marketing']")
    private WebElement navigation1;

    @FindBy(xpath ="//a[normalize-space()='Search']")
    private WebElement navigation2;

    @FindBy(xpath ="//a[@class='active'][normalize-space()='Search Engine Optimization (SEO)']")
    private WebElement navigation3;

    //  *****
    //  *****Locator - Job Description*****
    @FindBy(xpath ="//h1[@class='job-title']")
    private WebElement jobTitle;

    @FindBy(xpath ="//h2[normalize-space()='About This Gig']")
    private WebElement jobDescriptionTitle;

    @FindBy(xpath ="//div[@class='description']")
    private WebElement jobDescription;

    @FindBy(xpath ="(//div[@class='rating'])[1]")
    private WebElement ratingCount1;

    @FindBy(xpath ="//img[@class='img-fluid w-100']")
    private WebElement jobImage;

    //  *****
    //  *****Locator - Package*****
    @FindBy(xpath ="//button[contains(text(),'Basic')]")
    private WebElement tabBasic;

    @FindBy(xpath ="//button[contains(text(),'Standard')]")
    private WebElement tabStandard;

    @FindBy(xpath ="//button[contains(text(),'Premium')]")
    private WebElement tabPremium;

    @FindBy(xpath ="//button[@class='submit' and @type='button']")
    private WebElement continueButton;

    @FindBy(xpath ="//a[@class='compare']")
    private WebElement compareButton;

    @FindBy(xpath ="//div[@id='zuei5yj']")
    private WebElement continueAlert;

    @FindBy(xpath ="//button[@aria-label='close']//*[name()='svg']")
    private WebElement continueAlertCloseButton;

    @FindBy(xpath ="//*[name()='path' and contains(@d,'M12 0a12 1')]")
    private WebElement continueAlertIcon;

    //  *****
    //  *****Locator - About The Seller*****
    @FindBy(xpath ="(//div[@class='rating'])[2]")
    private WebElement ratingCount2;

    @FindBy(xpath ="//div[@class='profile-img']")
    private WebElement sellerAvatarImg;

    @FindBy(xpath ="//button[@class='contact']")
    private WebElement contactMeButton;

    @FindBy(xpath ="//div[@id='contactModal']")
    private List<WebElement> contactModal;

    //  *****
    //  *****Locator - FAQ*****
    @FindBy(xpath ="//div[@class='FAQ mt-5']")
    private WebElement faqSection;

    @FindBy(xpath = "//div[@class='FAQ mt-5']//li[1]")
    private WebElement question1;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[2]")
    private WebElement question2;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[3]")
    private WebElement question3;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[4]")
    private WebElement question4;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[1]//p[1]")
    private WebElement answer1;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[2]//p[1]")
    private WebElement answer2;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[3]//p[3]")
    private WebElement answer3;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[4]//p[4]")
    private WebElement answer4;

    @FindBy(xpath ="//*[name()='svg']/*[name()='path'][contains(@d, 'M')]")
    private WebElement arrowButton;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[1]//*[name()='svg']")
    private WebElement arrowButton1;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[2]//*[name()='svg']")
    private WebElement arrowButton2;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[3]//*[name()='svg']")
    private WebElement arrowButton3;

    @FindBy(xpath ="//div[@class='FAQ mt-5']//li[4]//*[name()='svg']")
    private WebElement arrowButton4;

    //  *****
    //  *****Locator - textbox search*****
    @FindBy(xpath ="//input[@type='text']")
    private WebElement textboxSearch;

    @FindBy(xpath ="//form[contains(@class,'search-form d-flex')]//button")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class, 'reviewer-name')]")
    private List<WebElement> reviewerName;

    @FindBy(xpath = "//div[contains(@class, 'country-name')]")
    private List<WebElement> countries;

    @FindBy(xpath = "//*[contains(@class, 'star')]")
    private List<WebElement> starRating;

    @FindBy(xpath ="//div[@class='review-comment']")
    private WebElement commentSection;

    @FindBy(xpath ="//li[@class='row py-4']")
    private List<WebElement> SearchResults;

    @FindBy(xpath = "//div[contains(text(), \"There is no results\")]")
    private List<WebElement> noResultMessage;

    @FindBy(xpath = "//div[@class='reviewer-avatar col-2']")
    private List<WebElement> commentAvatar;

    @FindBy(css = "img[class='country-flag']")
    private List<WebElement> flags;

    @FindBy(xpath = "//div[@class='ms-2 country-name']")
    private List<WebElement> countryNames;

    @FindBy(xpath = "//span[@class='star']")
    private List<WebElement> stars;

    @FindBy(xpath = "//span[@class='star-score']")
    private List<WebElement> starScore;

    @FindBy(xpath = "//li[@class='row py-4']//p")
    private List<WebElement> contents;

    @FindBy(xpath = "//div[text()='Helpful?']")
    private List<WebElement> helpfulText;

    @FindBy(xpath = "//div[contains(@class, 'yes d-flex align-items-center gap-1')]")
    private List<WebElement> yesButton;

    @FindBy(xpath = "//div[contains(@class, 'no d-flex align-items-center gap-1')]")
    private List<WebElement> noButton;

    //  *****
    //  *****Locator - Comment List*****
    @FindBy(xpath ="//li[@class='row py-4']")
    private List<WebElement> commentItem;
//    private By avatar      = By.cssSelector("img[alt='user avatar']");
//    private By rating      = By.cssSelector(".fa-star");
//    private By countryFlag = By.cssSelector("img[src*='switzerland']");
//    private By countryName = By.xpath(".//span[contains(text(),'Switzerland')]");
//    private By content     = By.xpath(".//p");
//    private By helpful     = By.xpath(".//div[contains(text(),'Helpful?')]");

//    @FindBy(css = ".ant-rate-star")
//    private List<WebElement> commentStars;

//  *****
//  *****Locator - Comment Textarea*****
    @FindBy(xpath ="//h2[contains(text(),'Leave some comments')]")
    private WebElement commentTitle;

    @FindBy(xpath ="//textarea[@name='noiDung']")
    private WebElement commentTextarea;

    @FindBy(xpath ="//button[@class='comment-submit']")
    private WebElement commentButton;

    @FindBy(css = "i.ant-rate-star")
    private List<WebElement> ratingStars;

    @FindBy(css = ".ant-rate .ant-rate-star div[role='radio'][aria-checked='true']")
    private WebElement selectedStar;

//  *****
//  *****Methods - Navigation*****
    public void verifyNavigationLinkDisplayed(){
        Assert.assertTrue(navigation1.isDisplayed(), "Link Navigation is not displayed");
        Assert.assertTrue(navigation2.isDisplayed(), "Link Navigation is not displayed");
        Assert.assertTrue(navigation3.isDisplayed(), "Link Navigation is not displayed");
    }
//  *****
//  *****Methods - Job Detail*****
    public void verifyJobDetail(){
        Assert.assertTrue(jobTitle.isDisplayed(), "Job title không được hiển thị");
        Assert.assertTrue(jobDescriptionTitle.isDisplayed(), "Job Description title không được hiển thị");
        Assert.assertTrue(jobDescription.isDisplayed(), "Job Description không được hiển thị");
    }

    public void verifyImageDisplayed(){
        Assert.assertTrue(jobImage.isDisplayed(), "Service image không hiển thị");
        String imageSrc = jobImage.getAttribute("src");
        Assert.assertFalse(imageSrc.isEmpty(), "Image source không được để trống");
    }

    public void verifyImageHoverTransition(){
        Actions actions = new Actions(driver);
        js = (JavascriptExecutor) driver;

        String initialTransform = js.executeScript(
                "return window.getComputedStyle(arguments[0]).transform", jobImage).toString();
        actions.moveToElement(jobImage).perform();
        String hoverTransform = js.executeScript(
                "return window.getComputedStyle(arguments[0]).transform", jobImage).toString();
        Assert.assertNotEquals(hoverTransform, initialTransform,
                "Image không có hover transition effect - Transform không thay đổi");
        actions.moveByOffset(100, 100).perform();
        String finalTransform = js.executeScript(
                "return window.getComputedStyle(arguments[0]).transform", jobImage).toString();
        System.out.println("Final transform after mouse leave: " + finalTransform);
    }

//  *****
//  *****Methods - About The Seller*****
    public void verifyAvatarDisplay(){
        String getSellerAvatarSrc = sellerAvatarImg.getAttribute("src");
        String getSellerAvatarAlt = sellerAvatarImg.getAttribute("alt");
        if (sellerAvatarImg.isDisplayed() && getSellerAvatarSrc != null && !getSellerAvatarSrc.isEmpty()) {
            // Trường hợp avatar load được
            Assert.assertTrue(getSellerAvatarSrc.startsWith("http") || getSellerAvatarSrc.endsWith(".png") || getSellerAvatarSrc.endsWith(".jpg"),
                 "Ảnh avatar phải có link hợp lệ");
        } else {
            // Trường hợp avatar bị lỗi load => kiểm tra alt
//            Assert.assertTrue(alt != null && !alt.isEmpty(), "Alt text phải tồn tại khi ảnh lỗi");
            Assert.assertNotNull(getSellerAvatarAlt, "Alt text phải tồn tại khi ảnh lỗi");
            Assert.assertFalse(getSellerAvatarAlt.isEmpty(), "Alt text không được để trống khi ảnh lỗi");
            System.out.println("Ảnh lỗi => hiển thị alt: " + getSellerAvatarAlt);
            }
        }

    public void verifyContactMeButtonNotLoggedIn(){
        Actions actions = new Actions(driver);
        actions.moveToElement(contactMeButton).click().perform();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "FAIL. Vẫn ở trang Job Detail");
    }

    public void verifyContactModalDisplay(){
        Actions actions = new Actions(driver);
        actions.moveToElement(contactMeButton).click().perform();
        Assert.assertFalse(contactModal.isEmpty(),
                "Contact Modal should be visible");
    }

//  *****
//  *****Methods - Package*****
    public void clickTabBasic(){
        Assert.assertTrue(tabBasic.isDisplayed(),
                "Tab Basic should be visible");
        tabBasic.click();
    }

    public void clickTabStandard(){
        Assert.assertTrue(tabStandard.isDisplayed(),
                "Tab Standard should be visible");
        tabStandard.click();
    }

    public void clickTabPremium(){
        Assert.assertTrue(tabPremium.isDisplayed(),
                "Tab Premium should be visible");
        tabPremium.click();
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void verifyContinueButtonNotLoggedIn(){
        continueButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "FAIL. Vẫn ở trang Job Detail");
    }

    public void verifyContinueButtonLoggedIn(){
        continueButton.click();
        Assert.assertTrue(continueAlert.isDisplayed(),
                "'Continue' alert should be visible");
        Assert.assertTrue(continueAlertIcon.isDisplayed(),
                "Alert icon should be visible");
        Assert.assertTrue(continueAlertCloseButton.isDisplayed(),
                "Alert close button should be visible");
        String continueAlertText = continueAlert.getText();
        Assert.assertTrue(continueAlertText.contains("Thuê công việc thành công !"),
                "Alert message is not correct. Actual: " + continueAlertText);
        Assert.assertFalse(continueAlert.isEnabled(),
                "Nút có thể click");
//        Assert.assertEquals(driver.findElement(errorMessageEmailInvalidChar).getText(), "使用できない文字が含まれています。", "Không đúng nội dung error message");
    }

    public void verifyContinueAlertCloseButton(){
        continueButton.click();
        Assert.assertFalse(continueAlert.isDisplayed(),
                "'Continue' alert should not be visible");
    }

    public void verifyContinueAlertDisplayWhenClicking(){
        continueAlert.click();
        Assert.assertFalse(continueAlert.isDisplayed(),
                "'Continue' alert should not be visible");
    }

    public void verifyHoverContinueAlert() throws InterruptedException {
        continueAlert.click();
        actions.moveToElement(continueAlert).perform();
        Thread.sleep(5000);
        Assert.assertTrue(continueAlert.isDisplayed(),
                "'Continue' alert should be still visible");
    }

    public void verifyMoveOutAlert() throws InterruptedException {
        continueAlert.click();
        actions.moveToElement(continueAlert).perform();
        actions.moveByOffset(-200, -200).perform();
        Thread.sleep(5000);
        Assert.assertFalse(continueAlert.isDisplayed(),
                "'Continue' alert should not be visible");
    }

    public void verifyCompareButtonNotLoggedIn(){
        continueButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),
                "FAIL. Vẫn ở trang Job Detail");
    }

    public void verifyCompareButtonLoggedIn(){
        continueButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("comparepackage"),
                "FAIL. Vẫn ở trang Job Detail");
    }
//  *****
//  *****Methods - FAQ*****
    public void FAQ() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", faqSection);
    }

    public void verifyFAQSectionDisplay(){
        Assert.assertTrue(faqSection.isDisplayed(),
                "FAQ section should be visible");
    }

    public void verifyQuestionDefaultDisplay(){
        Actions actions = new Actions(driver);
        actions.moveToElement(question4).perform();
        Assert.assertTrue(question1.isDisplayed()&& question2.isDisplayed() &&
                        question3.isDisplayed() && question4.isDisplayed() ,
                "All questions should be visible");
        Assert.assertFalse(answer1.isDisplayed() && answer2.isDisplayed() &&
                        answer3.isDisplayed() && answer4.isDisplayed(),
                "All questions should be hidden");
        String getArrowTransform = arrowButton.getCssValue("transform");
        Assert.assertTrue(getArrowTransform.contains("none"),
                "The arrow should be pointing down by default");
    }

    public void verifyAnswerDisplayWhenCLicking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(question1).click().perform();
        Assert.assertTrue(answer1.isDisplayed(),
                "Answer should be displayed after clicking");
//        String getArrowTransform = arrowButton1.getCssValue("transform");
//        Assert.assertTrue(getArrowTransform.contains("matrix(-1"),
//                "The arrow should be pointing up");
    }

    public void verifyAnswerHiddenWhenClosing(){
        String getArrowTransform = arrowButton.getCssValue("transform");
        Actions actions = new Actions(driver);
        actions.moveToElement(question1).click().perform();
        Assert.assertTrue(answer1.isDisplayed(),
                "Answer should be displayed after clicking");
        question1.click();
        Assert.assertFalse(answer1.isDisplayed(),
                "Answer should be hidden after clicking twice");
        Assert.assertTrue(getArrowTransform.contains("none"),
                "The arrow should be pointing down by default");
    }
//  *****
//  *****Methods - Search*****
    public void verifyTextboxSearchPlaceholder() {
        String placeholder = textboxSearch.getAttribute("placeholder");
        Assert.assertNotNull(placeholder, "Search box should have a placeholder");
        Assert.assertTrue(placeholder.contains("Search reviews"),
                "Placeholder should be 'Search reviews'. Actual: " + placeholder);
    }

    public void inputSearchText(String search){
        Actions actions = new Actions(driver);
        actions.moveToElement(textboxSearch)
                .click()
                .sendKeys(search)
                .perform();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void waitForSearchResult(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(commentSection));
    }

    public List<WebElement> getSearchResults(String search) {
        return driver.findElements(
                org.openqa.selenium.By.xpath("//div[contains(text(), '" + search + "') or .//*[contains(text(), '" + search + "')]]")
        );
    }

    public boolean hasSearchResults(String search) {
        List<WebElement> results = getSearchResults(search);
        return results.size() > 0;
    }



    public int getAllReviewsCount() {
            return SearchResults.size();
    }

    public boolean areReviewElementsVisible() {
        return reviewerName.size() > 0 ||
                countries.size() > 0 ||
                starRating.size() > 0 ;
//                reviewText.size() > 0;
    }

    public boolean areHelpfulButtonsVisible() {
        return helpfulText.size() > 0 &&
                yesButton.size() > 0 &&
                noButton.size() > 0;
    }
    public boolean searchResultsContainSearchKeyword(String search) {
        List<WebElement> results = getSearchResults(search);
        for (WebElement result : results) {
            if (result.getText().toLowerCase().contains(search.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public void verifyValidSearchResult(String search){
        Assert.assertTrue(hasSearchResults(search),
                "Search should return results for valid keyword: " + search);
        Assert.assertTrue(searchResultsContainSearchKeyword(search),
                "Search results should contain the search term: " + search);
    }
    
    public void verifyInvalidSearchResult(){
        Assert.assertFalse(noResultMessage.isEmpty(),
                "Invalid search should show no results message");
    }

    public void verifySearchKeywordStillDisplayed(String search){
        String currentValue = textboxSearch.getAttribute("value");
        Assert.assertEquals(currentValue, search, "Search keyword is not displayed after searching");
    }

    public void verifyAllCommentsAreDisplayed(){
        int reviewCount = getAllReviewsCount();
        System.out.println("Review/Comment count: " + reviewCount);
        Assert.assertTrue(reviewCount > 0,
                "All reviews should be displayed when search is empty");
    }

//  *****
//  ****Methods - Comment List****
    public void verifyCommentListDisplay(){
        Actions actions = new Actions(driver);
        actions.moveToElement(commentSection).perform();
        Assert.assertTrue(commentItem.size() > 0,
                "There is no comments displaying");
        for (int i = 0; i < commentItem.size(); i++) {
            Assert.assertTrue(commentAvatar.get(i).isDisplayed(), "Avatar is not displayed at comment " + i);
            Assert.assertTrue(flags.get(i).isDisplayed(), "Flag is not displayed at comment " + i);
            Assert.assertTrue(countryNames.get(i).isDisplayed(), "Country Name is not displayed at ở comment " + i);
            Assert.assertTrue(stars.get(i).isDisplayed(), "Icon Star is not displayed at comment " + i);
            Assert.assertFalse(starScore.get(i).getText().trim().isEmpty(), "Star Score is not displayed at comment " + i);
            Assert.assertFalse(contents.get(i).getText().trim().isEmpty(), "Comment content is empty at comment " + i);
            Assert.assertTrue(helpfulText.get(i).isDisplayed(), "Text Helpful is not displayed at comment " + i);
            Assert.assertTrue(yesButton.get(i).isDisplayed(), "Yes Button is not displayed at comment " + i);
            Assert.assertTrue(noButton.get(i).isDisplayed(), "No Button is not displayed at comment " + i);
        }
    }

    public void verifyNoCommentDisplayedWithMessage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentSection).perform();
        Assert.assertEquals(commentItem.size(), 0,
                "Vẫn còn comment hiển thị, mong muốn = 0!");
        Assert.assertTrue(noResultMessage.isEmpty(),
                "Message 'There is no results' is not displayed");
    }

    public void verifyYesNoButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentSection).perform();
        Assert.assertTrue(yesButton.get(0).isEnabled(),
                "Can not click Yes Button");
        Assert.assertTrue(noButton.get(0).isEnabled(),
                "Can not click No Button");
    }

//  *****
//  *****Methods - Comment*****
    public void textareaDefaultValue() {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentTextarea).perform();
        Assert.assertTrue(commentTitle.isDisplayed(),
                "Comment Textarea Title should be visible");
        Assert.assertFalse(ratingStars.isEmpty(),
                "Rating stars should exist");
        Assert.assertTrue(commentButton.isDisplayed(),
                "Comment Button should be visible");
        String value = commentTextarea.getAttribute("value");
        Assert.assertTrue(value == null || value.trim().isEmpty(),
                "Default value of the textarea is not correct. Actual: " + value);
    }

    public void textareaEmpty() {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'end'});", commentButton);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(commentButton));
        Actions actions = new Actions(driver);
        actions.moveToElement(commentTextarea).perform();
        Assert.assertTrue(commentTitle.isDisplayed(),
                "Comment Textarea Title should be visible");
        Assert.assertFalse(ratingStars.isEmpty(),
                "Rating stars should exist");
        Assert.assertTrue(commentButton.isDisplayed(),
                "Comment Button should be visible");
        String value = commentTextarea.getAttribute("value");
        Assert.assertTrue(value == null || value.trim().isEmpty(),
                "Default value of the textarea is not correct. Actual: " + value);
    }

    public void inputComment(String comment) {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentTextarea)
                .click()
                .sendKeys(comment)
                .perform();
    }

    public void clickCommentButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentButton).click().perform();
    }

    public void selectRating(int starNumber) {
        actions.moveToElement(commentTextarea).perform();
        ratingStars.get(starNumber - 1).click();
    }

    public void hoverStar(int starNumber) {
        Actions actions = new Actions(driver);
        actions.moveToElement(commentTextarea).perform();
        actions.moveToElement(ratingStars.get(starNumber - 1)).perform();
    }

    public int getSelectedRating() {
//        return Integer.parseInt(selectedStar.getAttribute("aria-posinset"));
        WebElement selectedStar = commentItem.get(commentItem.size() - 1).findElement(By.cssSelector(".ant-rate-star[aria-checked='true']"));
        return Integer.parseInt(selectedStar.getAttribute("aria-posinset"));
    }

    public boolean isStarHighlighted(int starIndex) {
        WebElement star = ratingStars.get(starIndex);
        String className = star.getAttribute("class");
        return className.contains("ant-rate-star-full");
    }

    public void verifyHoverStartsHightlight(int starNumber) {
        int hoverStar = 4;
        for (int i = 1; i <= starNumber; i++) {
            Assert.assertTrue(isStarHighlighted(i-1), "Star " + i + " is not highlighted");
        }

        for (int i = starNumber + 1; i <= 5; i++) {
            Assert.assertFalse(isStarHighlighted(i-1), "Star " + i + " bị highlighted");
        }
    }

    public void verifySelectedStar(int expectedStar) {
        int actualStar = getSelectedRating();
        Assert.assertEquals(actualStar, expectedStar, "Rating không đúng!");
    }

    public void verifyLatestCommentText(String comment) {
        String actualComment = commentItem.get(commentItem.size() - 1).findElement(By.cssSelector("comment")).getText();
        Assert.assertEquals(actualComment,comment, "Comment text không đúng");
    }

    public void verifyCommentFailBecauseNotLoggedIn(){
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "FAIL. Still at Detail Job Page");
    }

    public void verifyTextareaRequired(){
        Actions actions = new Actions(driver);
        actions.moveToElement(commentTextarea).perform();
       String validationMessage = (String)((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", commentTextarea);
        boolean isValid = validationMessage.equals("Vui lòng điền vào trường này.") ||
                validationMessage.equals("Please fill out this field.");
        Assert.assertTrue(isValid, "Validation message should match");
    }

    public void verifyAlertDisappeared(){
        String validationMessage = (String)((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", commentTextarea);
        Assert.assertTrue(validationMessage.isEmpty(), "Validation message should not be shown");
    }

}
