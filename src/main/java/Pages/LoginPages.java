package Pages;

import ObjectsPaths.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPaths.LoginObjects.*;

public class LoginPages {


    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenGithubUrl () {
        driver.get("https://github.com/login");
    }

    public void enterUsername(String username) {
        driver.findElement(LoginObjects.usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginObjects.passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LoginObjects.loginButton).click();
    }

}
