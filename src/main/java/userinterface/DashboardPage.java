package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage extends PageObject {
    public static final Target NAME_PAGE = Target.the("name of the page").located(By.xpath("//h1[contains(text(), 'Dashboard')]"));
    public static final Target ORGANIZATION_MENU = Target.the("organization item of the menu").located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target UNITS_LINK = Target.the("link of the business items").located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target NEW_UNIT_BUTTON = Target.the("button to create a new business unit").located(By.xpath("//span[contains(text(), ' New Business Unit')]"));
    public static final Target NAME_INPUT = Target.the("where do we write the name of the new business item").located(By.name("Name"));
    public static final Target PARENT_SELECT = Target.the("select the parent of the business unit").located(By.xpath("//span[@class='select2-arrow']"));
    public static final Target PARENT_TECH = Target.the("select the parent of the business unit").located(By.xpath("//div[@id='select2-drop']//ul//li[6]"));
    public static final Target CREATE_BUTTON = Target.the("button to create the business unit or meeting").located(By.xpath("//span[contains(text(), ' Save')]"));

}
