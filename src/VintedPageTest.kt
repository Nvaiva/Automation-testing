import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue


class VintedPageTest {

    private lateinit var driver: WebDriver
    private lateinit var vintedPage: VintedPage


    @BeforeMethod
    fun setUp() {
        driver = ChromeDriver()
        vintedPage = VintedPage(driver)
        vintedPage.open()
    }

    @AfterMethod
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun emptyTest() {
        val validatePrice = ValidatePrice(driver)
        validatePrice.clickOnWomanTab()
        validatePrice.clickOnAllClothesTab()
        validatePrice.clickOnPriceTab()
        validatePrice.inputToPriceFrom()
    }

    @Test
    fun titleValidation() {
        assertTrue("Vinted | Pirk ir parduok drabužius, avalynę ir aksesuarus" == driver.getTitle())
    }

}