import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;

public class QuestionTests {

    private WebDriver driver;
    @Test
    public void check1stQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickFirstQuestion();
        String actualQuestionText = objMainPage.textPanelFirst();
        String exceptedQuestionText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }

    @Test
    public void check2ndQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickSecondQuestion();
        String actualQuestionText = objMainPage.textPanelSecond();
        String exceptedQuestionText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
        }
    @Test
    public void check3thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickThirdQuestion();
        String actualQuestionText = objMainPage.textPanelThird();
        String exceptedQuestionText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }

    @Test
    public void check4thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickFourthQuestion();
        String actualQuestionText = objMainPage.textPanelFourth();
        String exceptedQuestionText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }
    @Test
    public void check5thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickFifthQuestion();
        String actualQuestionText = objMainPage.textPanelFifth();
        String exceptedQuestionText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }
    @Test
    public void check6thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickSixthQuestion();
        String actualQuestionText = objMainPage.textPanelSixth();
        String exceptedQuestionText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }
    @Test
    public void check7thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickSeventhQuestion();
        String actualQuestionText = objMainPage.textPanelSeventh();
        String exceptedQuestionText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }
    @Test
    public void check8thQuestions() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollPageDown();
        objMainPage.clickEighthQuestion();
        String actualQuestionText = objMainPage.textPanelEighth();
        String exceptedQuestionText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MatcherAssert.assertThat(actualQuestionText, is(exceptedQuestionText));
        driver.quit();
    }

}
