import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;

import static org.junit.Assert.assertTrue;

public class LoginTest extends ConfigFrontend {
    MainPage mainPage;
    LoginPage loginPage;
    PasswordPage passwordPage;
    MainLoginPage mainLoginPage;


    @Test
    public void firstFrontendTest(){

        driver.get(baseUrl);
//        driver.findElement(By.cssSelector("div.page-root div.hp-hero__wrapper p spam"));
       WebElement title = driver.findElement(By.cssSelector("div.hp-hero__wrapper h1 span.no-widows"));
        WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/h1/span"));
        WebElement logo = driver.findElement(By.id("wpcom-logo"));
        WebElement getStartedTobBar =driver.findElement(By.className("menu-signup"));
        WebElement getStartedMain =driver.findElement(By.cssSelector("div.hp-hero__wrapper"))
        .findElement(By.className("is-cta"));
        driver.findElement(By.cssSelector("a[title=\"Get Started\"]"));

        assertTrue(title.isDisplayed());
        assertTrue(loginButton.isDisplayed());
        assertTrue(logo.isDisplayed());
        assertTrue(getStartedMain.isDisplayed());

    }
    @Test

    public void testMainPage() {
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
        mainPage.isContentPage();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
        mainPage.loginButton.click();
        loginPage = new LoginPage(driver);
        loginPage.usernameInput.sendKeys(DataTest.userLogin);
        loginPage.buttonContinue.click();
        passwordPage = new PasswordPage(driver);
        passwordPage.passwordImput.sendKeys(DataTest.userPassword);
        passwordPage.buttonLogIn.click();
        Thread.sleep(3000);
//        mainLoginPage = new MainLoginPage(driver);
//        mainLoginPage.isContentPage();


    }
}
