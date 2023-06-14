package test;

import core.baseTest;
import function.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class final_test extends baseTest  {
    public common_function commonFunction;
    public login_function loginFunction;
    public dashboard_function dashboardFunction;
    public product_function productFunction;
    public sale_function saletFunction;
    public listProducts_function listprofuctsFunction;
    public detailProduct_function detailProductFunction;
    public editProduct_function editProductFunction;
    public printBarcodes_function printBarcodesFunction;
    public addSale_function addSaletFunction;
    public purchases_function purchasesFunction;
    public listPurchases_function listPurchasesFunction;
    public addPurchases_function addPurchasesFunction;


    //Verify Login page
    @Test
    public void TC_01() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.verifyLoginPage();
    }
    //Verify successfully logged in
    @Test
    public void TC_02() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
    }

    //Verify List Products
    @Test
    public void TC_03() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
        productFunction = new product_function(driver);
        productFunction.clickProductsButton();                              //click button product
        productFunction.clickListProductsButton();                          //click button list product

        // navigate to list product page
        listprofuctsFunction = new listProducts_function(driver);
        listprofuctsFunction.verifyListProductsPage();                      //verify list products page
    }

    //Verify view product detail
    @Test
    public void TC_04() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
        productFunction = new product_function(driver);
        productFunction.clickProductsButton();                              //click button product
        productFunction.clickListProductsButton();                          //click button list product

        // navigate to list product page
        listprofuctsFunction = new listProducts_function(driver);
        listprofuctsFunction.verifyListProductsPage();                      //verify list products page
        listprofuctsFunction.clickLemonProduct();                           //click lemon product

        // website show detail product page
        detailProductFunction = new detailProduct_function(driver);
        detailProductFunction.verifyDetailProducPage();                     // verify detail product page
    }

    //Verify Edit product
    @Test
    public void TC_05() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
        productFunction = new product_function(driver);
        productFunction.clickProductsButton();                              //click button product
        productFunction.clickListProductsButton();                          //click button list product

        // navigate to list product page
        listprofuctsFunction = new listProducts_function(driver);
        listprofuctsFunction.verifyListProductsPage();                      //verify list products page
        listprofuctsFunction.clickMouseProduct();                           //click lemon product

        // website show detail product page
        detailProductFunction = new detailProduct_function(driver);
        detailProductFunction.verifyDetailProducPage();                     // verify detail product page
        detailProductFunction.clickEditButton();                            //click button edit product

        // navigate to edit product page
        editProductFunction = new editProduct_function(driver);
        editProductFunction.verifyEditProductPage();                        //verify product page
        editProductFunction.selectProductType("Combo");                     //select product type
        editProductFunction.selectBarcode("EAN8");                          //select barcode
        editProductFunction.selectTaxMethod("Exclusive");                   //select tax method
        editProductFunction.clickEditProduct();                             //click button edit product after editing
        Assert.assertTrue(false);
    }

    //Verify Print Barcode/Label page
    @Test
    public void TC_06() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
        productFunction = new product_function(driver);
        productFunction.clickProductsButton();                              //click button product
        productFunction.clickPrintBarcodeButton();                          //click button list product

        // navigate to print barcode page
        printBarcodesFunction = new printBarcodes_function(driver);
        printBarcodesFunction.verifyPrintBarcodesPage();                 //print barcode page
    }

    //Verify create Print Barcode/Label successfully
    @Test
    public void TC_07() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();                           //verify dashboard page
        productFunction = new product_function(driver);
        productFunction.clickProductsButton();                              //click button product
        productFunction.clickPrintBarcodeButton();                          //click button list product

        // navigate to print barcode page
        printBarcodesFunction = new printBarcodes_function(driver);
        printBarcodesFunction.verifyPrintBarcodesPage();                 //print barcode page
        printBarcodesFunction.inputNameItem("Kiwi");                    // input name
        commonFunction.sleep(3000);
        printBarcodesFunction.selectStyle("18 per sheet (a4) (2.5\" x 1.835\")");   //select style
        printBarcodesFunction.selectSiteName();                                     //select site name
        printBarcodesFunction.selectProductName();                                  //select product name
        printBarcodesFunction.selectCurrencies();                                  //select currencies
        printBarcodesFunction.selectPrice();                                        //select price
        printBarcodesFunction.selectUnit();                                         //select unit
        printBarcodesFunction.selectCategory();                                     //select category
        printBarcodesFunction.selectVariants();                                     //select variants
        printBarcodesFunction.selectProductImage();                                  //select product image
        printBarcodesFunction.selectPromotionalPrice();                               //select promotional price
        printBarcodesFunction.clickUpdateButton();                                     //click button update
        printBarcodesFunction.verifyBarcode();                                          //verify barcode after update
    }

    //Verify add Sale successfully
    @Test
    public void TC_08() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();
        commonFunction.sleep(2000);//verify dashboard page
        saletFunction = new sale_function(driver);
        saletFunction.clickButtonSale();                                  //click button sale
        commonFunction.sleep(2000);
        saletFunction.clickButtonAddSale();                                  //click button add sale
        commonFunction.sleep(3000);

        // navigate to add sale page
        addSaletFunction = new addSale_function(driver);
//        addSaletFunction.selectCustomer();                 //print barcode page
//        commonFunction.sleep(10000) ;                    // time to select customer and product
//        addSaletFunction.clicksubmitButton();
        commonFunction.sleep(3000);
        addSaletFunction.clickCustomer();
    }

    //Verify Purchases List
    @Test
    public void TC_09() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();
        commonFunction.sleep(2000);//verify dashboard page

        // navigate to purchases page
        purchasesFunction = new purchases_function(driver);
        purchasesFunction.clickPurchasesButton();                   //click button purchases
        commonFunction.sleep(2000);
        purchasesFunction.clickListPurchasesButton();               //click button purchases
        commonFunction.sleep(2000);

        // navigate to list purchases page
        listPurchasesFunction = new listPurchases_function(driver);
        listPurchasesFunction.checkDateFormat();                    //check date format
        listPurchasesFunction.checkSortDESC();                      //check ID sort by DESC
        listPurchasesFunction.checkTotalInTable();                  //check total row in table

    }

    //Verify add Purchases successfully
    @Test
    public void TC_10() {
        // login to website by username and password
        loginFunction = new login_function(driver);
        commonFunction = new common_function(driver);
        loginFunction.Login("admin@tecdiary.com", "12345678"); //inter username and password

        // navigate to dashboard page
        dashboardFunction = new dashboard_function(driver);
        dashboardFunction.verifyDashboardPage();
        commonFunction.sleep(2000);//verify dashboard page

        // navigate to purchases page
        purchasesFunction = new purchases_function(driver);
        purchasesFunction.clickPurchasesButton();
        purchasesFunction.clickAddPurchasesButton();                //click add purchase button
        commonFunction.sleep(2000);
        //navigate to add purchases page
        addPurchasesFunction = new addPurchases_function(driver);
        commonFunction.sleep(10000);                             //time to select Supplier and product
        addPurchasesFunction.clickSubmitButton();                       //click submit button

    }
}
