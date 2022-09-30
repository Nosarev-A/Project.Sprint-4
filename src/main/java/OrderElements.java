import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


class OrderElements {
    private WebDriver driver;

// Кнопки "Заказать" (верхняя и нижняя кнопка)
    private By topOrderButton = By.className("Button_Button__ra12g");
    private By bottomOrderButton = By.className("Home_FinishButton__1_cWm");
    private By cookieMessage = By.className("App_CookieButton__3cvqF");


// #1. Первая страница оформления заказа ---------------------------------------
    // Заголовок заказа "Для кого самокат"
    private By orderHeaderText = By.className("Order_Header__BZXOb");

    // Поля для ввода данных заказа
    private By orderFirstName = By.xpath(".//input[@placeholder='* Имя']");
    private By orderSecondName = By.xpath(".//input[@placeholder='* Фамилия']");
    private By orderAddressPoint = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By orderMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private By orderMetroBulvar = By.xpath(".//div[@class='Order_Text__2broi']");
    private By orderContactPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Кнопка "Далее" >>>> "Заказать" >>>> "Да" ---------------
    private By orderNextButton = By.xpath(".//button[text()='Далее']");
    private By orderZakazButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Заказать')]");

// #2. Вторая страница оформления заказа -----------------------------------
    // Заголовок оформления заказа "Про аренду"
    private By orderHeaderTextSecondPage = By.className("Order_Header__BZXOb");

    // Поля для ввода данных заказа
    private By orderWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By orderWhenCalendar = By.xpath(".//div[@aria-label='Choose среда, 28-е сентября 2022 г.']");
    private By orderHowLong = By.className("Dropdown-placeholder");
    private By orderHowLongTwoDays = By.xpath(".//div[text()='двое суток']");
    private By orderColorBlack = By.xpath(".//label[@for='black']");
    private By orderCommentCour = By.xpath(".//input[@placeholder='Комментарий для курьера']");

// #3. "Хотите оформить заказ?" ------------------------------------------
    // Заголовок подтверждения оформления заказа
    private By orderAskingText = By.className("Order_ModalHeader__3FDaJ");
    // Кнопка "Да"
    private By orderYesButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Да')]");
    // "Заказ оформлен"
    private By orderDoneHeader = By.className("Order_ModalHeader__3FDaJ");





    public OrderElements(WebDriver driver) {
        this.driver = driver;
    }

// Методы кликов на кнопки -----------------------------------------------
    public void clickCookieButton() {
        driver.findElement(cookieMessage).click();
    }
    // Метод клика на верхний "Заказ"
    public void clickTopOrderButton() {
        driver.findElement(topOrderButton).click();
    }
    // Метод клика на нижний "Заказ"
    public void clickBottomOrderButton() {
        driver.findElement(bottomOrderButton).click();
    }

    // Метод клика на кнопку "Далее" >>>> "Заказать" >>>> "Да" --------------
    public void clickNextButton() {
        driver.findElement(orderNextButton).click();
    }
    public void clickZakazButton() {
        driver.findElement(orderZakazButton).click();
    }
    public void clickYesButton() {
        driver.findElement(orderYesButton).click();
    }

    // Ввод Имя
    public void setFirstName(String firstName) {
        driver.findElement(orderFirstName).sendKeys(firstName);
    }
    // Ввод Фамилия
    public void setSecondName(String secondName) {
        driver.findElement(orderSecondName).sendKeys(secondName);
    }
    // Ввод адреса
    public void setAddressPoint(String addressPoint) {
        driver.findElement(orderAddressPoint).sendKeys(addressPoint);
    }
    // Метод клика на список станций метро
    public void clickMetroStation() {
        driver.findElement(orderMetroStation).click();
    }
    // Ввод станции метро
    public void clickMetroBulvar() {
        driver.findElement(orderMetroBulvar).click();
    }
    // Ввод номера телефона
    public void setOrderContactPhone(String contactPhone) {
        driver.findElement(orderContactPhone).sendKeys(contactPhone);
    }

    public void clickWhen() {
        driver.findElement(orderWhen).click();
    }
    public void clickWhenCalendar() {
        driver.findElement(orderWhenCalendar).click();
    }
    public void clickHowLong() {
        driver.findElement(orderHowLong).click();
    }
    public void clickHowLongTwoDays() {
        driver.findElement(orderHowLongTwoDays).click();
    }
    public void clickColorBlack() {
        driver.findElement(orderColorBlack).click();
    }
    public void setCommentCour(String commentCour) {
        driver.findElement(orderCommentCour).sendKeys(commentCour);
    }


// Объединение методов
    public void fillFirstPage(String firstName, String secondName, String addressPoint, String contactPhone) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAddressPoint(addressPoint);
        setOrderContactPhone(contactPhone);
        clickMetroStation();
        clickMetroBulvar();
        clickNextButton();
    }
    public void fillSecondPage(String commentCour) {
        clickWhen();
        clickWhenCalendar();
        clickHowLong();
        clickHowLongTwoDays();
        clickColorBlack();
        setCommentCour(commentCour);
        clickZakazButton();
    }

}
