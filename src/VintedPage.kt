import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory

class VintedPage(private val driver: WebDriver) {

    fun open() {
        driver.get("https://www.vinted.lt/")
    }

}