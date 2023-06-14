package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import page.sale_page;

public class sale_function extends basePage {
    public sale_page salePage = new sale_page();
    public common_function commonFunction = new common_function(getDriver());
    public sale_function(WebDriver driver) {
        super(driver);
    }

    //clcik button sale
    public void clickButtonSale(){
        commonFunction.clicks(salePage.btnSale);
    }
    //clcik button add sale
    public void clickButtonAddSale(){
        commonFunction.clicks(salePage.btnAddSale);
    }
}
