package Pages;

import ObjectsPaths.GitHubMainObjects;
import ObjectsPaths.HomeObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubMainPages {


    WebDriver driver;

    public GitHubMainPages(WebDriver driver) {
        this.driver = driver;
    }

    public void GetUrl(){
        driver.get("https://github.com/");
    }

    public void clickDocsLink() {

        WebElement Docs = driver.findElement(GitHubMainObjects.Docs);
        Docs.sendKeys(Keys.PAGE_DOWN);
        Docs.click();

    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
        driver.findElement(GitHubMainObjects.Docs).click();

    }
}
