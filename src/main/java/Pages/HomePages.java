package Pages;

import ObjectsPaths.HomeObjects;
import org.openqa.selenium.WebDriver;
import static ObjectsPaths.HomeObjects.*;

public class HomePages {

    WebDriver driver;

    public HomePages(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNewRepoButton() {
        driver.findElement(HomeObjects.newRepoButton).click();
    }

    public void enterRepoName(String repoName) {
        driver.findElement(HomeObjects.repoNameField).sendKeys(repoName);
    }

    public void clickCreateRepoButton() {
        driver.findElement(HomeObjects.createRepoButton).click();
    }
}
