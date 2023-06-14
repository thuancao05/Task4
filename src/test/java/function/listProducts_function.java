package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import page.listProducts_page;

public class listProducts_function extends basePage {
    public listProducts_page listproductsPage = new listProducts_page();
    public common_function commonFunction = new common_function(getDriver());
    public listProducts_function(WebDriver driver) {
        super(driver);
    }

    public void verifyListProductsPage(){
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnImage));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnCode));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnName));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnBrand));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnCategory));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnUnit));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnQuantity));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnPrice));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnCost));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnAlertQuantity));
        Assert.assertTrue(commonFunction.isDisplayed(listproductsPage.columnAction));
        System.out.println("Verify List Products Page");
    }

    //ham chon show all sau khi click show
    public void selectShowAll(){    //nut select nay bi an, nen phai xoa attribute style = "display:none" truoc khi thao tac
        commonFunction.removeAttribute(listproductsPage.cbShow, "style");       //xoa attribute style = "display:none"

        // chon ALL
        WebElement showAllTxtBox = getWait().until(ExpectedConditions.visibilityOfElementLocated(listproductsPage.cbShow));
        Select selectShowAll = new Select(showAllTxtBox);
        selectShowAll.selectByValue("-1");

        commonFunction.setAttribute(listproductsPage.cbShow,"style", "display:none"); //thiet lap lai attribute style = "display:none"
        commonFunction.sleep(3000);
    }
    //ham click san pham lemon
    public void clickLemonProduct(){
        selectShowAll();
        commonFunction.clicks(listproductsPage.lemonProduct);
    }
    //ham click san pham mouse
    public void clickMouseProduct(){
        selectShowAll();
        commonFunction.clicks(listproductsPage.mouseProduct);
    }

}
