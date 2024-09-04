package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void LoginPagesMethod() throws InterruptedException {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.enterUsername("testuser");
        loginPages.enterPassword("testpassword");
        loginPages.clickLoginButton();
        Thread.sleep(1000);

    }

    @Test
    public void addNewRepositoryTest() throws InterruptedException {
       // LoginPagesMethod();

        HomePages HomePages = new HomePages(driver);
        HomePages.clickNewRepoButton();
        HomePages.clickCreateRepoButton();
        HomePages.enterRepoName("");
    }
}

