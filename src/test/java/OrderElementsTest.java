import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderElementsTest {

    private WebDriver driver;

    @Test

    public void createOrder() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
// время ожидания 3 сек
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("App_CookieButton__3cvqF")));

        OrderElements objOrderElements = new OrderElements(driver);
        objOrderElements.clickCookieButton();
// клик на кнопку "Заказать"-------------------------------
        objOrderElements.clickTopOrderButton();
// заполнение первой страницы заказа
        objOrderElements.fillFirstPage(
                "Артем",
                "Носарев",
                "Черниковская 77, 88",
                "+79173232323");
// заполнение второй страницы заказа
        objOrderElements.fillSecondPage(
                "Домофон не работает");

// подтверждение оформления заказа
        objOrderElements.clickYesButton();

// Главная страница
        driver.get("https://qa-scooter.praktikum-services.ru/");

// Скролл вниз
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_FinishButton__1_cWm")));

// Оформление заказа через нижнюю кнопку --------------------------
        objOrderElements.clickBottomOrderButton();
        objOrderElements.fillFirstPage(
                "Кирилл",
                "Носарев",
                "Победы 22, 5",
                "+79171212312");
        objOrderElements.fillSecondPage(
                "Communication is disabled");
        objOrderElements.clickYesButton();

        driver.quit();
    }

}
