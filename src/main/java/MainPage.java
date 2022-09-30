import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class MainPage {
    private WebDriver driver;

// Баннер-предупреждение об использовании Cookie
    private By cookieMessage = By.className("App_CookieButton__3cvqF");

// Заголовок раздела "Вопросы о важном"
    private By titleTextQuestions = By.className("Home_SubHeader__zwi_E");

// Вопросы раздела (с 1ого до 8ого)
    private By firstQuestion = By.id("accordion__heading-0");
    private By secondQuestion = By.id("accordion__heading-1");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By eighthQuestion = By.id("accordion__heading-7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


// Методы кликов на вопросы (от 1 до 8)
    public void clickFirstQuestion() {
        driver.findElement(firstQuestion).click();
    }
    public void clickSecondQuestion() {
        driver.findElement(secondQuestion).click();
    }
    public void clickThirdQuestion() {
        driver.findElement(thirdQuestion).click();
    }
    public void clickFourthQuestion() {
        driver.findElement(fourthQuestion).click();
    }
    public void clickFifthQuestion() {
        driver.findElement(fifthQuestion).click();
    }
    public void clickSixthQuestion() {
        driver.findElement(sixthQuestion).click();
    }
    public void clickSeventhQuestion() {
        driver.findElement(seventhQuestion).click();
    }
    public void clickEighthQuestion() {
        driver.findElement(eighthQuestion).click();
    }

//методы getText из панелей вопросов
    public String textPanelFirst() {
        return driver.findElement(By.id("accordion__panel-0")).getText();
    }
    public String textPanelSecond() {
        return driver.findElement(By.id("accordion__panel-1")).getText();
    }
    public String textPanelThird() {
        return driver.findElement(By.id("accordion__panel-2")).getText();
    }
    public String textPanelFourth() {
        return driver.findElement(By.id("accordion__panel-3")).getText();
    }
    public String textPanelFifth() {
        return driver.findElement(By.id("accordion__panel-4")).getText();
    }
    public String textPanelSixth() {
        return driver.findElement(By.id("accordion__panel-5")).getText();
    }
    public String textPanelSeventh() {
        return driver.findElement(By.id("accordion__panel-6")).getText();
    }
    public String textPanelEighth() {
        return driver.findElement(By.id("accordion__panel-7")).getText();
    }

    public void clickCookieButton() {
        driver.findElement(cookieMessage).click();
    }

}
