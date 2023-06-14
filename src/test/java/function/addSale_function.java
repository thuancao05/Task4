package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.addSale_page;
import org.openqa.selenium.Keys;

public class addSale_function extends basePage {
    public addSale_page addSalePage = new addSale_page();
    public common_function commonFunction = new common_function(getDriver());
    public addSale_function(WebDriver driver) {
        super(driver);
    }


    public void clickCustomer(){
        WebElement element = getDriver().findElement(addSalePage.seCus);
        element.click();
    }


    //ham chon customer
    public void selectCustomer(){
//        commonFunction.jsClick(addSalePage.seCus);
//        commonFunction.jsSendKey(addSalePage.txtCustomser, "hahahaha");
//        commonFunction.sleep(1000);
//        commonFunction.press(Keys.ENTER);
//        commonFunction.removeAttribute(addSalePage.selectCustomer, "class");
//        commonFunction.removeAttribute(addSalePage.seCus, "class");
//        commonFunction.clicks(addSalePage.seCus);
//        commonFunction.setAttribute(addSalePage.selectCustomer,"class", "select2-drop select2-with-searchbox select2-drop-active"); //thiet lap lai attribute style = "display:none"
//        commonFunction.clicks(addSalePage.selectCustomer);
//        commonFunction.sendKeys(addSalePage.txtCustomser, "1");
//
//
//        commonFunction.sleep(2000);
//        commonFunction.press(Keys.ENTER);
//        commonFunction.removeAttribute(addSalePage.dropCustomer, "class");

    }

    //ham click submit
    public void clicksubmitButton(){
        commonFunction.clicks(addSalePage.btnSubmit);
    }
}
