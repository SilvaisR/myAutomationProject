package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By botaoSignIn = By.className("user-info");
    private final By usuarioLogado = By.cssSelector("#_desktop_user_info span.hidden-sm-down");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clicarBotaoSignIn() {
        driver.findElement(botaoSignIn).click();
        return new LoginPage(driver);
    }

    public boolean estaLogado(String texto) {
        return texto.contentEquals(driver.findElement(usuarioLogado).getText());
    }

}
