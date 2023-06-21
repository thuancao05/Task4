package function;

import core.basePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.addPurchases_page;

public class addPurchases_function extends basePage {
    public addPurchases_page addPurchasesPage  = new addPurchases_page();
    public common_function commonFunction = new common_function(getDriver());
    public addPurchases_function(WebDriver driver) {
        super(driver);
    }

    public void clickSubmitButton(){
        commonFunction.clicks(addPurchasesPage.btnAddPurchase);
    }
    public void inputSupplierAndProduct(){
        commonFunction.sleep(2000);
        WebElement element = getDriver().findElement(addPurchasesPage.selectSupplier);
        element.click();
        commonFunction.sendKeys(addPurchasesPage.txtSearch, "1");
        commonFunction.sleep(1000);
        commonFunction.press(Keys.ENTER);
        commonFunction.sendKeys(addPurchasesPage.txtProduct, "kiwi");
        commonFunction.sleep(1000);
    }
    public void verifyAddPurchasesSuccess(){
        Assert.assertTrue(commonFunction.isDisplayed(addPurchasesPage.lblAlertSuccess));
    }

}
