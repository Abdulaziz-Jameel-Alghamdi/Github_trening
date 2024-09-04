package ObjectsPaths;

import org.openqa.selenium.By;

public class LoginObjects {

    public static final By usernameField = By.id("login_field");
    public static final By passwordField = By.xpath("//input[@id='password']");
    public static final By loginButton = By.xpath("//input[@type='submit']");
}
