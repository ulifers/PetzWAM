package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; // objeto local para a comunicação com o objeto da classe extendida (o Selenium)

    // Construtor para a clase base
    public Hooks(Base base) {
        super (base.driver);
        this.base = base;
    }

    // Before
    @Before
    public void setup(){
        // onde esta drive do browser
        System.setProperty("Webdriver.chrome.driver", "divers/chrome/88/chromedriver.exe");
        // Instanciar o driver do Chrome
        base.driver = new ChromeDriver();

        // Maximizar a tela
        base.driver.manage().window().maximize();

        // Definir a espera implicita do selenium Webdriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

    }

    // After
    @After
    public void tearDown(){
        base.driver.quit(); // Destruir o objeto do selenium

    }
}
