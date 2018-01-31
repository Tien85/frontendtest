import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class LoginTest extends ConfigFrontend {


    @Test
    public void firstFrontendTest(){

        driver.get(baseUrl);
//        driver.findElement(By.cssSelector("div.page-root div.hp-hero__wrapper p spam"));
       WebElement title = driver.findElement(By.cssSelector("div.hp-hero__wrapper h1 span.no-widows"));
        WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/h1/span"));
        WebElement logo = driver.findElement(By.id("wpcom-logo"));
        WebElement getStartedTobBar =driver.findElement(By.className("menu-signup"));
        driver.findElement(By.cssSelector("div.hp-hero__wrapper"))
        .findElement(By.className("is-cta"));
        driver.findElement(By.cssSelector("a[title=\"Get Started\"]"));

        assertTrue(title.isDisplayed());
        assertTrue(loginButton.isDisplayed());
        assertTrue(logo.isDisplayed());
        assertTrue(getStartedTobBar.isDisplayed());

    }

}
