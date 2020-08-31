import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory
import kotlin.test.assertTrue

class ValidatePrice(private val driver: WebDriver) {

    @FindBy(xpath = "//a[contains(text(),'Moteriški')]")
    private lateinit var womanTab: WebElement

    @FindBy(xpath = "(//a[contains(@href, '/moteriski/drabuziai')])[3]")
    private lateinit var allClothesTab: WebElement

    @FindBy(xpath = "//div[5]/div/button/span/span/span")
    private lateinit var priceTab: WebElement

    @FindBy(xpath = "//input[@id='price_from']")
    private lateinit var priceFrom: WebElement

    @FindBy(xpath = "//input[@id='price_to']")
    private lateinit var priceTo: WebElement

    init {
        PageFactory.initElements(AjaxElementLocatorFactory(driver, 15), this)
    }

    fun clickOnWomanTab() {
        womanTab.click()
    }

    fun clickOnAllClothesTab() {
        allClothesTab.click()
    }

    fun clickOnPriceTab() {
        priceTab.click()
    }

    fun inputToPriceFrom() {
        priceFrom.sendKeys("-5")
        priceFrom.sendKeys(Keys.ENTER)
        assertTrue(driver.currentUrl.contains("price_from=5"))
    }
    fun inputToPriceTo(){
        priceTo.sendKeys(".")
        priceTo.sendKeys(Keys.ENTER)
        assertTrue(driver.currentUrl.contains("price_from=0.00"))
    }

}