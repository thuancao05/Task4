package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
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
}
