package homePage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import base.BaseTests;
import pages.HomePage;
import pages.LoginPage;



public class HomePageTests extends BaseTests {
    public HomePageTests(WebDriver driver){
        BaseTests.driver = driver;
    }
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void testarLoginUsuario(){
        carregarPaginaInicial();

        loginPage = homePage.clicarBotaoSignIn();
        loginPage.preencherEmail("silvanis@teste.com");
        loginPage.preencherPassword("123456");
        loginPage.clicarBotaoSignIn();

        assertThat(homePage.estaLogado("Silvanis Silva"), is(true));
        carregarPaginaInicial();
    }
}
