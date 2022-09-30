import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import static org.hamcrest.CoreMatchers.is;

public class QuestionTests {

    private WebDriver driver;

    @Test
    public void checkQuestions() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
//время ожидания 3 секунды
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("App_CookieButton__3cvqF")));

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCookieButton();
//скролл вниз
        WebElement element = driver.findElement(By.id("accordion__heading-7"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//тестовые данные
        String firstQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String secondQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String thirdQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String fourthQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String fifthQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String sixthQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String seventhQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String eighthQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

//создал объект
        MainPage objPanel = new MainPage(driver);

//клик первого вопроса + тест
        objMainPage.clickFirstQuestion();

        String textFirstPanel = objPanel.textPanelFirst();
        MatcherAssert.assertThat(textFirstPanel, is(firstQuestionText));

//клик второго вопроса + тест
        objMainPage.clickSecondQuestion();

        String textSecondPanel = objPanel.textPanelSecond();
        MatcherAssert.assertThat(textSecondPanel, is(secondQuestionText));

//клик третьего вопроса + тест
        objMainPage.clickThirdQuestion();

        String textThirdPanel = objPanel.textPanelThird();
        MatcherAssert.assertThat(textThirdPanel, is(thirdQuestionText));

//клик четвертого вопроса + тест
        objMainPage.clickFourthQuestion();

        String textFourthPanel = objPanel.textPanelFourth();
        MatcherAssert.assertThat(textFourthPanel, is(fourthQuestionText));

//клик пятого вопроса + тест
        objMainPage.clickFifthQuestion();

        String textFifthPanel = objPanel.textPanelFifth();
        MatcherAssert.assertThat(textFifthPanel, is(fifthQuestionText));

//клик шестого вопроса + тест
        objMainPage.clickSixthQuestion();

        String textSixthPanel = objPanel.textPanelSixth();
        MatcherAssert.assertThat(textSixthPanel, is(sixthQuestionText));

//клик седьмого вопроса + тест
        objMainPage.clickSeventhQuestion();

        String textSeventhPanel = objPanel.textPanelSeventh();
        MatcherAssert.assertThat(textSeventhPanel, is(seventhQuestionText));

//клик восьмого вопроса + тест
        objMainPage.clickEighthQuestion();

        String textEighthPanel = objPanel.textPanelEighth();
        MatcherAssert.assertThat(textEighthPanel, is(eighthQuestionText));

        driver.quit();

    }

}
