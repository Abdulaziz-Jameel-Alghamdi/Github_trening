package ObjectsPaths;

import org.openqa.selenium.By;

public class HomeObjects {

    public static final By newRepoButton = By.xpath("//button[contains(@aria-label,'Create something new')]");
    public static final By repoNameField = By.id("repository_name");
    public static final By createRepoButton = By.cssSelector("button.first-in-line");

}
