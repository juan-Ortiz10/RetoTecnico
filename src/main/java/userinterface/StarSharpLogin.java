package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpLogin extends PageObject {
    public static final Target USER_INPUT = Target.the("where do we write the username").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target PASSWORD_INPUT = Target.the("where do we write the password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target LOGIN_BUTTON = Target.the("button to confirm login").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
    public static final Target TOAST_ERROR = Target.the("toast of wrong login").located(By.className("toast-message"));
}
