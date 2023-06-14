package page;

import org.openqa.selenium.By;

public class addSale_page {
    public static By selectCustomer = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
    public static By txtCustomser = By.xpath("//input[@id='s2id_autogen12_search']");
    public static By dropCustomer = By.xpath("//div[@id='select2-drop']");
    public static By clickCustomer = By.xpath("//body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]");
    public static By seCus = By.xpath("//div[@id='s2id_slcustomer']");
    public static By btnSubmit = By.xpath("//input[@id='add_sale']");
}
