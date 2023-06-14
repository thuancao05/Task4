package function;

import core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.editProduct_page;
import page.purchases_page;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class purchases_function extends basePage {
    public purchases_page purchasesPage  = new purchases_page();
    public common_function commonFunction = new common_function(getDriver());
    public purchases_function(WebDriver driver) {
        super(driver);
    }

    public void clickPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnPurchases);
    }
    public void clickListPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnListPurchases);
    }
    public void clickAddPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnAddPurchases);
    }

}
