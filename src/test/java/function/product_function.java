package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import page.product_page;

public class product_function extends basePage {
    public product_page productPage = new product_page();
    public common_function commonFunction = new common_function(getDriver());
    public product_function(WebDriver driver) {
        super(driver);
    }

    //ham click nut products
    public void clickProductsButton(){
        commonFunction.clicks(productPage.btnProducts);
    }

    //ham click nut list product sau khi da click nut product
    public void clickListProductsButton(){
        commonFunction.clicks(productPage.btnListProducts);
    }
    //ham click nut print barcode/label sau khi da click nut product
    public void clickPrintBarcodeButton(){
        commonFunction.clicks(productPage.btnPrintBarcode);
    }


}
