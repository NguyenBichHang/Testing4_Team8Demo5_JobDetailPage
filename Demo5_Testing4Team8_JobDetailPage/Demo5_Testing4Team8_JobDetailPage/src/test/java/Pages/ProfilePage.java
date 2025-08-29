package Pages;

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

public class ProfilePage {
    WebDriver driver;
    Actions actions;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

//    **********
//    *****Profile Page - Locator*****

    @FindBy(xpath ="//div[@class='gigs_card_bottom']")
    private WebElement jobListSection;

    @FindBy(xpath ="//div[@class='gigs_card']")
    private List<WebElement> jobItem;

//    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]")
//    private WebElement lastJobItem;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//h1")
    private WebElement lastJobTitle;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//p")
    private WebElement lastJobDescription;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//span[@class='saoCV']")
    private WebElement lastJobStar;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//span[@class='danhGia']")
    private WebElement lastJobRating;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//p[@class='giaTien']")
    private WebElement lastJobPrice;

    @FindBy(xpath ="(//div[@class='gigs_card'])[last()]//div[@class='gigs_card_img']")
    private WebElement lastJobImage;

    @FindBy(xpath ="(//a[contains(text(),'View detail')])[1]")
    private WebElement viewDetailButton;

    @FindBy(xpath ="(//button[contains(text(),'DEL')])[1]")
    private WebElement delButton;

    @FindBy(xpath ="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']")
    private WebElement delAlert;

    @FindBy(xpath ="//*[name()='path' and contains(@d,'M12 0a12 1')]")
    private WebElement alertIcon;

    @FindBy(xpath ="//button[@aria-label='close']")
    private WebElement alertCloseButton;

//    **********
//    *****Profile Page - Methods*****
    public void verifyJobDisplay(){
        Assert.assertTrue(jobListSection.isDisplayed(), "Hired Job is not displayed");
        Assert.assertFalse(jobItem.isEmpty(),"There are jobs are displayed");
    }

    public int getJobItemsCount() {
        return jobItem.size();
    }

    public void verifyJobDisplayEmpty(){
        Assert.assertFalse(jobListSection.isDisplayed(), "Job đã thuê được hiển thị");
        Assert.assertTrue(getJobItemsCount() > 0,
                "At least one job should be displayed in the list");

        System.out.println("Found " + (getJobItemsCount() - 1) + " job items");
//        String srcJobListImage = jobListImage.getAttribute("src");
    }

    public void verifyJobDetailContent(){
        Assert.assertTrue(lastJobTitle.isDisplayed(), "Job title should be visible");
        Assert.assertFalse(lastJobTitle.getText().trim().isEmpty(),
                "Job title should not be empty");
        Assert.assertTrue(lastJobDescription.isDisplayed(),
                "Job description should be visible");
        Assert.assertTrue(lastJobStar.isDisplayed(),
                "Job star rating should be visible");
        Assert.assertTrue(lastJobRating.isDisplayed(),
                "Job rating should be visible");
        Assert.assertTrue(lastJobPrice.isDisplayed(),
                "Job price should be visible");
        Assert.assertTrue(lastJobImage.isDisplayed(),
                "Job image should be visible");
    }

    public void verifyViewDetailButton(){
        Assert.assertTrue(viewDetailButton.isDisplayed(),
                "View detail button should be visible");
        viewDetailButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("jobDetail/14"), "FAIL. Vẫn ở trang Profile");
    }

    public void clickDelButton(){
        Assert.assertTrue(delButton.isDisplayed(),
                "DEL button should be visible");
        delButton.click();
    }

    public void verifyAlertDisplay(){
        Assert.assertTrue(delAlert.isDisplayed(),
                "DEL alert should be visible");
        Assert.assertTrue(alertIcon.isDisplayed(),
                "Alert icon should be visible");
        Assert.assertTrue(alertCloseButton.isDisplayed(),
                "Alert close button should be visible");
        String DelAlertText = delAlert.getText();
        Assert.assertTrue(DelAlertText.contains("Xóa thành công!"),
                "Alert message is not correct. Actual: " + DelAlertText);
    }

    public void verifyAlertAutoClose(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean invisible = wait.until(ExpectedConditions.invisibilityOf(delAlert));
        Assert.assertTrue(invisible, "DEL alert should not be visible");
    }

    public void verifyAlertCloseButton(){
        alertCloseButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        boolean invisible = wait.until(ExpectedConditions.invisibilityOf(delAlert));
        Assert.assertTrue(invisible, "DEL alert should not be visible");
    }

    public void verifyAlertDisplayWhenClicking() {
        delAlert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        boolean invisible = wait.until(ExpectedConditions.invisibilityOf(delAlert));
        Assert.assertTrue(invisible, "DEL alert should not be visible");
    }

    public void verifyHoverAlert() throws InterruptedException {
        actions.moveToElement(delAlert).perform();
        Thread.sleep(6000);
        Assert.assertTrue(delAlert.isDisplayed(),
                "DEL alert should be still visible");
    }

    public void verifyMoveOutAlert() {
        actions.moveToElement(delAlert).perform();
        actions.moveByOffset(100, 100).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean invisible = wait.until(ExpectedConditions.invisibilityOf(delAlert));
        Assert.assertTrue(invisible, "DEL alert should not be visible");
    }
}
