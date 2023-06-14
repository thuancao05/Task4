package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.dashboard_page;
import page.login_page;

public class login_function extends basePage {
    public login_page loginPage = new login_page();
    public common_function commonFunction = new common_function(getDriver());
    public login_function(WebDriver driver) {
        super(driver);
    }

    // Ham verify login page
    public void verifyLoginPage() {
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.txtUserName));
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.lblRemember));
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.txtPassWord));
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.btnLogin));
        System.out.println("Verify Login Page");
    }


    //ham nhap username
    public void inputUsername(String username) {
        commonFunction.sendKeys(loginPage.txtUserName, username);
    }
    //hàm này dùng để nhập password
    public void inputPassword(String pass) {
        commonFunction.sendKeys(loginPage.txtPassWord, pass);
    }
    //hàm này dùng để click vào nút Login
    public void clickLoginButton() {
        commonFunction.clicks(loginPage.btnLogin);
    }

    public dashboard_page Login(String username, String password) {
        verifyLoginPage();
        inputUsername(username);
        inputPassword(password);
        clickLoginButton();
        return new dashboard_page();
    }

}
