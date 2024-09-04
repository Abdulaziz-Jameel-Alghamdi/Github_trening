package GithubWeb;

import Base.BaseClass;
import Pages.GitHubMainPages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GitHubMainTest extends BaseClass {


    @Test
    public void sigInMethod() throws InterruptedException {

        GitHubMainPages singIn = new GitHubMainPages(driver);
        singIn.GetUrl();
        singIn.scrollToPosition(0, 1200);
        //singIn.clickDocsLink();
        Thread.sleep(1000);


        LoginPages loginPages = new LoginPages(driver);
        loginPages.OpenGithubUrl();
        loginPages.enterUsername("testuser");
        loginPages.enterPassword("testpassword");
        loginPages.clickLoginButton();
        Thread.sleep(1000);

    }
}
